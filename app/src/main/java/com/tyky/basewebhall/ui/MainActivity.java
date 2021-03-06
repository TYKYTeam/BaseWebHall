package com.tyky.basewebhall.ui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.base.BaseAppCompatActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseAppCompatActivity implements TabHost.OnTabChangeListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(android.R.id.tabhost)
    FragmentTabHost tabhost;
    @BindView(R.id.city)
    TextView city;

    private String mTitles[] = {"网上办事", "便民服务", "政民互动", "个人中心"};

    private Class mClass[] = {
            MainTabOnlinebusiness.class,
            MainTabConvenience.class,
            MainTabInteraction.class,
            MainTabPersonal.class};

    private int mImages[] = {
            R.drawable.main_tab_1,
            R.drawable.main_tab_2,
            R.drawable.main_tab_3,
            R.drawable.main_tab_4};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    protected View getLayoutId() {
        return View.inflate(this, R.layout.activity_app_main, null);
    }


    @Override
    public void initView() {
        setMainToolbar();

        initTab();
    }

    /**
     * 设置toolbar
     */
    private void setMainToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false); //取消显示默认标题
    }

    @Override
    public void initData() {
        tabhost.setOnTabChangedListener(this);
    }

    //初始化底部导航栏
    public void initTab() {
        tabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        tabhost.getTabWidget().setDividerDrawable(null);

        for (int i = 0; i < mClass.length; i++) {
            TabHost.TabSpec tabSpec = tabhost.newTabSpec(mTitles[i]).setIndicator(getTabView(i));
            tabhost.addTab(tabSpec, mClass[i], null);
            tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.WHITE);
        }
    }

    private View getTabView(int index) {
        View view = LayoutInflater.from(this).inflate(R.layout.item_main_tab, null);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView title = (TextView) view.findViewById(R.id.title);

        image.setImageResource(mImages[index]);
        title.setText(mTitles[index]);

        return view;
    }


    //切换底部导航栏时改变标题
    @Override
    public void onTabChanged(String s) {
        //toolbarTv.setText(s);
    }

    @OnClick(R.id.city)
    public void onClick() {
        Intent intent = new Intent(this,ChooseCityActivity.class);
        startActivity(intent);
    }

}
