package com.artapps.geece.dagger;

import javax.inject.Singleton;

import dagger.Component;
import com.artapps.geece.App;
import com.artapps.geece.MainActivity;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App application);
    void inject(MainActivity mainActivity);

}
