package com.de.frame.contract.view;

/**
 * 描述：行政村编辑页View
 * 公司：北京海鑫科金高科技股份有限公司
 * 创建时间:2017年12月26日
 * 最后修改时间:2017年12月26日
 * @author chenglin
 */
public interface IMainView extends IBaseView {
    /**
     * 连接成功
     * @param result
     */
    void postSuccess(String result);
    /**
     * 连接失败
     * @param result
     */
    void postFailure(String result);
}
