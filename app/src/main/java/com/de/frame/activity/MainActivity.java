package com.de.frame.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.de.frame.R;
import com.de.frame.contract.view.IMainView;
import com.de.frame.presenter.MainPresenter;
import com.de.frame.widget.CustomToast;

/**
 * mvpce框架主界面
 * Created by chenglin on 2018/3/7.
 */

public class MainActivity extends BaseActivity<IMainView, MainPresenter> implements IMainView, View.OnClickListener  {

    /**
     * post测试按键
     */
    private Button mPostButton;

    @Override
    protected void initVariables() {
    }

    @Override
    protected IMainView initAttachView() {
        return this;
    }

    @Override
    protected void initView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_main);
        mPostButton =  (Button) findViewById(R.id.http_post);

    }

    @Override
    protected void initListener() {
        mPostButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.http_post) {
            mPresenter.HttpPostTest();
        }
    }

    @Override
    public void postSuccess(String result) {
        CustomToast.showLong(result);
    }

    @Override
    public void postFailure(String result) {
        CustomToast.showLong("post连接失败");
    }
}
