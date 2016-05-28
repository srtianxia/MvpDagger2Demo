package com.srtianxia.mvpdagger2demo.components;

import com.srtianxia.mvpdagger2demo.model.MainActivityModule;
import com.srtianxia.mvpdagger2demo.view.activity.MainActivity;

import dagger.Component;

/**
 * Created by srtianxia on 2016/5/28.
 */
@Component(modules = {MainActivityModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
