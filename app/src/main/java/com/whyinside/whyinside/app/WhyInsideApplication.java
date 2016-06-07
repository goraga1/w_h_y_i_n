package com.whyinside.whyinside.app;

import android.app.Application;

/**
 * Created by Hayk on 06/06/2016.
 */
public class WhyInsideApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextHolder.getInstance().setContext(this);
    }
}
