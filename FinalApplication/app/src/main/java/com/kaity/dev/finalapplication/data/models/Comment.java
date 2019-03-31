package com.kaity.dev.finalapplication.data.models;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Comment {

    @Expose
    @SerializedName("comment")
    private String mComment;

    @Expose
    @SerializedName("comment-by")
    private String mCommentBy;

    @Expose
    @SerializedName("commented-on")
    private long mCommentedOn;

    @Expose
    @SerializedName("commenter-id")
    private String mCommenterId;

    @Expose
    @SerializedName("commenter-pic")
    private String mImageUrl;

    /**
     * This field should be used for storing key of realtime database snapshot, otherwise ignore it
     */
    private String mKey;

    private boolean mIsMyComment;

    public String getComment() {
        return mComment;
    }

    public void setComment(String comment) {
        mComment = comment;
    }

    public String getCommentBy() {
        return mCommentBy;
    }

    public void setCommentBy(String commentBy) {
        mCommentBy = commentBy;
    }

    public long getCommentedOn() {
        return mCommentedOn;
    }

    public void setCommentedOn(long commentedOn) {
        mCommentedOn = commentedOn;
    }

    public String getCommenterId() {
        return mCommenterId;
    }

    public void setCommenterId(String commenterId) {
        mCommenterId = commenterId;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        this.mKey = key;
    }

    public String getImage() {
        return mImageUrl;
    }

    public void setImage(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public boolean isMyComment() {
        return mIsMyComment;
    }

    public void setMyComment(boolean myComment) {
        mIsMyComment = myComment;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return mCommentedOn == comment.mCommentedOn &&
                Objects.equals(mComment, comment.mComment) &&
                Objects.equals(mCommentBy, comment.mCommentBy) &&
                Objects.equals(mCommenterId, comment.mCommenterId) &&
                Objects.equals(mImageUrl, comment.mImageUrl);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(mComment, mCommentBy, mCommentedOn, mCommenterId);
    }
}
