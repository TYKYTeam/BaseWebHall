package com.tyky.basewebhall.base;

import android.widget.GridView;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.adapter.GridViewAdapter;

/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 个人办事、企业办事、便民服务、政民互动Fragment单独显示GridView基类
 */
public abstract class BaseGridViewFragment extends BaseFragment{

    @Override
    public void initView() {
        GridView gridView = (GridView) getView().findViewById(R.id.gridView);

        GridViewAdapter gridViewAdapter = new GridViewAdapter(getContext(),getImgIds());
        gridView.setAdapter(gridViewAdapter);
    }

    @Override
    public void initData() {

    }

    //抛出获取图片id数组接口
    protected abstract int[] getImgIds();
}
