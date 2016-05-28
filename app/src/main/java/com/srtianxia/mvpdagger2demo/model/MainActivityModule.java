package com.srtianxia.mvpdagger2demo.model;

import com.srtianxia.mvpdagger2demo.presenter.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by srtianxia on 2016/5/28.
 */
@Module
public class MainActivityModule {
    private MainActivityPresenter.View view;

    public MainActivityModule(MainActivityPresenter.View view){
        this.view = view;
    }

    @Provides
    MainActivityPresenter provideMainActivityPresenter(MainActivityPresenter.View view) {
        return new MainActivityPresenter(view);
    }

    @Provides
    MainActivityPresenter.View provideMainActivityView(){
        return view;
    }
}
