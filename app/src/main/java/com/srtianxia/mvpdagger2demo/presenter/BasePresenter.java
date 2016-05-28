package com.srtianxia.mvpdagger2demo.presenter;

import com.srtianxia.mvpdagger2demo.app.App;
import com.srtianxia.mvpdagger2demo.app.RestApi;

import javax.inject.Inject;

/**
 * Created by srtianxia on 2016/5/28.
 * BasePresenter
 */
public abstract class BasePresenter {
    @Inject
    protected RestApi api;

    public BasePresenter(){
        App.getAppComponent().inject(this);
    }
}
