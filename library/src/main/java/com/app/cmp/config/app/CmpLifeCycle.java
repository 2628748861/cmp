package com.app.cmp.config.app;

import android.content.Context;
import android.util.Log;

import com.app.cmp.config.db.DbApiProxy;
import com.app.cmp.config.db.GreenDaoApi;
import com.app.cmp.config.request.HttpApiProxy;
import com.app.cmp.config.request.RetrofitApi;
import com.app.library.BuildConfig;
import com.app.library.app.AppLifecycle;

public class CmpLifeCycle implements AppLifecycle {
    @Override
    public void onAttach(Context applicationContext) {
        Log.e("TAG","初始化:"+CmpLifeCycle.class.getSimpleName());
        HttpApiProxy.init(new RetrofitApi());
        DbApiProxy.init(new GreenDaoApi(applicationContext,BuildConfig.DB_NAME));
    }
}
