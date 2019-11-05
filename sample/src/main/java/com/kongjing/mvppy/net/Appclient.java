package com.kongjing.mvppy.net;

import com.kongjing.mvppy.data.bean.WeatherApiBean;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xyz.kongjing.mvppy.data.bean.WeatherCityBean;

/**
 * @author Jing
 * @Description
 * @Time 18/4/23
 */
public class Appclient {
    public static final String WEATHERIP = "http://weixin.jirengu.com";

    public static Appclient getInstance() {
        if (instance == null){
            instance = new Appclient();
        }
        return instance;
    }

    private Appclient() {
    }

    /**
     *  单例模式
     */
    static Appclient instance;
    /**
     * 更新天气
     * @param city
     * @param callback
     */
    public void updateWeather(String city, retrofit2.Callback<WeatherApiBean> callback){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(WEATHERIP)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        WeatherRequest weatherRequest = retrofit.create(WeatherRequest.class);
        Call<WeatherApiBean> call = weatherRequest.requestWeather(city);
        call.enqueue(callback);
    }

    /**
     * 获取城市地址
     * @param location IP地址 192.168.91.1
     * @param callback
     */
    public void getWeatherCity(String location, retrofit2.Callback<WeatherCityBean> callback){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(WEATHERIP)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        WeatherRequest weatherRequest = retrofit.create(WeatherRequest.class);
        Call<WeatherCityBean> call = weatherRequest.requestWeatherCity(location);
        call.enqueue(callback);
    }
}
