# 常用工具类
- 每一个Android开发者在日常开发中都会积累一些自己的代码片段。
- 本项目就是收集一些日常开发中的常用工具类,减少功能性代码的重复编写,方便快速开发。
- 通过封装一层工具类的好处是以后只需要修改工具类的实现，就可以替换整体的框架。
- 参考了众多项目并加以改进和总结,如有疑问,请来信说明。
 
- CipherUtils.java 加密工具
    * md5Encode:md5加密
    * base64Encode：Base64加密
    * base64Decode:Base64解密
    * XorEncode:异或加密
    
- DateUtil.java 日期工具
    * formatDate 格式化日期时间
    * customFormatDate 自定义格式的格式化日期时间
    * formatDataTime 格式化日期时间
    * formatDate 格式化日期
    * formatTime 格式化时间
    * getDataTime 获取系统时间
    
- DensityUtil.java 屏幕工具
    * dip2px dp转像素
    * px2dip 像素转dp
    * px2sp 像素转sp 
    * sp2px sp转像素
    * getDialogW 获取dialog宽度
    * getScreenW 获取屏幕宽度
    * getScreenH 获取屏幕高度
    
- FileUtils.java  文件工具
    * deleteFile 删除文件
    * existsFile 判断文件是否存在
    * writeFile 写文件
    * readFile 读文件
    * copyFileFast 快速复制
    * closeIO 关闭IO流
    * zip zip压缩
    * unzip zip解压
    
- JsonUtils.java Json相关工具
    * toJson 对象转json
    * fromJson json转对象
    
- NetUtils.java 网络工具
    * getNetworkType 获取网络类型
    * getNetworkTypeName 获取网络名称
    * isConnected 检查网络状态
    * isWiFi 是否wifi
    * openNetSetting 打开网络设置界面
    * isNetworkAvailable 网络可用性
    
- SPUtils.java SharedPreferences工具
    * setBoolean 存储布尔型属性
    * getBoolean 获取布尔型属性
    * setInt 存储整型属性
    * getInt 获取整型属性
    * setString 存储字符串型属性
    * getString 获取字符串属性
 
- SystemUtils.java 系统工具
    * getPhoneIMEI 获取手机IMEI码
    * getSDKVersion 获取手机系统SDK版本
    * getSystemVersion 获取系统版本
    * sendSMS 调用系统发送短信
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
    
- ViewUtils.java View工具
    * captureView 截图
    * createViewBitmap 截图
    * convertViewToBitmap 截图
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

