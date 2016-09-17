package com.tyky.basewebhall.ui;

import android.view.View;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.base.BaseAppCompatActivity;

/**
 * 选择
 * */
public class ChooseCityActivity extends BaseAppCompatActivity {

    @Override
    protected View getLayoutId() {
        return View.inflate(this, R.layout.activity_choose_city, null);
    }

    @Override
    public void initView() {
        setToolbar(true,"选择区域");
    }

    @Override
    public void initData() {

    }
}
