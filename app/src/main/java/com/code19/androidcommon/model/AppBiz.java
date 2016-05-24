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

package com.code19.androidcommon.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

import com.code19.library.AppUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by h4de5ing 2016/5/24 024
 */
public class AppBiz implements IAppBiz {

    @Override
    public void getData(Context c, OnAppLoadListener onAppLoadListener) {
        List<AppBean> list = new ArrayList<>();
        List<PackageInfo> installedPackages = c.getPackageManager().getInstalledPackages(0);
        for (PackageInfo info : installedPackages) {
            String appName = AppUtils.getAppName(c, info.packageName);
            Drawable appIcon = AppUtils.getAppIcon(c, info.packageName);
            long appDate = AppUtils.getAppDate(c, info.packageName);
            long appSize = AppUtils.getAppSize(c, info.packageName);
            String appApk = AppUtils.getAppApk(c, info.packageName);
            String appVersionName = AppUtils.getAppVersionName(c, info.packageName);
            int appVersionCode = AppUtils.getAppVersionCode(c, info.packageName);
            String appInstaller = AppUtils.getAppInstaller(c, info.packageName);
            boolean systemApp = AppUtils.isSystemApp(c, info.packageName);
            if (!TextUtils.isEmpty(appName) &&
                    !TextUtils.isEmpty(appApk) &&
                    !TextUtils.isEmpty(appVersionName) &&
                    !TextUtils.isEmpty(appInstaller) &&
                    appIcon != null
                    && appDate > 0
                    && appSize > 0
                    && appVersionCode > 0) {
                AppBean appBean = new AppBean();
                appBean.setAppName(appName);
                appBean.setAppIcon(appIcon);
                appBean.setAppDate(appDate);
                appBean.setAppSize(appSize);
                appBean.setAppAPk(appApk);
                appBean.setAppVerName(appVersionName);
                appBean.setAppVerCode(appVersionCode);
                appBean.setAppInstaller(appInstaller);
                appBean.setSystemApp(systemApp);
                list.add(appBean);
            }
        }
        onAppLoadListener.loadSuccess(list);
    }
}
