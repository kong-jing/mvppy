package com.kongjing.simple.presenter;

import com.kongjing.simple.BasePresenter;
import com.kongjing.simple.contract.WeatherContract;

/**
 * name: WeatherPresenter<p>
 * description <p>
 * author Jing <P>
 * date: 18/7/12 <p>
 */
public class WeatherPresenter implements BasePresenter {
    WeatherContract.View view;
    public WeatherPresenter(WeatherContract.View view) {
        this.view = view;
    }

    public void getWeather() {
        view.showResult();
    }

    @Override
    public void start() {

    }
}
