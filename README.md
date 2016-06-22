# 使用方式
* 这个library还在功能迭代中,功能不尽完善...
```gradle 
compile 'com.code19.library:library:0.0.7'
```
# 常用工具类
- 每一个Android开发者在日常开发中都会积累一些自己的代码片段
- 目的：
       * 1.将常用功能模块做成工具类
       * 2.封装Android系统api,简化api的使用
       * 3.收集一些高效的正确的代码片段避免下次踩坑
       * 4.尽量少依赖第三方
- 能力一般,水平有限,难免有Bug,如果有任何问题,请<a href="https://github.com/h4de5ing/AndroidCommon/issues">反馈</a>
- 如果你有更好的代码,请提交<a href="https://github.com/h4de5ing/AndroidCommon/pulls">Pull request</a>
 
* 感谢各位的star,你们的支持是我继续的动力,好了,本着多一点真诚,少一点套路的原则,完善一下文档
* 为了让更多人用上这个库,现在推出Eclipse <a href="https://github.com/h4de5ing/AndroidCommon/raw/master/com.code19.library-0.07.jar">lib下载</a>

```
调用方法如此简单：
调用结果 = 类名.方法名( 参数 )
AppUtils.getAppName(MainActivity.this,com.code19.androidcommon);
```
   
## library Module中的类：

- AppUtils.java 应用工具类
    * getAppName 获取应用名称
    * getAppIcon 获取应用图标
    * getAppDate 获取应用更新日期
    * getAppSize 获取应用大小
    * getAppApk 获取应用apk文件
    * getAppVersionName 获取应用版本名称
    * getAppVersionCode 获取应用版本号
    * getAppInstaller 获取应用的安装市场
    * getAppPackageName 获取应用包名
    * hasPermission 是否有权限
    * isInstalled 应用是否安装
    * installApk 安装应用
    * uninstallApk 卸载应用
    * isSystemApp 是否是系统应用
    * isServiceRunning 服务是否在运行
    * stopRunningService 停止服务
    * getNumCores 获取Cpu内核数
    * killProcesses 结束进程
    * runScript 运行脚本
    * getRootPermission 获得root权限

- BitmapUtils.java Bitmap工具类
   * decodeFile 解析文件为bitmap
   * getImageThumbnail 获取图片缩略图
        
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

- CoordinateTransformUtil.java GPS坐标转换工具
    * 百度坐标（BD09）、国测局坐标（火星坐标，GCJ02）、和WGS84坐标系之间的转换的工具
    * bd09towgs84 百度坐标系(BD-09)转WGS坐标(百度坐标纬度,百度坐标经度),WGS84坐标数组
    * wgs84tobd09 WGS坐标转百度坐标系(BD-09)(WGS84坐标系的经度,WGS84坐标系的纬度),百度坐标数组
    * gcj02tobd09 火星坐标系(GCJ-02)转百度坐标系(BD-09)(火星坐标经度,火星坐标纬度),百度坐标数组
    * bd09togcj02 百度坐标系(BD-09)转火星坐标系(GCJ-02)(百度坐标纬度,百度坐标经度),火星坐标数组
    * wgs84togcj02 WGS84转GCJ02(火星坐标系)(WGS84坐标系的经度,WGS84坐标系的纬度),火星坐标数组
    * gcj02towgs84 GCJ02(火星坐标系)转GPS84(火星坐标系的经度,火星坐标系纬度),WGS84坐标数组
    * transformlat 纬度转换
    * transformlng 经度转换
    * out_of_china 判断是否在国内，不在国内不做偏移

- DateUtil.java 日期工具类
    * formatDataTime 格式化日期时间
    * formatDate 格式化日期
    * formatTime 格式化时间
    * formatDateCustom 自定义格式的格式化日期时间
    * string2Date 将时间字符串转换成Date
    * getTime 获取系统时间
    * subtractDate 计算两个时间差
    * getDateAfter 得到几天后的时间
    * getWeekOfMonth 获取当前时间为本月的第几周
    * getDayOfWeek 获取当前时间为本周的第几天

- DensityUtil.java 屏幕工具类
    * dip2px dp转像素
    * px2dip 像素转dp
    * px2sp 像素转sp 
    * sp2px sp转像素
    * getScreenW 获取屏幕宽度
    * getScreenH 获取屏幕高度
    * getScreenRealSize 获取屏幕的真实高度
    * getStatusBarH 获取状态栏高度
    * getNavigationBarrH 获取导航栏高度
    
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
    * getMNC 获取网络运营商 46000,46002,46007 中国移动,46001 中国联通,46003 中国电信
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
    * getDensity 获取得屏幕密度
    * getGoogleAccounts 获取google账号


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
    * openImage 打开图片
    * openVideo 打开视频
    * openURL 打开URL

- ImageUtils.java 图片工具类
    * calculateInSampleSize 计算图片的压缩比率
    * getPictureDegree 获取图片的角度
    * rotaingImageView 旋转图片
    * decodeScaleImage 加载图片并压缩
    * getRoundedCornerBitmap 获取圆角图片
    //* decodeUriAsBitmap 解析URL流为图片
    * bitmap2File bitmap存为文件
    * compressImage 质量压缩
    * compressFixBitmap 固定大小压缩 
    
- JsonUtils.java Json工具类(需要依赖Gson 2.0以上)
    * toJson 对象转json
    * fromJson json转对象
    * mapToJson Map转为JSONObject
    * collection2Json 集合转换为JSONArray
    * object2Json Object对象转换为JSONArray
    * string2JSONObject json字符串生成JSONObject对象
    
- L.java 日志工具
    * init 初始化日志开关和TAG(默认日志为开,TAG为"ghost")
    * v VERBOSE 
    * d DEBUG
    * i INFO
    * w WARN
    * e ERROR
    * a ASSERT
    * json 输出json
    * xml 输出xml
    
    
