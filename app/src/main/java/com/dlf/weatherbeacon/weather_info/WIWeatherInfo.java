package com.dlf.weatherbeacon.weather_info;

/**
 * Created by aram on 2016. 2. 16..
 */
public abstract class WIWeatherInfo {

    protected String _category;
    protected String _baseDate;
    protected String _baseTime;
    protected String _value;

    public abstract String getCategoryName();
    public abstract String getValue();

    public String getBaseDate()
    {
       return _baseDate;
    }

    public String getBaseTime()
    {
        return _baseTime;
    }


    public String getCategorySymbol()
    {
        return _category;
    }


}
