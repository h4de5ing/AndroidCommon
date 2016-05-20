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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by h4de5ing 2016/5/7 007
 */
public class DateUitl {
    private static final SimpleDateFormat DATE_FORMAT_DATETIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat DATE_FORMAT_DATE = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat DATE_FORMAT_TIME = new SimpleDateFormat("HH:mm:ss");

    /**
     * unix时间戳转换为dateFormat
     *
     * @param beginDate 时间字符串
     * @return 格式化后的时间字符串
     */
    public static String formatDate(String beginDate) {
        return DATE_FORMAT_DATETIME.format(new Date(Long.parseLong(beginDate)));
    }

    /**
     * 自定义格式时间戳转换
     *
     * @param beginDate 时间字符串
     * @param format    格式
     * @return 格式化后的时间字符串
     */

    public static String customFormatDate(String beginDate, String format) {
        return new SimpleDateFormat(format).format(new Date(Long.parseLong(beginDate)));
    }


    /**
     * 格式化日期时间
     *
     * @param date long型时间
     * @return 格式化后的时间字符串
     */
    public static String formatDataTime(long date) {
        return DATE_FORMAT_DATETIME.format(new Date(date));
    }

    /**
     * 格式化日期
     *
     * @param date long型时间
     * @return 格式化后的日期字符串
     */
    public static String formatDate(long date) {
        return DATE_FORMAT_DATE.format(new Date(date));
    }

    /**
     * 格式化时间
     *
     * @param date long型时间
     * @return 格式化后的时间字符串
     */
    public static String formatTime(long date) {
        return DATE_FORMAT_TIME.format(new Date(date));
    }

    /**
     * 返回当前系统时间(格式以HH:mm:ss形式)
     */
    public static String getDataTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
}
