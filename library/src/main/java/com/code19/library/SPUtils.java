/*
 * Copyright (C)  2016 android@19code.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.code19.library;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Create by h4de5ing 2016/5/7 007
 */
public class SPUtils {

    /**
     * 存储布尔型属性
     *
     * @param context  上下文
     * @param filename 配置文件的名称
     * @param key      键
     * @param value    值
     */
    public static void setBoolean(Context context, String filename, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value);
    }

    /**
     * 获取布尔型属性
     *
     * @param context      上下文
     * @param filename     配置文件名称
     * @param key          键
     * @param defaultValue 默认值
     * @return 返回获取到的属性值
     */
    public static boolean getBoolean(Context context, String filename, String key, boolean defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

    /**
     * 设置数字型属性
     *
     * @param context  上下文
     * @param filename 配置文件名称
     * @param key      键
     * @param value    值
     */
    public static void setInt(Context context, String filename, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value);
    }

    /**
     * 获取数字型属性
     *
     * @param context      上下文
     * @param filename     配置文件名称
     * @param key          键
     * @param defaultValue 默认值
     * @return 返回获取的数字型属性值
     */
    public static int getInt(Context context, String filename, String key, int defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getInt(key, defaultValue);
    }

    /**
     * 设置字符串属性
     *
     * @param context  上下文
     * @param filename 配置文件名称
     * @param key      键
     * @param value    值
     */
    public static void setString(Context context, String filename, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putString(key, value);
    }

    /**
     * 获取字符型属性
     *
     * @param context      上下文
     * @param filename     配置文件名称
     * @param key          键
     * @param defaultValue 默认值
     * @return 返回获取的字符串型属性值
     */
    public static String getString(Context context, String filename, String key, String defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }
}
