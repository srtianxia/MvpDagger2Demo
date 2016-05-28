package com.srtianxia.mvpdagger2demo.app;

import android.app.Application;
import android.content.Context;

import com.srtianxia.mvpdagger2demo.components.AppComponent;
import com.srtianxia.mvpdagger2demo.components.DaggerAppComponent;
import com.srtianxia.mvpdagger2demo.model.RestApiModule;

/**
 * Created by srtianxia on 2016/5/28.
 */
public class App extends Application {
    private static AppComponent appComponent;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        appComponent = DaggerAppComponent.builder()
                .restApiModule(new RestApiModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static Context getContext() {
        return context;
    }
}
