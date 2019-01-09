package com.app.cmp.mvp.view;

import com.app.library.mvp.view.MvpView;

public interface MainContractView {
    interface Presenter{
        void request();
    }
    interface View extends MvpView
    {

    }
}
