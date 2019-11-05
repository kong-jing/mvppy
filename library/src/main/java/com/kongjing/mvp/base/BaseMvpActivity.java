package com.kongjing.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseMvpActivity<V, T extends BasePresenter<V>> extends Activity {
    public T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
        presenter.attach((V) this);
    }

    public abstract T initPresenter();
}