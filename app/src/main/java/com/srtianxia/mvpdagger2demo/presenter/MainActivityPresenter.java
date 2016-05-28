package com.srtianxia.mvpdagger2demo.presenter;

import com.srtianxia.mvpdagger2demo.model.bean.DailyBean;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by srtianxia on 2016/5/28.
 */
public class MainActivityPresenter extends BasePresenter {
    private View view;

    public MainActivityPresenter(View view){
        this.view = view;
    }

    public void requestDaily(){
        api.getDaily()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<DailyBean>() {
                    @Override
                    public void call(DailyBean dailyBean) {
                        view.show(dailyBean);
                    }
                });
    }

    public interface View{
        void show(DailyBean dailyBean);
    }
}
