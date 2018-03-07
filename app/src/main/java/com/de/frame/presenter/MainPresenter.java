package com.de.frame.presenter;


import com.de.frame.contract.model.IMainModel;
import com.de.frame.contract.view.IMainView;

/**
 *
 * @author chenglin
 * @date 2017/12/25
 */

public class MainPresenter extends BasePresenter<IMainView> implements IMainModel {

    @Override
    public void initData() {
    }

    @Override
    public void destroy() {

    }

    @Override
    public void HttpPostTest() {
            mView.postSuccess("post连接成功");
    }
}
