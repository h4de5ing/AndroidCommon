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

package com.code19.androidcommon.presenter;

import android.content.Context;
import android.os.Handler;

import com.code19.androidcommon.model.AppBean;
import com.code19.androidcommon.model.AppBiz;
import com.code19.androidcommon.model.IAppBiz;
import com.code19.androidcommon.view.IAppView;

import java.util.List;

/**
 * Create by h4de5ing 2016/5/24 024
 */
public class AppPresenter {
    private IAppBiz mIAppBiz;
    private IAppView mIAppView;
    private Handler mHandler;
    private Context mContext;

    public AppPresenter(Context context, IAppView iAppView) {
        this.mContext = context;
        this.mHandler = new Handler();
        this.mIAppBiz = new AppBiz();
        this.mIAppView = iAppView;
    }

    public void getData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                mIAppBiz.getData(mContext, new IAppBiz.OnAppLoadListener() {
                    @Override
                    public void loading() {
                        mIAppView.showLoading();
                    }

                    @Override
                    public void loadSuccess(final List<AppBean> list) {
                        mIAppView.hideLoading();
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                mIAppView.referData(list);
                            }
                        });
                    }

                    @Override
                    public void loadFaile() {
                        mIAppView.hideLoading();
                    }
                });
            }
        }).start();

    }
}
