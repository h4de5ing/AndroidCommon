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

import android.graphics.drawable.Drawable;

/**
 * Create by h4de5ing 2016/5/24 024
 */
public class AppBean {
    private String appName;
    private Drawable appIcon;
    private long appDate;
    private long appSize;
    private String appAPk;
    private String appVerName;
    private int appVerCode;
    private String appInstaller;
    private boolean isSystemApp;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public long getAppDate() {
        return appDate;
    }

    public void setAppDate(long appDate) {
        this.appDate = appDate;
    }

    public long getAppSize() {
        return appSize;
    }

    public void setAppSize(long appSize) {
        this.appSize = appSize;
    }

    public String getAppAPk() {
        return appAPk;
    }

    public void setAppAPk(String appAPk) {
        this.appAPk = appAPk;
    }

    public String getAppVerName() {
        return appVerName;
    }

    public void setAppVerName(String appVerName) {
        this.appVerName = appVerName;
    }

    public int getAppVerCode() {
        return appVerCode;
    }

    public void setAppVerCode(int appVerCode) {
        this.appVerCode = appVerCode;
    }

    public String getAppInstaller() {
        return appInstaller;
    }

    public void setAppInstaller(String appInstaller) {
        this.appInstaller = appInstaller;
    }

    public boolean isSystemApp() {
        return isSystemApp;
    }

    public void setSystemApp(boolean systemApp) {
        isSystemApp = systemApp;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "appName='" + appName + '\'' +
                ", appDate=" + appDate +
                ", appSize=" + appSize +
                ", appAPk='" + appAPk + '\'' +
                ", appVerName='" + appVerName + '\'' +
                ", appVerCode=" + appVerCode +
                ", appInstaller='" + appInstaller + '\'' +
                ", isSystemApp=" + isSystemApp +
                '}';
    }
}