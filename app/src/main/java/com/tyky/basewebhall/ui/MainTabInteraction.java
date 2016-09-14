package com.tyky.basewebhall.ui;

import android.view.View;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.base.BaseGridViewFragment;

/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 政民互动
 */
public class MainTabInteraction extends BaseGridViewFragment {

    private int[] imgids = {
            R.mipmap.zmhd_wszx,
            R.mipmap.zmhd_wsts,
            R.mipmap.zmhd_wdc,
            R.mipmap.zmhd_fwyj};
    
    @Override
    protected View getLayoutId() {
        return View.inflate(getContext(), R.layout.fragment_maintab_interaction, null);
    }

    @Override
    protected int[] getImgIds() {
        return imgids;
    }
}
