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

package com.code19.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class GsonUtil {
    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    public static String objectToJson(Object ts) {
        String jsonStr = null;
        if (gson != null) {
            jsonStr = gson.toJson(ts);
        }
        return jsonStr;
    }


    public static String objectToJson(Object ts, Type type) {
        String jsonStr = null;
        if (gson != null) {
            jsonStr = gson.toJson(ts, type);
        }
        return jsonStr;
    }


    public static String objectToJsonDateSerializer(Object ts, final String dateformat) {
        String jsonStr = null;
        gson = new GsonBuilder()
                .registerTypeHierarchyAdapter(Date.class,
                        new JsonSerializer<Date>() {
                            public JsonElement serialize(Date src,
                                                         Type typeOfSrc,
                                                         JsonSerializationContext context) {
                                SimpleDateFormat format = new SimpleDateFormat(dateformat);
                                return new JsonPrimitive(format.format(src));
                            }
                        }).setDateFormat(dateformat).create();
        if (gson != null) {
            jsonStr = gson.toJson(ts);
        }
        return jsonStr;
    }


    public static List<?> jsonToList(String jsonStr) {
        List<?> objList = null;
        if (gson != null) {
            Type type = new com.google.gson.reflect.TypeToken<List<?>>() {
            }.getType();
            objList = gson.fromJson(jsonStr, type);
        }
        return objList;
    }


    public static List<?> jsonToList(String jsonStr, Type type) {
        List<?> objList = null;
        if (gson != null) {
            objList = gson.fromJson(jsonStr, type);
        }
        return objList;
    }


    public static Map<?, ?> jsonToMap(String jsonStr) {
        Map<?, ?> objMap = null;
        if (gson != null) {
            Type type = new com.google.gson.reflect.TypeToken<Map<?, ?>>() {
            }.getType();
            objMap = gson.fromJson(jsonStr, type);
        }
        return objMap;
    }

    public static Object jsonToBean(String jsonStr, Class<?> cl) {
        Object obj = null;
        if (gson != null) {
            obj = gson.fromJson(jsonStr, cl);
        }
        return obj;
    }


    @SuppressWarnings("unchecked")
    public static <T> T jsonToBeanDateSerializer(String jsonStr, Class<T> cl,
                                                 final String pattern) {
        Object obj = null;
        gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json, Type typeOfT,
                                            JsonDeserializationContext context)
                            throws JsonParseException {
                        SimpleDateFormat format = new SimpleDateFormat(pattern);
                        String dateStr = json.getAsString();
                        try {
                            return format.parse(dateStr);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                }).setDateFormat(pattern).create();
        if (gson != null) {
            obj = gson.fromJson(jsonStr, cl);
        }
        return (T) obj;
    }


    public static Object getJsonValue(String jsonStr, String key) {
        Object rulsObj = null;
        Map<?, ?> rulsMap = jsonToMap(jsonStr);
        if (rulsMap != null && rulsMap.size() > 0) {
            rulsObj = rulsMap.get(key);
        }
        return rulsObj;
    }
}
