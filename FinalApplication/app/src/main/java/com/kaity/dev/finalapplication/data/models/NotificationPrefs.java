package com.kaity.dev.finalapplication.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationPrefs {
    @Expose
    @SerializedName("comment-notifs")
    boolean mCommentNotifs;

    @Expose
    @SerializedName("member-messages")
    boolean mMemberMessages;

    @Expose
    @SerializedName("moderator-messages")
    boolean mModeratorMessages;

    @Expose
    @SerializedName("quiz-notifs")
    boolean mQuizNotifs;

    /**
     * This field should be used for storing key of realtime database snapshot, otherwise ignore it
     */
    String mKey;

    public boolean getCommentNotifs() {
        return mCommentNotifs;
    }

    public void setCommentNotifs(boolean commentNotifs) {
        mCommentNotifs = commentNotifs;
    }

    public boolean getMemberMessages() {
        return mMemberMessages;
    }

    public void setMemberMessages(boolean memberMessages) {
        mMemberMessages = memberMessages;
    }

    public boolean getModeratorMessages() {
        return mModeratorMessages;
    }

    public void setModeratorMessages(boolean moderatorMessages) {
        mModeratorMessages = moderatorMessages;
    }

    public boolean getQuizNotifs() {
        return mQuizNotifs;
    }

    public void setQuizNotifs(boolean quizNotifs) {
        mQuizNotifs = quizNotifs;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        this.mKey = key;
    }
}
