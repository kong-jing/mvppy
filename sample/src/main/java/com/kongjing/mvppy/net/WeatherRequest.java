package com.kongjing.mvppy.net;

import com.kongjing.mvppy.data.bean.WeatherApiBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import xyz.kongjing.mvppy.data.bean.WeatherCityBean;

/**
 * 天气预报的请求接口
 *
 * @author kongJing
 * @since 17/10/26.
 */

public interface WeatherRequest {

  /**
   * 获取当前天气
   * @param city 城市代码
   */
  @GET("/weather/now") Call<WeatherApiBean> requestWeather(@Query("cityid") String city);

  /**
   * 获取城市代码
   * @param location 城市IP地址、经纬度、城市名(beijing)
   */
  @GET("/weather/cityid") Call<WeatherCityBean> requestWeatherCity(@Query("location") String location);
}
