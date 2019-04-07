package com.kaity.dev.finalapplication.ui.signin;

import android.net.Uri;

import com.kaity.dev.finalapplication.ui.BasePresenter;
import com.kaity.dev.finalapplication.ui.BaseView;

public interface SignInContract {

    /**
     * SignIn View
     */
    interface View extends BaseView<Presenter> {

        void loginSuccess();

        void loginFailure(int statusCode, String message);

        void startSignIn();

        void navigateToProfile();
    }

    /**
     * SignIn Presenter
     */
    interface Presenter extends BasePresenter {

        void handleLoginRequest();

        void handleLoginSuccess(String email, String displayName, Uri photoUrl);

        void handleLoginFailure(int statusCode, String message);
    }

}
