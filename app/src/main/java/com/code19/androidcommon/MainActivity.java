/*
 *   Copyright (C)  2016 android@19code.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.code19.androidcommon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.code19.androidcommon.ui.activity.AppManagerActivity;
import com.code19.androidcommon.ui.activity.DeviceActivity;
import com.code19.androidcommon.ui.activity.VirificationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ghost";
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button virification = (Button) findViewById(R.id.virification);
        Button deviceutils = (Button) findViewById(R.id.deviceutils);
        Button systemutils = (Button) findViewById(R.id.systemutils);
        Button netutils = (Button) findViewById(R.id.netutils);
        Button fileutils = (Button) findViewById(R.id.fileutils);
        Button densityutils = (Button) findViewById(R.id.densityutils);
        Button apputils = (Button) findViewById(R.id.apputils);
        systemutils.setOnClickListener(this);
        netutils.setOnClickListener(this);
        fileutils.setOnClickListener(this);
        densityutils.setOnClickListener(this);
        apputils.setOnClickListener(this);
        deviceutils.setOnClickListener(this);
        virification.setOnClickListener(this);
        DisplayMetrics dm = new DisplayMetrics();
        dm = getResources().getDisplayMetrics();
        // 获取屏幕密度（方法3）
        dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        float density = dm.density;        // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        density = dm.density;      // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        int screenWidth = (int) (dm.widthPixels * density + 0.5f);      // 屏幕宽（px，如：480px）
        int screenHeight = (int) (dm.heightPixels * density + 0.5f);     // 屏幕高（px，如：800px）

        Log.e(TAG, "  DisplayMetrics(222)" + "screenWidth=" + screenWidth + "; screenHeight=" + screenHeight);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.apputils:
                startActivity(new Intent(MainActivity.this, AppManagerActivity.class));
                break;
            case R.id.deviceutils:
                startActivity(new Intent(MainActivity.this, DeviceActivity.class));
                break;
            case R.id.densityutils:
                break;
            case R.id.fileutils:
                break;
            case R.id.netutils:
                break;
            case R.id.systemutils:
                break;
            case R.id.virification:
                startActivity(new Intent(MainActivity.this, VirificationActivity.class));
                break;
        }
    }
}
