package com.tyky.basewebhall.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.adapter.TabLayoutViewPagerAdapter;
import com.tyky.basewebhall.base.BaseFragment;
import com.tyky.basewebhall.ui.onlinebusiness.CorporateFragment;
import com.tyky.basewebhall.ui.onlinebusiness.DeclareFragment;
import com.tyky.basewebhall.ui.onlinebusiness.DepartmentFragment;
import com.tyky.basewebhall.ui.onlinebusiness.PersonalFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 网上办事
 */
public class MainTabOnlinebusiness extends BaseFragment {

    private TabLayoutViewPagerAdapter adapter;
    private String[] tv_Titles;
    private List<Fragment> tab_fragments;

    @Bind(R.id.tab_title)
    TabLayout tabTitle;
    @Bind(R.id.tab_viewpager)
    ViewPager tabViewpager;

    @Override
    protected View getLayoutId() {
        return View.inflate(getContext(), R.layout.fragment_maintab_onlinebusiness, null);
    }

    @Override
    public void initView() {
        init_tab();
    }

    @Override
    public void initData() {

    }

    private void init_tab() {
        tab_fragments = new ArrayList<>();
        tab_fragments.add(new PersonalFragment());
        tab_fragments.add(new CorporateFragment());
        tab_fragments.add(new DepartmentFragment());
        tab_fragments.add(new DeclareFragment());

        tv_Titles = getResources().getStringArray(R.array.onlinebusiness_arrays);

        /** 解决 fragment 嵌套切换问题*/
        //adapter = new TabLayoutViewPagerAdapter(getActivity().getSupportFragmentManager(),
        adapter = new TabLayoutViewPagerAdapter(getChildFragmentManager(),
                tv_Titles,
                tab_fragments);
        tabViewpager.setAdapter(adapter);
        //tabViewpager.setOffscreenPageLimit(4);//设置缓存页
        tabTitle.setupWithViewPager(tabViewpager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
