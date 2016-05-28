package com.srtianxia.mvpdagger2demo.model;

import com.srtianxia.mvpdagger2demo.app.RestApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by srtianxia on 2016/5/28.
 */
@Module
public class RestApiModule {
    @Provides
    @Singleton
    RestApi provideApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RestApi.BASIC_DAILY)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(RestApi.class);
    }
}
