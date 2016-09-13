package com.tyky.basewebhall.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;


import com.tyky.basewebhall.AppManager;
import com.tyky.basewebhall.interf.BaseViewInterface;

import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;


/**
 * Created by lenovo on 2016/5/25.
 * AppCompat风格
 */
public abstract class BaseActivity extends Activity implements BaseViewInterface {

    private EventBus eventBus;

    //绑定布局
    protected abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        AppManager.getAppManager().addActivity(this);

        ButterKnife.bind(this);     //注解注册

        //注册EventBus
        eventBus = EventBus.getDefault();
        eventBus.register(this);

        initView();
        initData();
    }

    //注册eventbus必须有此方法
    public void onEventMainThread(Object object){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);   //注解注销

        //注销
        eventBus.unregister(this);
    }

    /**Toast提示*/
    public void showToast(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        //overridePendingTransition(R.anim.activity_in_from_left, R.anim.activity_out_from_right);
    }

    @Override
    public void finish() {
        super.finish();
        //overridePendingTransition(R.anim.activity_in_from_left, R.anim.activity_out_from_right);
    }
}
