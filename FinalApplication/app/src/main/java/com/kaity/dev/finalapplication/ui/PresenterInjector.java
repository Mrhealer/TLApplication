package com.kaity.dev.finalapplication.ui;

import com.kaity.dev.finalapplication.ui.home.HomeContract;
import com.kaity.dev.finalapplication.ui.home.HomePresenter;
import com.kaity.dev.finalapplication.ui.quizattempt.AttemptQuizContract;
import com.kaity.dev.finalapplication.ui.quizattempt.AttemptQuizPresenter;
import com.kaity.dev.finalapplication.ui.quizdetails.QuizDetailsContract;
import com.kaity.dev.finalapplication.ui.quizdetails.QuizDetailsPresenter;
import com.kaity.dev.finalapplication.ui.signin.SignInContract;
import com.kaity.dev.finalapplication.ui.signin.SignInPresenter;

public class PresenterInjector {

    public static void injectSignInPresenter(SignInContract.View signInView) {
        new SignInPresenter(signInView);
    }

    public static void injectHomePresenter(HomeContract.View homeView) {
        new HomePresenter(homeView);
    }

    public static void injectQuizDetailsPresenter(QuizDetailsContract.View quizDetailsView) {
        new QuizDetailsPresenter(quizDetailsView);
    }

    public static void injectQuizAttemptPresenter(AttemptQuizContract.View view) {
        new AttemptQuizPresenter(view);
    }

}
