package com.kongjing.simple;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import com.kongjing.mvppy.R;
import com.kongjing.simple.contract.WeatherContract;
import com.kongjing.simple.presenter.WeatherPresenter;

/**
 * name: SimpleActivity<p>
 * description <p>
 * @author KongJing <P>
 * date: 18/7/12 <p>
 */
public class SimpleActivity extends Activity implements WeatherContract.View{
    WeatherPresenter presenter;//主持人
    @Override
    public void showResult() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState,
        @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_simple);
        presenter = new WeatherPresenter(this);
    }

    @Override
    public void setPresenter(WeatherContract.Presenter presenter) {

    }
}
