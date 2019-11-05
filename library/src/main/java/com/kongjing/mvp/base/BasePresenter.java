package com.kongjing.mvp.base;

/**
 * Created by Mr.Rain on 2018/4/18.
 */

public abstract class BasePresenter<T> {
    public T mView;

    public void attach(T mView){
        this.mView = mView;
    }

    public void dettach(){
        mView = null;
    }
}
