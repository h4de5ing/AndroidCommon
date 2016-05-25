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
import android.widget.TextView;

import com.code19.androidcommon.R;
import com.code19.library.DensityUtil;
import com.code19.library.DeviceUtils;

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
        sb.append("AndroidID--" + DeviceUtils.getAndroidID(c) + "\r\n");
        sb.append("getIMSI--" + DeviceUtils.getIMEI(c) + "\r\n");
        sb.append("getIMSI--" + DeviceUtils.getIMSI(c) + "\r\n");
        sb.append("getWifiMacAddr--" + DeviceUtils.getWifiMacAddr(c) + "\r\n");
        //sb.append("getIP--" + DeviceUtils.getIP(c) + "\r\n");
        sb.append("getSerial--" + DeviceUtils.getSerial() + "\r\n");
        sb.append("getSIMSerial--" + DeviceUtils.getSIMSerial(c) + "\r\n");
        sb.append("getMNC--" + DeviceUtils.getMNC(c) + "\r\n");
        sb.append("getBuildBrand--" + DeviceUtils.getBuildBrand() + "\r\n");
        sb.append("getBuildHost--" + DeviceUtils.getBuildHost() + "\r\n");
        sb.append("getBuildTags--" + DeviceUtils.getBuildTags() + "\r\n");
        sb.append("getBuildTime--" + DeviceUtils.getBuildTime() + "\r\n");
        sb.append("getBuildUser--" + DeviceUtils.getBuildUser() + "\r\n");
        sb.append("getBuildVersionRelease--" + DeviceUtils.getBuildVersionRelease() + "\r\n");
        sb.append("getBuildVersionCodename--" + DeviceUtils.getBuildVersionCodename() + "\r\n");
        sb.append("getBuildVersionIncremental--" + DeviceUtils.getBuildVersionIncremental() + "\r\n");
        sb.append("getBuildVersionSDK--" + DeviceUtils.getBuildVersionSDK() + "\r\n");
        sb.append("getSupportedABIS--" + DeviceUtils.getSupportedABIS()[0] + DeviceUtils.getSupportedABIS()[1] + "\r\n");
        sb.append("getManufacturer--" + DeviceUtils.getManufacturer() + "\r\n");
        sb.append("getBootloader--" + DeviceUtils.getBootloader() + "\r\n");
        sb.append("getScreenDisplayID--" + DeviceUtils.getScreenDisplayID(c) + "\r\n");
        sb.append("getDisplayVersion--" + DeviceUtils.getDisplayVersion() + "\r\n");
        sb.append("getLanguage--" + DeviceUtils.getLanguage() + "\r\n");
        sb.append("getCountry--" + DeviceUtils.getCountry(c) + "\r\n");
        sb.append("getOSVersion--" + DeviceUtils.getOSVersion() + "\r\n");
        //sb.append("getGSFID--" + DeviceUtils.getGSFID(c) + "\r\n");
        sb.append("getBluetoothMAC--" + DeviceUtils.getBluetoothMAC(c) + "\r\n");
        sb.append("getPsuedoUniqueID--" + DeviceUtils.getPsuedoUniqueID() + "\r\n");
        sb.append("getFingerprint--" + DeviceUtils.getFingerprint() + "\r\n");
        sb.append("getHardware--" + DeviceUtils.getHardware() + "\r\n");
        sb.append("getProduct--" + DeviceUtils.getProduct() + "\r\n");
        sb.append("getDevice--" + DeviceUtils.getDevice() + "\r\n");
        sb.append("getBoard--" + DeviceUtils.getBoard() + "\r\n");
        sb.append("getRadioVersion--" + DeviceUtils.getRadioVersion() + "\r\n");
        sb.append("getUA--" + DeviceUtils.getUA(c) + "\r\n");
        sb.append("getDensity--" + DeviceUtils.getDensity(c) + "\r\n");
        //sb.append("getAccounts--" + DeviceUtils.getGoogleAccounts(c)[0] + "\r\n");
        sb.append("isRunningOnEmulator--" + DeviceUtils.isRunningOnEmulator() + "\r\n");
        sb.append("ScreenWidth x ScreenHeight--" + DensityUtil.getScreenW(getApplicationContext()) + "x" + DensityUtil.getScreenH(getApplicationContext()) + "\r\n");
        mDeviceutilstextview.setText(sb.toString());
    }
}
