/*
 * Copyright (C)  2016 android@19code.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.code19.androidcommon;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

/**
 * Create by h4de5ing 2016/5/10 010
 * 论Handler的正确使用方式, 参考自：https://yq.aliyun.com/articles/3009 Android 内存泄漏总结
 */
public class HandlerActivity extends AppCompatActivity {
    private static class MyHandler extends Handler {
        private final WeakReference<HandlerActivity> mMainActivityWeakReference;

        public MyHandler(HandlerActivity activity) {
            mMainActivityWeakReference = new WeakReference<HandlerActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            HandlerActivity activity = mMainActivityWeakReference.get();
            if (activity != null) {
                // 处理msg
                switch (msg.what) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }

            }
        }
    }


    private final MyHandler mMyHandler = new MyHandler(this);
    private static final Runnable sRunnable = new Runnable() {
        @Override
        public void run() {
            // 执行的内容
            Message message = new Message();
            message.arg1 = 1;
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mMyHandler.postDelayed(sRunnable, 1000 * 6);//6秒钟后执行
        finish();
    }
}
