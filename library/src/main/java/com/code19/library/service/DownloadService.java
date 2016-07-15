package com.code19.library.service;

import android.app.DownloadManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;

import com.code19.library.AppUtils;
import com.code19.library.L;

public class DownloadService extends Service {

    private long mTaskId;
    private DownloadManager mDownloadManager;
    private String filePath;

    public DownloadService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        L.w("onStartCommand:" + intent.getStringExtra("fileurl"));
        String fileurl = intent.getStringExtra("fileurl");
        downloadFile(fileurl);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void downloadFile(String fileurl) {
        filePath = "/sdcard/Download/" + fileurl.substring(fileurl.lastIndexOf("/") + 1);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fileurl));
        request.setDestinationInExternalPublicDir("/Download/", fileurl.substring(fileurl.lastIndexOf("/") + 1));
        mDownloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        mTaskId = mDownloadManager.enqueue(request);
        registerReceiver(mReceiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            checkDownloadStatus();
        }
    };

    private void checkDownloadStatus() {
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(mTaskId);
        Cursor c = mDownloadManager.query(query);
        if (c.moveToFirst()) {
            int status = c.getInt(c.getColumnIndex(DownloadManager.COLUMN_STATUS));
            switch (status) {
               /* case DownloadManager.STATUS_PAUSED:
                    break;
                case DownloadManager.STATUS_FAILED:
                    break;
                case DownloadManager.STATUS_PENDING:
                    break;
                case DownloadManager.STATUS_RUNNING:
                    break;*/
                case DownloadManager.STATUS_SUCCESSFUL:
                    AppUtils.installApk(this, filePath);
                    break;
            }
        }


    }
}
