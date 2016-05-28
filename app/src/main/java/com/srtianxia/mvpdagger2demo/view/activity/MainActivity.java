package com.srtianxia.mvpdagger2demo.view.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.srtianxia.mvpdagger2demo.R;
import com.srtianxia.mvpdagger2demo.app.BaseActivity;
import com.srtianxia.mvpdagger2demo.components.DaggerMainActivityComponent;
import com.srtianxia.mvpdagger2demo.model.MainActivityModule;
import com.srtianxia.mvpdagger2demo.model.bean.DailyBean;
import com.srtianxia.mvpdagger2demo.presenter.MainActivityPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainActivityPresenter.View {
    @Inject
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DaggerMainActivityComponent.builder().mainActivityModule(new MainActivityModule(this))
                .build().inject(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.requestDaily();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void show(DailyBean dailyBean) {
        Log.d("123",dailyBean.getDate());
    }
}
