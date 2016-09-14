package com.tyky.basewebhall;

import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import com.tyky.basewebhall.base.BaseAppCompatActivity;
import com.tyky.basewebhall.ui.MainActivity;

public class AppStart extends BaseAppCompatActivity {

    @Override
    protected View getLayoutId() {
        return View.inflate(this, R.layout.activity_app_start, null);
    }

    @Override
    public void initView() {
        // 略微放大启动屏
        final ScaleAnimation scaleAnim = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        scaleAnim.setFillAfter(true);
        scaleAnim.setDuration(1000);
        getView().startAnimation(scaleAnim);
        scaleAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationEnd(Animation arg0) {
                redirectTo();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationStart(Animation animation) {}
        });
    }

    @Override
    public void initData() {

    }

    /**
     * 跳转到Main
     */
    private void redirectTo() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
