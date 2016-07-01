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
import android.view.View;
import android.widget.Button;

import com.code19.androidcommon.ui.activity.AppManagerActivity;
import com.code19.androidcommon.ui.activity.DeviceActivity;
import com.code19.androidcommon.ui.activity.VerificationActivity;
import com.code19.library.FileUtils;
import com.code19.library.L;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
        Button logutils = (Button) findViewById(R.id.logutils);
        Button apputils = (Button) findViewById(R.id.apputils);
        systemutils.setOnClickListener(this);
        netutils.setOnClickListener(this);
        fileutils.setOnClickListener(this);
        logutils.setOnClickListener(this);
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
            case R.id.logutils:
                testLog();
                break;
            case R.id.fileutils:
                String url = "http://3lin9.19code.com/app.apk";
                FileUtils.upgradeApp(MainActivity.this, url);
                break;
            case R.id.netutils:
                break;
            case R.id.systemutils:
                break;
            case R.id.virification:
                startActivity(new Intent(MainActivity.this, VerificationActivity.class));
                break;
        }
    }

    private String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!--  Copyright w3school.com.cn --><note><to>George</to><from>John</from><heading>Reminder</heading><body>Don't forget the meeting!</body></note>";
    private String json = "{'type1': {'0': {'age': 12,'name': 'zhangsdan'},'1': {'age': 13,'name': 'lisi'},'num': '123'},'type3': {'0': {'age': 14,'name': 'wangwu'},'1': {'age': 15,'name': 'maliu'},'num': '456',}}";

    private void testLog() {
        L.init(true, "admin");
        L.v("Verbose...");
        L.d("Debug...");
        L.i("info。。。");
        L.w("Warn...");
        L.e("Error...");
        L.a("ASSERT...");
        L.json(json);
        L.xml(xml);
    }
}
