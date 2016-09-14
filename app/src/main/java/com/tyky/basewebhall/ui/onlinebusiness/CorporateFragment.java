package com.tyky.basewebhall.ui.onlinebusiness;

import android.view.View;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.base.BaseGridViewFragment;

/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 企业办事
 */
public class CorporateFragment extends BaseGridViewFragment {

    private int[] imgids = {R.mipmap.qybs_slbg, R.mipmap.qybs_njns, R.mipmap.qybs_cwsw,
            R.mipmap.qybs_zyzb, R.mipmap.qybs_lxsp, R.mipmap.qybs_zzrz, R.mipmap.qybs_jrtz,
            R.mipmap.qybs_dwjl, R.mipmap.qybs_sfgz, R.mipmap.qybs_jsgl, R.mipmap.qybs_ldbz,
            R.mipmap.qybs_rlzy, R.mipmap.qybs_zljc, R.mipmap.qybs_aqfh, R.mipmap.qybs_hblh,
            R.mipmap.qybs_tdfc, R.mipmap.qybs_wwbh, R.mipmap.qybs_xwgd, R.mipmap.qybs_jtys,
            R.mipmap.qybs_nlmy, R.mipmap.qybs_slyw, R.mipmap.qybs_ylws, R.mipmap.qybs_zscq,
            R.mipmap.qybs_pczx, R.mipmap.qybs_qt, R.mipmap.qybs_kbqy, R.mipmap.qybs_sqzz,
            R.mipmap.qybs_tzlx, R.mipmap.qybs_kdsc, R.mipmap.qybs_yjrc, R.mipmap.qybs_blsb,
            R.mipmap.qybs_sqzl, R.mipmap.qybs_nsjf, R.mipmap.qybs_sqdk, R.mipmap.qybs_sqpc,
            R.mipmap.qybs_zxqy, R.mipmap.qybs_myqy, R.mipmap.qybs_gxjsqy, R.mipmap.qybs_knqy,
            R.mipmap.qybs_zdqy, R.mipmap.qybs_syqy, R.mipmap.qybs_shzz, R.mipmap.qybs_gtgsh};

    @Override
    protected View getLayoutId() {
        return View.inflate(getContext(), R.layout.fragment_corprorate, null);
    }


    @Override
    protected int[] getImgIds() {
        return imgids;
    }

}
