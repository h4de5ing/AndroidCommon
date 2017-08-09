# How to use In Android Studio
```gradle
compile 'com.code19.library:library:0.1.4'
```

# notes
[0.1.4 removed](https://github.com/h4de5ing/AndroidCommon/commit/f4cb414ce8a7732fb152c510833f782b0cf0fd6d "0.1.4 we removed") ``ToastUtils``,``ViewUtils.java``,``SpannableStringUtils.java``,if you used then,you can use 0.1.2.

# Common Utils
- Collection Chop [Issues](https://github.com/h4de5ing/AndroidCommon/issues)
- Show Me The Best Code [Pull request](https://github.com/h4de5ing/AndroidCommon/pulls)

```
Demo:
AppUtils.getAppName(MainActivity.this,"com.code19.androidcommon");
```
##  [中文文档](README-cn.md)
## library Module：

- AppUtils.java (about Application tools)
    * getAppName
    * getAppIcon
    * getAppFirstInstallTime
    * getAppLastUpdateTime
    * getAppSize
    * getAppApk
    * getAppVersionName
    * getAppVersionCode
    * getAppInstaller
    * getAppSign
    * getAppTargetSdkVersion
    * getAppUid
    * getNumCores
    * getRootPermission
    * getAppPermissions
    * hasPermission
    * isInstalled
    * ~~installApk~~
    * ~~uninstallApk~~
    * isSystemApp
    * isServiceRunning
    * stopRunningService
    * killProcesses
    * runScript
    * runApp
    * cleanCache
    * cleanDatabases
    * cleanSharedPreference

- CipherUtils.java
    * md5(String input)
    * md5L(String input)
    * md5(InputStream in)
    * base64Encode
    * base64Decode
    * XorEncode
    * XorDecode
    * sha1(String str)
    * sha1(File file)

- DateUtil.java
    * formatDataTime
    * formatDate
    * formatTime
    * formatDateCustom
    * string2Date
    * getDate
    * getTime
    * getDateTime
    * subtractDate
    * getDateAfter
    * getWeekOfMonth
    * getDayOfWeek

- DensityUtil.java
    * dip2px
    * dip2sp
    * px2dip
    * px2sp
    * sp2px
    * sp2dip
    * getScreenW
    * getScreenH
    * getScreenRealSize
    * getStatusBarH
    * getNavigationBarrH

- DeviceUtils.java
    * getAndroidID
    * getIMEI
    * getIMSI
    * getWifiMacAddr
    * getIP
    * getWifiIP
    * getGPRSIP
    * getSerial
    * getSIMSerial
    * getMNC
    * getCarrier
    * getModel
    * getBuildBrand
    * getBuildHost
    * getBuildTags
    * getBuildTime
    * getBuildUser
    * getBuildVersionRelease
    * getBuildVersionCodename
    * getBuildVersionIncremental
    * getBuildVersionSDK
    * getBuildID
    * getSupportedABIS
    * getManufacturer
    * getBootloader
    * getScreenDisplayID 
    * getDisplayVersion
    * getLanguage
    * getCountry
    * getOSVersion
    * getGSFID
    * getBluetoothMAC
    * getPsuedoUniqueID
    * getFingerprint
    * getHardware
    * getProduct
    * getDevice
    * getBoard
    * getRadioVersion
    * getUA
    * getDensity
    * getGoogleAccounts


- FileUtils.java
    * closeIO
    * isFileExist
    * writeFile
    * readFile
    * readFile
    * copyFile
    * copyFileFast
    * shareFile
    * zip
    * unzip
    * formatFileSize
    * Stream2File
    * createFolder
    * createFolder
    * getFileName
    * getFileSize
    * rename
    * getFolderName
    * getFilesArray
    * deleteFile
    * deleteFileByDirectory
    * openImage
    * openVideo
    * openURL
    * downloadFile
    * upgradeApp
    * isSDCardAvailable
    * getAppExternalPath
    * getExtraPath

- JsonUtils.java
    * toJson
    * fromJson
    * mapToJson
    * collection2Json
    * object2Json
    * string2JSONObject

- L.java
    * init //Init the Log set Debug and Tag
    * v VERBOSE 
    * d DEBUG
    * i INFO
    * w WARN
    * e ERROR
    * a ASSERT
    * json
    * xml

- NetUtils.java
    * getNetworkType
    * getNetworkTypeName
    * isConnected
    * isNetworkAvailable
    * isWiFi
    * openNetSetting
    * setWifiEnabled
    * setDataEnabled
    * getWifiScanResults
    * getScanResultsByBSSID
    * getWifiConnectionInfo

- SPUtils.java
    * setSP
    * getSp
    * cleanAllSP

- StringUtils.java
    * getChsAscii
    * convert
    * getSelling
    * parseEmpty
    * isEmpty
    * chineseLength
    * strLength
    * subStringLength
    * isChinese
    * isContainChinese
    * strFormat2
    * convert2Int
    * decimalFormat

- SystemUtils.java
    * sendSMS
    * forwardToDial
    * sendMail
    * openWeb
    * openContacts
    * openSettings
    * hideKeyBoard
    * isBackground
    * isSleeping
    * installApk
    * isRooted
    * isRunningOnEmulator
    * goHome
    * hexdigest
    * getDeviceUsableMemory
    * gc
    * getProcessName
    * createDeskShortCut
    * createShortcut
    * shareText
    * shareFile
    * getShareTargets
    * getCurrentLanguage
    * getLanguage
    * isGpsEnabled
    * showSoftInputMethod
    * closeSoftInputMethod
    * showSoftInput
    * closeSoftInput
    * toWeChatScan
    * toAliPayScan
    * toAliPayPayCode
    * getRandomNumber

- VerificationUtils.java
    * matcherRealName
    * matcherPhoneNum //just matcher chinese phone number
    * matcherAccount
    * matcherPassword
    * matcherPassword2
    * matcherEmail
    * matcherIP
    * matcherUrl
    * isNumeric
    * testRegex

# Thanks to all the open source programmers
License
----

      Copyright (C)  2016 moxi1992@gmail.com

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.

