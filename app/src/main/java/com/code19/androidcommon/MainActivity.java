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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ghost";
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button systemutils = (Button) findViewById(R.id.systemutils);
        Button netutils = (Button) findViewById(R.id.netutils);
        Button jsonutils = (Button) findViewById(R.id.jsonutils);
        Button fileutils = (Button) findViewById(R.id.fileutils);
        Button dateutils = (Button) findViewById(R.id.dateutils);
        Button densityutils = (Button) findViewById(R.id.densityutils);
        Button bitmaputils = (Button) findViewById(R.id.bitmaputils);
        Button cacheutils = (Button) findViewById(R.id.cacheutils);
        Button apputils = (Button) findViewById(R.id.apputils);
        systemutils.setOnClickListener(this);
        netutils.setOnClickListener(this);
        jsonutils.setOnClickListener(this);
        fileutils.setOnClickListener(this);
        dateutils.setOnClickListener(this);
        densityutils.setOnClickListener(this);
        bitmaputils.setOnClickListener(this);
        cacheutils.setOnClickListener(this);
        apputils.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.apputils:
                startActivity(new Intent(MainActivity.this, AppManager.class));
                break;
            case R.id.cacheutils:
                break;
            case R.id.bitmaputils:
                break;
            case R.id.densityutils:
                break;
            case R.id.dateutils:
                break;
            case R.id.fileutils:
                break;
            case R.id.jsonutils:
                break;
            case R.id.netutils:
                break;
            case R.id.systemutils:
                break;
        }
    }
}
