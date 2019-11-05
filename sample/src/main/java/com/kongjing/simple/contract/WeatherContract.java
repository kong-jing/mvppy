package com.kongjing.simple.contract;

import com.kongjing.simple.BasePresenter;
import com.kongjing.simple.BaseView;

/**
 * name: WeatherContract<p>
 * description <p>
 * author Jing <P>
 * date: 18/7/12 <p>
 */
public interface WeatherContract {
    //界面业务
    interface View extends BaseView<Presenter> {
        void showResult();
    }

    //数据处理逻辑
    interface Presenter extends BasePresenter {
        void getWeather();
    }
}
