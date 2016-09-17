package com.tyky.basewebhall.ui.onlinebusiness;

import android.view.View;
import android.widget.GridView;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.adapter.GridViewAdapter;
import com.tyky.basewebhall.base.BaseFragment;
import com.tyky.basewebhall.base.BaseGridViewFragment;


/**
 * Created by lianghuiyong@outlook.com
 * Date on 2016/9/13
 * 个人办事
 */
public class PersonalFragment extends BaseGridViewFragment {

    private int[] imgids = {R.mipmap.grbs_sysy, R.mipmap.grbs_hj, R.mipmap.grbs_jy,
            R.mipmap.grbs_by, R.mipmap.grbs_jiuye, R.mipmap.grbs_ns, R.mipmap.grbs_sb,
            R.mipmap.grbs_hy, R.mipmap.grbs_yl, R.mipmap.grbs_crj, R.mipmap.grbs_shqz,
            R.mipmap.grbs_zf, R.mipmap.grbs_sfgz, R.mipmap.grbs_swbz, R.mipmap.grbs_zyzg,
            R.mipmap.grbs_xfwq, R.mipmap.grbs_jt, R.mipmap.grbs_whty, R.mipmap.grbs_zscq,
            R.mipmap.grbs_mzzj, R.mipmap.grbs_qt, R.mipmap.grbs_sx, R.mipmap.grbs_zgz,
            R.mipmap.grbs_mfz, R.mipmap.grbs_jh, R.mipmap.grbs_sxh, R.mipmap.grbs_sy,
            R.mipmap.grbs_cy, R.mipmap.grbs_qj, R.mipmap.grbs_tx, R.mipmap.grbs_hs,
            R.mipmap.grbs_gxbys, R.mipmap.grbs_rc, R.mipmap.grbs_lnr, R.mipmap.grbs_cjr,
            R.mipmap.grbs_tkjt, R.mipmap.grbs_etqsn, R.mipmap.grbs_fn, R.mipmap.grbs_nm,
            R.mipmap.grbs_wgr, R.mipmap.grbs_gatq};

    @Override
    protected View getLayoutId() {
        return View.inflate(getContext(), R.layout.fragment_personal, null);
    }

    @Override
    protected int[] getImgIds() {
        return imgids;
    }
}
