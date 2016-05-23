# 使用方式
* 这个library还在功能迭代中,功能不尽完善...
```gradle 
compile 'com.code19.library:library:0.0.4'
```
# 常用工具类
- 每一个Android开发者在日常开发中都会积累一些自己的代码片段
- 目的：
       * 1.将常用功能模块做成工具类
       * 2.将常用第三方框架封装成工具类
       * 3.收集一些高效的正确的代码片段避免下次踩坑
- 能力一般,水平有限,难免有Bug,如果有任何问题,请<a href="https://github.com/h4de5ing/AndroidCommon/issues">反馈</a>
- 如果你有更好的代码,请提交<a href="https://github.com/h4de5ing/AndroidCommon/pulls">Pull request</a>
 
## app Module中的类:
    MainActivity.java 测试项目中的主类
    HandlerActivity.java Handler的正确使用方式事例
    
## library Module中的类：

- AppUtils.java 应用工具类
    * getAppName 获取应用名称
    * getAppIcon 获取应用图标
    * getAppDate 获取应用更新日期
    * getAppSize 获取应用大小
    * getAppApk 获取应用apk文件
    * getAppVersionName 获取应用版本名称
    * getAppVersionCode 获取应用版本号
    * getAppPackageName 获取应用包名
    * hasPermission 是否有权限
    * isInstalled 应用是否安装
    * installApk 安装应用
    * uninstallApk 卸载应用
    * isSystemApp 是否是系统应用
    
- BitmapUtils.java Bitmap工具类 * 未验证  
        
- CacheUtils.java 缓存工具类
    * setCache 设置缓存
    * getCache 获取缓存

- CipherUtils.java 密码工具类
    * encode(String input) 获取字符串md5值
    * encode(InputStream in) 获取输入流的md5值
    * base64Encode Base64加密
    * base64Decode Base64解密
    * XorEncode 异或加密
    * XorDecode 异或解密
    
- DateUtil.java 日期工具类
    * formatDataTime 格式化日期时间
    * formatDate 格式化日期
    * formatTime 格式化时间
    * formatDateCustom 自定义格式的格式化日期时间
    * string2Date 将时间字符串转换成Date
    * getTime 获取系统时间
    * subtractDate 计算两个时间差
    * getDateAfter 得到几天后的时间
    * getInterval 类似微博过去时间显示效果
    
- DensityUtil.java 屏幕工具类
    * dip2px dp转像素
    * px2dip 像素转dp
    * px2sp 像素转sp 
    * sp2px sp转像素
    * getDialogW 获取dialog宽度
    * getScreenW 获取屏幕宽度
    * getScreenH 获取屏幕高度
    
- DeviceUtils.java 设备信息工具
    * getAndroidID 获取AndroidID
    * getIMEI 获取设备IMEI码
    * getIMSI 获取设备IMSI码
    * getWifiMacAddr 获取MAC地址
    * getIP 获取网络IP地址(优先获取wifi地址)
    * getWifiIP 获取WIFI连接下的ip地址
    * getGPRSIP 获取GPRS连接下的ip地址
    * getSerial 获取设备序列号
    * getSIMSerial 获取SIM序列号
    * getPhoneNumber 获取手机号码(未获取成功)
    * getMNC 获取网络运营商 46000,46002,46007 中国移动，46001 中国联通，46003 中国电信
    * getCarrier 获取网络运营商：中国电信,中国移动,中国联通
    * getModel 获取硬件型号
    * getBuildBrand 获取编译厂商
    * getBuildHost 获取编译服务器主机
    * getBuildTags 获取描述Build的标签
    * getBuildTime 获取系统编译时间
    * getBuildUser 获取系统编译作者
    * getBuildVersionRelease 获取编译系统版本(5.1)
    * getBuildVersionCodename 获取开发代号
    * getBuildVersionIncremental 获取源码控制版本号  
    * getBuildVersionSDK 获取编译的SDK
    * getBuildID 获取修订版本列表(LMY47D)
    * getSupportedABIS CPU指令集
    * getManufacturer 获取硬件制造厂商
    * getBootloader 获取系统启动程序版本号
    * getScreenDisplayID 
    * getDisplayVersion 获取系统版本号
    * getLanguage 获取语言
    * getCountry 获取国家
    * getOSVersion 获取系统版本:5.1.1
    * getGSFID 获取GSF序列号
    * getBluetoothMAC 获取蓝牙地址
    * getPsuedoUniqueID Android设备物理唯一标识符
    * getFingerprint 构建标识,包括brand,name,device,version.release,id,version.incremental,type,tags这些信息
    * getHardware 获取硬件信息
    * getProduct 获取产品信息
    * getDevice 获取设备信息
    * getBoard 获取主板信息
    * getRadioVersion 获取基带版本(无线电固件版本 Api14以上)
    * getUA 获取的浏览器指纹(User-Agent)
    * getStore 获取应用市场
    * getDensity 获取得屏幕密度
    * getAccounts 获取google账号
    * isRunningOnEmulator 当前设备是否是模拟器  
    * showSoftInputMethod 显示软键盘
    * hideSoftInputMethod 隐藏软键盘
    
