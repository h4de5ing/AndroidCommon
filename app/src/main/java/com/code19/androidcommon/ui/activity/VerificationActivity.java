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
import com.code19.library.VerificationUtils;

public class VerificationActivity extends AppCompatActivity {

    private EditText mVirisnumber;
    private EditText mVirname;
    private EditText mVirphonenumber;
    private EditText mViraccount;
    private EditText mVirpassword;
    private EditText mVirpassword2;
    private EditText mViremail;
    private EditText mVirip;
    private EditText mVirurl;
    private EditText mViridcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virification);
        Button virsubmit = (Button) findViewById(R.id.vir_submit);
        mVirisnumber = (EditText) findViewById(R.id.vir_isnumber);
        mViridcard = (EditText) findViewById(R.id.vir_idcard);
        mVirurl = (EditText) findViewById(R.id.vir_url);
        mVirip = (EditText) findViewById(R.id.vir_ip);
        mViremail = (EditText) findViewById(R.id.vir_email);
        mVirpassword2 = (EditText) findViewById(R.id.vir_password2);
        mVirpassword = (EditText) findViewById(R.id.vir_password);
        mViraccount = (EditText) findViewById(R.id.vir_account);
        mVirphonenumber = (EditText) findViewById(R.id.vir_phonenumber);
        mVirname = (EditText) findViewById(R.id.vir_name);
        if (virsubmit != null) {
            virsubmit.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (!VerificationUtils.matcherRealName(mVirname.getText().toString())) {
                                mVirname.setError("姓名不匹配");
                            } else if (!VerificationUtils.matcherPhoneNum(mVirphonenumber.getText().toString())) {
                                mVirphonenumber.setError("电话号码不匹配");
                            } else if (!VerificationUtils.matcherAccount(mViraccount.getText().toString())) {
                                mViraccount.setError("账号不匹配");
                            } else if (!VerificationUtils.matcherPassword(mVirpassword.getText().toString())) {
                                mVirpassword.setError("密码1不匹配");
                            } else if (!VerificationUtils.matcherPassword2(mVirpassword2.getText().toString())) {
                                mVirpassword2.setError("密码2不匹配");
                            } else if (!VerificationUtils.matcherEmail(mViremail.getText().toString())) {
                                mViremail.setError("邮箱不匹配");
                            } else if (!VerificationUtils.matcherIP(mVirip.getText().toString())) {
                                mVirip.setError("IP不匹配");
                            } else if (!VerificationUtils.matcherUrl(mVirurl.getText().toString())) {
                                mVirurl.setError("URL不匹配");
                            } else if (!VerificationUtils.matcherIdentityCard(mViridcard.getText().toString())) {
                                mViridcard.setError("身份证号码不匹配");
                            } else if (!VerificationUtils.isNumeric(mVirisnumber.getText().toString())) {
                                mVirisnumber.setError("不是数字");
                            }
                        }
                    }
            );
        }
    }
}
