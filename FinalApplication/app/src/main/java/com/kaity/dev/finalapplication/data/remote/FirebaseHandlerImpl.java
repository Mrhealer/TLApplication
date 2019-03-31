package com.kaity.dev.finalapplication.data.remote;

import android.graphics.Bitmap;

import com.kaity.dev.finalapplication.data.models.Comment;
import com.kaity.dev.finalapplication.data.models.NotificationPrefs;
import com.kaity.dev.finalapplication.data.models.Quiz;
import com.kaity.dev.finalapplication.data.models.QuizAttempted;
import com.kaity.dev.finalapplication.data.models.Resource;
import com.kaity.dev.finalapplication.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class FirebaseHandlerImpl implements FirebaseHandler {
    @Override
    public void fetchQuizzes(int limitToFirst, Callback<List<Quiz>> callback) {
        List<Quiz> quizList = new ArrayList<>();
        quizList.add(new Quiz("Vishal Sehgal's ID","Vishal Sehgal","Basic quiz for RecyclerView","easy",null,"2018-03-25",4,9,null,0,0.0,"Recycler View Quiz 1","2018-03-25",false,false,"Lesson-4-RecyclerView-Quiz-1"));
        callback.onReponse(quizList);
    }

    @Override
    public void fetchAttemptedQuizzes(Callback<List<QuizAttempted>> callback) {

    }

    @Override
    public void fetchQuizById(String quizId, Callback<Quiz> callback) {

    }

    @Override
    public void updateSlackHandle(String slackHandle, Callback<Void> callback) {

    }

    @Override
    public void updateUserName(String userName, Callback<Void> callback) {

    }

    @Override
    public void updateProfilePic(String profielPicUrl, Callback<Void> callback) {

    }

    @Override
    public void uploadProfilePic(String localPicturePath, Callback<String> callback) {

    }

    @Override
    public void uploadProfilePic(Bitmap picBitmap, Callback<String> callback) {

    }

    @Override
    public void fetchUserInfo(String userIdentifier, Callback<User> callback) {

    }

    @Override
    public void fetchUserScore(String quizId, Callback<Integer> callback) {

    }

    @Override
    public void setUserInfo(User currentUser, Callback<Void> callback) {

    }

    @Override
    public void postComment(String discussionId, String quizId, Comment comment, Callback<Void> callback) {

    }

    @Override
    public void getComments(String discussionId, String quizId, Callback<List<Comment>> callback) {

    }

    @Override
    public void updateMyAttemptedQuizzes(QuizAttempted quizAttempt, Callback<Void> callback) {

    }

    @Override
    public void updateQuizBookmarkStatus(String quizIdentifier, boolean isBookmarked, Callback<Void> callback) {

    }

    @Override
    public void getMyBookmarks(Callback<List<String>> callback) {

    }

    @Override
    public void getMyPreferences(Callback<NotificationPrefs> callback) {

    }

    @Override
    public void updateMyPrefs(NotificationPrefs prefs, Callback<Void> callback) {

    }

    @Override
    public void updateMyFCMToken(String fcmToken) {

    }

    @Override
    public void updateMyStatus(String newStatus, Callback<Void> callback) {

    }

    @Override
    public void fetchResources(int startFrom, int limit, Callback<List<Resource>> callback) {

    }

    @Override
    public void destroy() {

    }
}
