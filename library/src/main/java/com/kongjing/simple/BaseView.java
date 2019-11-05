package com.kongjing.simple;

/**
 * mvp业务逻辑
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
