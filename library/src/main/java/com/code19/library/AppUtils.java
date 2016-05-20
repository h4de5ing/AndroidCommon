/*
 * Copyright (C)  2016 android@19code.com
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

package com.code19.library;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

import java.io.File;

/**
 * Create by h4de5ing 2016/5/18 018
 */
public class AppUtils {
    /**
     * 获取应用名称
     *
     * @param packageName 应用程序包名
     * @param context     包管理器
     * @return 返回获取到的应用程序名称
     */
    public static String getAppName(String packageName, Context context) {
        PackageManager pm = context.getPackageManager();
        String appName = null;
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo(packageName, 0);
            appName = String.valueOf(pm.getApplicationLabel(applicationInfo));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appName;
    }

    /**
     * 获取应用图标
     *
     * @param packageName 应用程序包名
     * @param context     包管理器
     * @return 返回获取到的应用程序图标
     */

    public static Drawable getAppIcon(String packageName, Context context) {
        PackageManager pm = context.getPackageManager();
        Drawable appIcon = null;
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo(packageName, 0);
            appIcon = applicationInfo.loadIcon(pm);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appIcon;
    }

    /**
     * 获取应用程序最后更新的时间
     *
     * @param packageName 应用程序包名
     * @param pm          包管理器
     * @return 返回获取到的应用程序更新时间
     */
    public static long getAppDate(String packageName, PackageManager pm) {
        long lastUpdateTime = 0;
        try {
            PackageInfo packageInfo = pm.getPackageInfo(packageName, 0);
            lastUpdateTime = packageInfo.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return lastUpdateTime;
    }

    /**
     * 获取应用的大小
     *
     * @param packageName 应用程序包名
     * @param pm          包管理器
     * @return 返回获取到的应用程序大小
     */
    public static long getAppSize(String packageName, PackageManager pm) {
        long appSize = 0;
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo(packageName, 0);
            appSize = new File(applicationInfo.sourceDir).length();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appSize;
    }

    /**
     * 获取应用成apk
     *
     * @param packageName 应用程序包名
     * @param pm          包管理器
     * @return 返回获取到的应用程序apk
     */
    public static String getAppApk(String packageName, PackageManager pm) {
        String sourceDir = null;
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo(packageName, 0);
            sourceDir = applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return sourceDir;
    }

}
