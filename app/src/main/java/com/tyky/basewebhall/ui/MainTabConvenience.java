package com.tyky.basewebhall.ui;

import android.view.View;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.base.BaseFragment;
import com.tyky.basewebhall.base.BaseGridViewFragment;

/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 便民服务
 */
public class MainTabConvenience extends BaseGridViewFragment {

    private int[] imgids = { R.mipmap.bmfw_hjbl, R.mipmap.bmfw_jsfw,
            R.mipmap.bmfw_sbcx, R.mipmap.bmfw_bzxzf, R.mipmap.bmfw_jtwf,
            R.mipmap.bmfw_gjjcx, R.mipmap.bmfw_sqfw, R.mipmap.bmfw_jyfw };


    @Override
    protected View getLayoutId() {
        return View.inflate(getContext(), R.layout.fragment_maintab_convenience, null);
    }

    @Override
    protected int[] getImgIds() {
        return imgids;
    }
}
