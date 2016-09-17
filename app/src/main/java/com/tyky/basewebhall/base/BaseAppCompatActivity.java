package com.tyky.basewebhall.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tyky.basewebhall.AppManager;
import com.tyky.basewebhall.R;
import com.tyky.basewebhall.interf.BaseViewInterface;

import org.kymjs.kjframe.utils.StringUtils;

import butterknife.ButterKnife;

/**
 * Created by lianghuiyong on 2016/5/25.
 *
 */
public abstract class BaseAppCompatActivity extends AppCompatActivity
        implements BaseViewInterface {

    private View view;

    //绑定布局
    //View.inflate(this, R.layout.activity_app_main, null)
    protected abstract View getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set View
        setView(getLayoutId());
        setContentView(getView());

        //activity进栈
        AppManager.getAppManager().addActivity(this);

        ButterKnife.bind(this);     //注解注册

        initView();
        initData();
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    /**
     * 设置 ToorBar, 标题
     * */
    public void setToolbar(Boolean hasBackHome, String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (StringUtils.isEmpty(title)) {
            title = getString(R.string.app_name);
        }

        toolbar.setTitle(title);

        setSupportActionBar(toolbar);   //该设置要放setTitle之后，否则setTitle会无效

        if (hasBackHome) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    /**
     * 设置 ToorBar, 居中标题
     * */
    public void setToolbarCentel(Boolean hasBackHome, String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (StringUtils.isEmpty(title)) {
            title = getString(R.string.app_name);
        }

        //自定义居中标题
        TextView mTitle = (TextView) findViewById(R.id.title);
        mTitle.setText(title);

        setSupportActionBar(toolbar);   //该设置要放setTitle之后，否则setTitle会无效
        getSupportActionBar().setDisplayShowTitleEnabled(false); //取消显示默认标题

        if (hasBackHome) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * Snackbar 提示
     */
    public void showSnackbar(View view, String s) {
        Snackbar sb = Snackbar.make(view, s, Snackbar.LENGTH_SHORT);
        sb.getView().setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        sb.show();
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
        //overridePendingTransition(R.anim.activity_out_from_right, R.anim.activity_in_from_left);
    }
}
