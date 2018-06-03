package com.example.administrator.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/3.
 */

public class County extends DataSupport {
    private int id;
    /**
     * 县名
     */
    private String countryName;
    /**
     * 对应的天气
     */
    private String weatherId;
    /**
     * 当前县所属市的id
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
