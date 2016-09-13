package com.tyky.basewebhall.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tyky.basewebhall.R;
import com.tyky.basewebhall.interf.BaseViewInterface;

import butterknife.ButterKnife;

/**
 * Created by lianghuiyong on 2016/6/22.
 */
public abstract class BaseFragment extends Fragment implements BaseViewInterface {

    /**
     * 绑定布局
     * 使用：View.inflate(getContext(),R.layout.fragment_main_1, null)
     * */
    protected abstract View getLayoutId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return getLayoutId();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);     //注解注册

        initView();
        initData();
    }


    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }

    public void showSnackbar(View view, String s) {
        Snackbar sb =  Snackbar.make(view, s, Snackbar.LENGTH_SHORT);
        sb.getView().setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        sb.show();
    }

    /**
    * Toast提示
    * */
    public void showToast(String s) {
        Toast.makeText(getContext(),s,Toast.LENGTH_SHORT).show();
    }

}
