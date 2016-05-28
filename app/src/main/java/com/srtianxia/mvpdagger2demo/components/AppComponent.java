package com.srtianxia.mvpdagger2demo.components;

import com.srtianxia.mvpdagger2demo.model.RestApiModule;
import com.srtianxia.mvpdagger2demo.presenter.BasePresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by srtianxia on 2016/5/28.
 */
@Singleton
@Component(modules = {RestApiModule.class})
public interface AppComponent {
    void inject(BasePresenter baseHttpPresenter);
}
