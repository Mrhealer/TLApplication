package com.kaity.dev.finalapplication.data.models;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class User {
    @Expose
    @SerializedName("email")
    private String mEmail;

    @Expose
    @SerializedName("image")
    private String mImage;

    @Expose
    @SerializedName("moderator")
    private boolean mModerator;

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("slack-handle")
    private String mSlackHandle;

    @Expose
    @SerializedName("status")
    private String mStatus;

    @Expose
    @SerializedName("track")
    private String mTrack;

    @Expose
    @SerializedName("fcm-token")
    private String mFcmToken;

    @Expose
    @SerializedName("attempted")
    private Map<String, QuizAttempted> mAttemptedList;

    @Expose
    @SerializedName("prefs")
    private NotificationPrefs mNotificationPrefs;

    @Expose
    @SerializedName("bookmarks")
    private Map<String, Boolean> mBookmarks;

    /**
     * This field should be used for storing key of realtime database snapshot, otherwise ignore it
     */
    private String mKey;

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public boolean getModerator() {
        return mModerator;
    }

    public void setModerator(boolean moderator) {
        mModerator = moderator;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSlackHandle() {
        return mSlackHandle;
    }

    public void setSlackHandle(String slackHandle) {
        mSlackHandle = slackHandle;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getTrack() {
        return mTrack;
    }

    public void setTrack(String track) {
        mTrack = track;
    }

    public String getFcmToken() {
        return mFcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.mFcmToken = fcmToken;
    }

    public Map<String, QuizAttempted> getAttemptedList() {
        return mAttemptedList;
    }

    public void setAttemptedList(Map<String, QuizAttempted> attemptedList) {
        this.mAttemptedList = attemptedList;
    }

    public NotificationPrefs getNotificationPrefs() {
        return mNotificationPrefs;
    }

    public void setNotificationPrefs(NotificationPrefs notificationPrefs) {
        this.mNotificationPrefs = notificationPrefs;
    }

    public Map<String, Boolean> getBookmarks() {
        return mBookmarks;
    }

    public void setBookmarks(Map<String, Boolean> bookmarks) {
        this.mBookmarks = bookmarks;
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
        User user = (User) o;
        return mModerator == user.mModerator &&
                Objects.equals(mEmail, user.mEmail) &&
                Objects.equals(mImage, user.mImage) &&
                Objects.equals(mName, user.mName) &&
                Objects.equals(mSlackHandle, user.mSlackHandle) &&
                Objects.equals(mTrack, user.mTrack);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(mEmail, mImage, mModerator, mName, mSlackHandle, mTrack);
    }
}
