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
import android.content.SharedPreferences;

/**
 * Create by h4de5ing 2016/5/7 007
 */
public class SPUtils {

    public static void setBoolean(Context context, String filename, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value);
    }


    public static boolean getBoolean(Context context, String filename, String key, boolean defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

    public static void setInt(Context context, String filename, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value);
    }

    public static int getInt(Context context, String filename, String key, int defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getInt(key, defaultValue);
    }

    public static void setString(Context context, String filename, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        sp.edit().putString(key, value);
    }

    public static String getString(Context context, String filename, String key, String defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(filename, Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }
}
