package com.example.administrator.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/6/4.
 */

public class Basic {
    /**
     *  SerializedName注解来让JSON字段和JAVA字段建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;

    }
}
