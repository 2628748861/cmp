package com.app.cmp.mvp.presenter;

import android.util.Log;

import com.app.cmp.config.request.HttpApiProxy;
import com.app.cmp.config.request.IUserService;
import com.app.cmp.mvp.view.MainContractView;
import com.app.library.frame.request.after.AppResultObservable;
import com.app.library.frame.request.entity.BaseResponseEntity;
import com.app.library.mvp.presenter.MvpPresenter;
import com.app.library.util.RxUtils;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

public class MainPresenter extends MvpPresenter<MainContractView.View> implements MainContractView.Presenter {
    public MainPresenter(MainContractView.View view) {
        super(view);
    }

    @Override
    public void request() {
        HttpApiProxy.getInstance().create(IUserService.class)
                .getArticleCategory()
                .compose(RxUtils.schedulerWithDialog(compositeDisposable,v))
                .subscribe(new AppResultObservable<BaseResponseEntity<List<LinkedTreeMap<String, String>>>>() {
                    @Override
                    public void onSuccess(BaseResponseEntity<List<LinkedTreeMap<String, String>>> listBaseResponseEntity) {
                        Log.e("TAG","onSuccess:"+listBaseResponseEntity.getMsg());
                    }
                    @Override
                    public void onErrors(String s) {
                        Log.e("TAG","onErrors:"+s);
                    }
                });
    }
}
