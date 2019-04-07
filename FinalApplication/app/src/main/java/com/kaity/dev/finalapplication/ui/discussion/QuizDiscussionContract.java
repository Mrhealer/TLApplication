package com.kaity.dev.finalapplication.ui.discussion;

import com.kaity.dev.finalapplication.data.models.Comment;
import com.kaity.dev.finalapplication.ui.BasePresenter;
import com.kaity.dev.finalapplication.ui.BaseView;

import java.util.List;

public interface QuizDiscussionContract {

    String KEY_QUIZ_ID = "quiz_id";

    /**
     * Discussion View
     */
    interface View extends BaseView<Presenter> {
        void loadComments(List<Comment> discussions);

        void onCommentsLoadError();

        void loadComment(Comment comment);

        void showInvalidInput();
    }

    /**
     * Discussion Presenter
     */
    interface Presenter extends BasePresenter {
        void onClickedSendComment(String comment);
    }
}
