package com.kongjing.mvppy;

import android.os.Bundle;
import com.kongjing.mvp.base.BaseMvpActivity;
import com.kongjing.mvppy.ui.MainPresenter;
import com.kongjing.mvppy.ui.MainView;

public class MainActivity extends BaseMvpActivity<MainView, MainPresenter> implements MainView{
  MainPresenter presenter;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    presenter = initPresenter();
  }

  @Override
  public MainPresenter initPresenter() {
    return new MainPresenter();
  }

  @Override
  public void loadData() {

  }

  @Override
  public void showError(String error) {

  }
}
