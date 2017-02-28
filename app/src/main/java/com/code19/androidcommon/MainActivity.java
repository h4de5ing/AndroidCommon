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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.code19.androidcommon.ui.activity.AppManagerActivity;
import com.code19.androidcommon.ui.activity.DeviceActivity;
import com.code19.androidcommon.ui.activity.VerificationActivity;
import com.code19.library.FileUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout mMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMain = (LinearLayout) findViewById(R.id.main);
        Button virification = (Button) findViewById(R.id.virification);
        Button deviceutils = (Button) findViewById(R.id.deviceutils);
        Button testutils = (Button) findViewById(R.id.testutils);
        Button fileutils = (Button) findViewById(R.id.fileutils);
        Button apputils = (Button) findViewById(R.id.apputils);
        testutils.setOnClickListener(this);
        fileutils.setOnClickListener(this);
        apputils.setOnClickListener(this);
        deviceutils.setOnClickListener(this);
        virification.setOnClickListener(this);
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
            case R.id.fileutils:
                String url = "http://3lin9.19code.com/app.apk";
                FileUtils.upgradeApp(MainActivity.this, url);
                break;
            case R.id.testutils:
                //Bitmap bitmap = ViewUtils.createViewBitmap(mMain);
                //ImageUtils.bitmap2gallery(this, bitmap, "main.png");
                break;
            case R.id.virification:
                startActivity(new Intent(MainActivity.this, VerificationActivity.class));
                break;
        }
    }
}