- NetUtils.java 网络工具
    * getNetworkType 获取网络类型
    * getNetworkTypeName 获取网络名称
    * isConnected 检查网络状态
    * isNetworkAvailable 网络可用性
    * isWiFi 是否wifi
    * openNetSetting 打开网络设置界面
    * setWifiEnabled 设置wifi状态
    * getWifiScanResults 获取wifi列表
    * getScanResultsByBSSID 过滤扫描结果
    * getWifiConnectionInfo 获取wifi连接信息
    
- SPUtils.java SharedPreferences工具
    * setSP 存储SharedPreferences值
    * getSp 获取SharedPreferences值
    * cleanAllSP 清除所有的SP值

- StringUtils.java 字符串工具
    * getChsAscii 汉字转成ASCII码
    * convert 单字解析
    * getSelling 词组解析
    * parseEmpty 将null转化为""
    * isEmpty 是否是空字符串
    * chineseLength 中文长度
    * strLength 字符串长度
    * subStringLength 获取指定长度的字符所在位置
    * isChinese 是否是中文
    * isContainChinese 是否包含中文
    * strFormat2 不足2位前面补0
    * convert2Int 类型安全转换
    * decimalFormat 指定小数输出

- SystemUtils.java 系统工具
    * sendSMS 调用系统发送短信
    * forwardToDial 跳转到拨号
    * callPhone 直接呼叫号码
    * sendMail 发邮件
    * hideKeyBoard 隐藏系统键盘
    * isBackground 判断当前应用程序是否后台运行
    * isSleeping 判断手机是否处理睡眠
    * installApk 安装apk
    * isRooted 是否root
    * isRunningOnEmulator 当前设备是否是模拟器
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
    * isGpsEnabled GPS是否打开
    * showSoftInputMethod 显示软键盘
    * closeSoftInputMethod 关闭软键盘
    * showSoftInput 显示软键盘
    * closeSoftInput 关闭软键盘

- VerificationUtils.java 验证工具类
    * matcherRealName 判断姓名格式  
    ```
    真实姓名可以是汉字,也可以是字母,但是不能两者都有,也不能包含任何符号和数字
    1.如果是英文名,可以允许英文名字中出现空格
    2.英文名的空格可以是多个,但是不能连续出现多个
    3.汉字不能出现空格
    ```
    * matcherPhoneNum 判断手机号格式  (匹配11数字,并且13-19开头)
    * matcherAccount 判断账号格式 (4-20位字符)
    * matcherPassword 判断密码格式 (6-12位字母或数字)
    * matcherPassword2 判断密码格式 (6-12位字母或数字,必须同时包含字母和数字)
    * matcherEmail 判断邮箱格式
    * matcherIP 判断IP地址
    * matcherUrl 判断URL (http,https,ftp)
    * matcherVehicleNumber 判断中国民用车辆号牌
    * matcherIdentityCard 判断身份证号码格式
    * isNumeric 是否数值型
    * testRegex 是否匹配正则
    * checkPostcode 匹配中国邮政编码
    
- ViewUtils.java View工具
    * removeSelfFromParent
    * requestLayoutParent
    * isTouchInView
    * bigImage
    * setTVUnderLine 给TextView设置下划线
    * showPopupWindow
    * dismissPopup
    * captureView 截图
    * createViewBitmap 截图
    * convertViewToBitmap 截图
    * getActivityBitmap 获取Activity的截图
    * getStatusBarHeight 获取状态栏高度
    * getToolbarHeight 获取工具栏高度
    * getNavigationBarHeight 获取导航栏高度
    * measureView 测量view
    * getViewWidth 获取view的宽度
    * getViewHeight 获取view的高度

    
    
```shell 

    /**
     * 身份证校验
     * <p>
     * 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定,公民身份号码是特征组合码,由十七位数字本体码和一位数字校验码组成。
     * 排列顺序从左至右依次为：六位数字地址码,八位数字出生日期码,三位数字顺序码和一位数字校验码。
     * 地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
     * 出生日期码表示编码对象出生的年、月、日,其中年份用四位数字表示,年、月、日之间不用分隔符。
     * 顺序码表示同一地址码所标识的区域范围内,对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性,偶数分给女性。
     * 校验码是根据前面十七位数字码,按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。
     * 出生日期计算方法。
     * 15位的身份证编码首先把出生年扩展为4位,简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
     * 2000年后出生的肯定都是18位的了没有这个烦恼,至于1800年前出生的,那啥那时应该还没身份证号这个东东,⊙﹏⊙b汗...
     * 下面是正则表达式:
     * 出生日期1800-2099  /(18|19|20)?\d{2}(0[1-9]|1[012])(0[1-9]|[12]\d|3[01])/
     * 身份证正则表达式 /^[1-9]\d{5}((1[89]|20)\d{2})(0[1-9]|1[0-2])(0[1-9]|[12]\d|3[01])\d{3}[\dx]$/i
     * 15位校验规则 6位地址编码+6位出生日期+3位顺序号
     * 18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位
     * 校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)
     * 公式(1)中：
     * i----表示号码字符从由至左包括校验码在内的位置序号;
     * ai----表示第i位置上的号码字符值；
     * Wi----示第i位置上的加权因子,其数值依据公式Wi=2^(n-1）(mod 11)计算得出。
     * i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
     * Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1
     * </P>
     *
     * @author Yoojia.Chen (yoojia.chen@gmail.com)
     * @version version 2015-05-21
     * @since 2.0
     */
```

# 这个库参考了众多网络的中的代码,在此对这些无私奉献的人致以最诚挚的感谢。

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

