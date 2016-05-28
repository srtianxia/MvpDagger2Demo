package com.srtianxia.mvpdagger2demo.app;

import com.srtianxia.mvpdagger2demo.model.bean.DailyBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by srtianxia on 2016/5/28.
 */
public interface RestApi {
    String BASIC_DAILY = "http://news-at.zhihu.com/api/4/";

    @GET("news/latest")
    Observable<DailyBean> getDaily();
}
