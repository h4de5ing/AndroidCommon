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

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.code19.androidcommon.R;
import com.code19.library.DensityUtil;
import com.code19.library.DeviceUtils;
import com.code19.library.SystemUtils;

public class DeviceActivity extends AppCompatActivity {
    private Context c;
    private TextView mDeviceutilstextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        c = this;
        mDeviceutilstextview = (TextView) findViewById(R.id.deviceutils_textview);
        initDeviecesInfos();
    }

    private void initDeviecesInfos() {
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidID--" + DeviceUtils.getAndroidID(c) + "\n");
        sb.append("getIMSI--" + DeviceUtils.getIMEI(c) + "\n");
        sb.append("getIMSI--" + DeviceUtils.getIMSI(c) + "\n");
        sb.append("getWifiMacAddr--" + DeviceUtils.getWifiMacAddr(c) + "\n");
        //sb.append("getIP--" + DeviceUtils.getIP(c) + "\n");
        sb.append("getSerial--" + DeviceUtils.getSerial() + "\n");
        sb.append("getSIMSerial--" + DeviceUtils.getSIMSerial(c) + "\n");
        sb.append("getMNC--" + DeviceUtils.getMNC(c) + "\n");
        sb.append("getBuildBrand--" + DeviceUtils.getBuildBrand() + "\n");
        sb.append("getBuildHost--" + DeviceUtils.getBuildHost() + "\n");
        sb.append("getBuildTags--" + DeviceUtils.getBuildTags() + "\n");
        sb.append("getBuildTime--" + DeviceUtils.getBuildTime() + "\n");
        sb.append("getBuildUser--" + DeviceUtils.getBuildUser() + "\n");
        sb.append("getBuildVersionRelease--" + DeviceUtils.getBuildVersionRelease() + "\n");
        sb.append("getBuildVersionCodename--" + DeviceUtils.getBuildVersionCodename() + "\n");
        sb.append("getBuildVersionIncremental--" + DeviceUtils.getBuildVersionIncremental() + "\n");
        sb.append("getBuildVersionSDK--" + DeviceUtils.getBuildVersionSDK() + "\n");
        sb.append("getSupportedABIS--" + DeviceUtils.getSupportedABIS()[0] + DeviceUtils.getSupportedABIS()[1] + "\n");
        sb.append("getManufacturer--" + DeviceUtils.getManufacturer() + "\n");
        sb.append("getBootloader--" + DeviceUtils.getBootloader() + "\n");
        sb.append("getScreenDisplayID--" + DeviceUtils.getScreenDisplayID(c) + "\n");
        sb.append("getDisplayVersion--" + DeviceUtils.getDisplayVersion() + "\n");
        sb.append("getLanguage--" + DeviceUtils.getLanguage() + "\n");
        sb.append("getCountry--" + DeviceUtils.getCountry(c) + "\n");
        sb.append("getOSVersion--" + DeviceUtils.getOSVersion() + "\n");
        //sb.append("getGSFID--" + DeviceUtils.getGSFID(c) + "\n");
        sb.append("getBluetoothMAC--" + DeviceUtils.getBluetoothMAC(c) + "\n");
        sb.append("getPsuedoUniqueID--" + DeviceUtils.getPsuedoUniqueID() + "\n");
        sb.append("getFingerprint--" + DeviceUtils.getFingerprint() + "\n");
        sb.append("getHardware--" + DeviceUtils.getHardware() + "\n");
        sb.append("getProduct--" + DeviceUtils.getProduct() + "\n");
        sb.append("getDevice--" + DeviceUtils.getDevice() + "\n");
        sb.append("getBoard--" + DeviceUtils.getBoard() + "\n");
        sb.append("getRadioVersion--" + DeviceUtils.getRadioVersion() + "\n");
        sb.append("getUA--" + DeviceUtils.getUA(c) + "\n");
        sb.append("getDensity--" + DeviceUtils.getDensity(c) + "\n");
        //sb.append("getAccounts--" + DeviceUtils.getGoogleAccounts(c)[0] + "\n");
        sb.append("isRunningOnEmulator--" + SystemUtils.isRunningOnEmulator() + "\n");
        sb.append("isRooted--" + SystemUtils.isRooted() + "\n");
        sb.append("ScreenWidth x ScreenHeight--" + DensityUtil.getScreenW(c) + "x" + (DensityUtil.getScreenRealH(c)) + "\n");
        Log.i("ghost", "StatusBar:" + DensityUtil.getStatusBarH(c) + ",Nav:" + DensityUtil.getNavigationBarrH(c));
        mDeviceutilstextview.setText(sb);
    }
}
