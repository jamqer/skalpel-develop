package com.artapps.geece;

import android.app.Application;

import com.artapps.geece.dagger.ApplicationComponent;
import com.artapps.geece.dagger.ApplicationModule;
import com.artapps.geece.dagger.DaggerApplicationComponent;


public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupComponent();
    }

    public void setupComponent(){
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);
    }

    public static ApplicationComponent getApplicationComponent(Application application){
        return ((App) application).component;
    }
}
