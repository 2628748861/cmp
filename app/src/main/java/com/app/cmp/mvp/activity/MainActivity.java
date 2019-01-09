package com.app.cmp.mvp.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.app.cmp.R;
import com.app.cmp.config.db.DbApiProxy;
import com.app.cmp.mvp.presenter.MainPresenter;
import com.app.cmp.mvp.view.MainContractView;
import com.app.library.frame.imageloader.ImageLoaderProxy;
import com.app.library.mvp.activity.BaseMvpActivity;
import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContractView.View {

    @BindView(R.id.image)
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //网络请求
        p.request();
        //图片加载
        ImageLoaderProxy.getInstance().display(mContext,"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=3402268747,3143931720&fm=85&app=57&f=JPEG?w=121&h=75&s=B103D014D4B4CF861F66D9CA030020BF",image);
        //数据库请求

        //权限请求
    }

    @Override
    public int applyContent() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }
}
