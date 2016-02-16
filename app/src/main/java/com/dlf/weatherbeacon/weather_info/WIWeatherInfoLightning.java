package com.dlf.weatherbeacon.weather_info;

/**
 * Created by aram on 2016. 2. 16..
 */
public class WIWeatherInfoLightning extends WIWeatherInfo {
    @Override
    public String getCategoryName() {
        return "낙뢰";
    }

    @Override
    public String getValue() {
        return "없음";
    }
}
