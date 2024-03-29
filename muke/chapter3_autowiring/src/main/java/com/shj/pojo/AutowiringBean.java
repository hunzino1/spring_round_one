package com.shj.pojo;

/**
 * @create 2019/6/28
 */
public class AutowiringBean {
    private InjectBean injectBean;

    //Construor时必须有
    public AutowiringBean(InjectBean injectBean) {
        this.injectBean = injectBean;
    }

    public void setInjectBean(InjectBean injectBean) {
        this.injectBean = injectBean;
    }

    public InjectBean getInjectBean() {
        return this.injectBean;
    }

    public void say(){
        // 直接调用InjectBean的saySomething()
        getInjectBean().saySomething();
    }
}