- FileUtils.java  文件工具类
    * closeIO 关闭IO流
    * isFileExist 文件是否存在
    * writeFile 将字符串写入到文件
    * readFile 从文件中读取字符串
    * copyFileFast 快速复制
    * shareFile 分享文件
    * zip zip压缩
    * unzip zip解压
    * formatFileSize 格式化文件大小
    * Stream2File 将输入流写入到文件
    * createFolder 创建文件夹
    * createFolder 创建文件夹(支持覆盖已存在的同名文件夹)
    * getFolderName 获取文件夹名称
    * deleteFile 删除目录下的文件
    
- ImageUtils.java 图片工具类 * 未验证 
    
- JsonUtils.java Json工具类(需要依赖Gson 2.0以上)
    * toJson 对象转json
    * fromJson json转对象
    
- NetUtils.java 网络工具
    * getNetworkType 获取网络类型
    * getNetworkTypeName 获取网络名称
    * isConnected 检查网络状态
    * isNetworkAvailable 网络可用性
    * isWiFi 是否wifi
    * openNetSetting 打开网络设置界面
    
- SPUtils.java SharedPreferences工具
    * setBoolean 存储布尔型属性
    * getBoolean 获取布尔型属性
    * setInt 存储整型属性
    * getInt 获取整型属性
    * setString 存储字符串型属性
    * getString 获取字符串属性
 
- SystemUtils.java 系统工具
    * sendSMS 调用系统发送短信
    * forwardToDial 跳转到拨号页面
    * hideKeyBoard 隐藏系统键盘
    * isBackground 判断当前应用程序是否后台运行
    * isSleeping 判断手机是否处理睡眠
    * installApk 安装apk
    * getAppVersionName 获取当前应用程序的版本名称
    * getAppVersionCode 获取当前应用程序的版本号
    * goHome 返回Home
    * getSign 获取应用签名
    * hexdigest 32位签名
    * getDeviceUsableMemory 获取设备可用空间
    * gc 清理后台进程和服务
    * createDeskShortCut 创建桌面快捷方式
    * createShortcut 创建快捷方式
    * shareText 分享文本
    * shareFile 分享文件(此方法是调用FileUtils.shareFile中的方式)
    * getShareTargets 获取可接受分享的应用
    * getCurrentLanguage 获取当前系统的语言 
    * getLanguage 获取当前系统的语言 

- VerificationUtils.java 验证工具类

    
- ViewUtils.java View工具
    * captureView 截图
    * createViewBitmap 截图
    * convertViewToBitmap 截图
    * getActivityBitmap 获取Activity的截图
    * getStatusBarHeight 获取状态栏高度
    * getToolbarHeight 获取工具栏高度
    * getNavigationBarHeight 获取导航栏高度
    * getScreenSize 获取屏幕尺寸
   
       
License
----

      Copyright (C)  2016 android@19code.com
      
      Licensed under the Apache License, Version 2.0 (the "License");  
      you may not use this file except in compliance with the License.  
      You may obtain a copy of the License at  
      
          http://www.apache.org/licenses/LICENSE-2.0
      
      Unless required by applicable law or agreed to in writing, software  
      distributed under the License is distributed on an "AS IS" BASIS,  
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
      See the License for the specific language governing permissions and  
      limitations under the License.  

