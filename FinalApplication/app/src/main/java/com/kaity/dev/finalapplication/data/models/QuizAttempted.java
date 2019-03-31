package com.kaity.dev.finalapplication.data.models;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class QuizAttempted {
    @Expose
    private long mLesson;

    @Expose
    private long mMaxMarks;

    @Expose
    private long mPercentage;

    @Expose
    private String mQuizId;

    @Expose
    private String mQuizTitle;

    @Expose
    private String mRemarks;

    @Expose
    private long mScore;

    /**
     * This field should be used for storing key of realtime database snapshot, otherwise ignore it
     */
    private String mKey;

    public long getLesson() {
        return mLesson;
    }

    public void setLesson(long lesson) {
        mLesson = lesson;
    }

    public long getMaxMarks() {
        return mMaxMarks;
    }

    public void setMaxMarks(long maxMarks) {
        mMaxMarks = maxMarks;
    }

    public long getPercentage() {
        return mPercentage;
    }

    public void setPercentage(long percentage) {
        mPercentage = percentage;
    }

    public String getQuizId() {
        return mQuizId;
    }

    public void setQuizId(String quizId) {
        mQuizId = quizId;
    }

    public String getQuizTitle() {
        return mQuizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        mQuizTitle = quizTitle;
    }

    public String getRemarks() {
        return mRemarks;
    }

    public void setRemarks(String remarks) {
        mRemarks = remarks;
    }

    public long getScore() {
        return mScore;
    }

    public void setScore(long score) {
        mScore = score;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        this.mKey = key;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuizAttempted that = (QuizAttempted) o;
        return mLesson == that.mLesson &&
                mMaxMarks == that.mMaxMarks &&
                mPercentage == that.mPercentage &&
                mScore == that.mScore &&
                Objects.equals(mQuizId, that.mQuizId) &&
                Objects.equals(mQuizTitle, that.mQuizTitle);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(mLesson, mMaxMarks, mPercentage, mQuizId, mQuizTitle, mScore);
    }
}
