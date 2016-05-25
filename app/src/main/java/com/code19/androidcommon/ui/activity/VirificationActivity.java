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

package com.code19.androidcommon.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.code19.androidcommon.R;

public class VirificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virification);
        Button virsubmit = (Button) findViewById(R.id.vir_submit);
        EditText virisnumber = (EditText) findViewById(R.id.vir_isnumber);
        EditText viridcard = (EditText) findViewById(R.id.vir_idcard);
        EditText vircardnumber = (EditText) findViewById(R.id.vir_cardnumber);
        EditText virurl = (EditText) findViewById(R.id.vir_url);
        EditText virip = (EditText) findViewById(R.id.vir_ip);
        EditText viremail = (EditText) findViewById(R.id.vir_email);
        EditText virpassword2 = (EditText) findViewById(R.id.vir_password2);
        EditText virpassword = (EditText) findViewById(R.id.vir_password);
        EditText viraccount = (EditText) findViewById(R.id.vir_account);
        EditText virphonenumber = (EditText) findViewById(R.id.vir_phonenumber);
        EditText virname = (EditText) findViewById(R.id.vir_name);
        if (virsubmit != null) {
            virsubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
