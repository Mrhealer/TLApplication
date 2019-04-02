package com.kaity.dev.finalapplication.data.remote;

import android.graphics.Bitmap;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.kaity.dev.finalapplication.data.models.Comment;
import com.kaity.dev.finalapplication.data.models.NotificationPrefs;
import com.kaity.dev.finalapplication.data.models.Quiz;
import com.kaity.dev.finalapplication.data.models.QuizAttempted;
import com.kaity.dev.finalapplication.data.models.Resource;
import com.kaity.dev.finalapplication.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class FirebaseHandlerImpl implements FirebaseHandler {

    private static final String KEY_LAST_MODIFIED = "last-modified";

    private DatabaseReference mQuizzesRef;

    private List<ValueEventListener> mValueListeners;

    FirebaseHandlerImpl(){
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference rootRef = firebaseDatabase.getReference();

        mValueListeners = new ArrayList<>();

        mQuizzesRef = rootRef.child(REF_QUIZZES_NODE);
    }

    @Override
    public void fetchQuizzes(int limitToFirst, Callback<List<Quiz>> callback) {
        ValueEventListener listener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if (snapshot != null) {
                    List<Quiz> quizList = new ArrayList<>();
                    for (DataSnapshot childSnapshot : snapshot.getChildren()) {
                        try {
                            Quiz singleQuiz = childSnapshot.getValue(Quiz.class);
                            if (singleQuiz != null && singleQuiz.getTitle() != null) {
                                singleQuiz.setKey(childSnapshot.getKey());
                                Log.d("LongKAKA","fetchQuizzes: "+ singleQuiz);
                                quizList.add(singleQuiz);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    Log.d("LongKAKA","fetchQuizzes: "+ quizList);
                    callback.onReponse(quizList);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                callback.onError();
            }
        };

        Query quizzesRefQuery = mQuizzesRef.orderByChild(KEY_LAST_MODIFIED);

        // TODO: Implement pagination here.
        if (limitToFirst > 0) {
            quizzesRefQuery.limitToFirst(limitToFirst);
        }
        quizzesRefQuery.addValueEventListener(listener);
        mValueListeners.add(listener);
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
