package com.artapps.geece.dagger;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class ApplicationModule {

    private final Application app;

    public ApplicationModule(final @NonNull Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    @ForApplication
    public Context providesContext(){
        return app.getApplicationContext();
    }
}
