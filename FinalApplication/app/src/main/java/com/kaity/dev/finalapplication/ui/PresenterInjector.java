package com.kaity.dev.finalapplication.ui;

import com.kaity.dev.finalapplication.ui.home.HomeContract;
import com.kaity.dev.finalapplication.ui.home.HomePresenter;

public class PresenterInjector {

    public static void injectHomePresenter(HomeContract.View homeView) {
        new HomePresenter(homeView);
    }
}
