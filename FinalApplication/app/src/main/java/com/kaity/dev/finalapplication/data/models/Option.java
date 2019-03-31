package com.kaity.dev.finalapplication.data.models;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Option {
    @Expose
    @SerializedName("description")
    private String mDescription;

    /**
     * Since we are using the same model to store correct answers and scholar's answers, this field
     * can represent either
     */
    @Expose
    @SerializedName("is-correct")
    private boolean mIsCorrect;

    @Expose
    @SerializedName("remarks")
    private String mRemarks;

    /**
     * This field should be used for storing key of realtime database snapshot, otherwise ignore it
     */
    String mKey;

    public Option() {

    }

    /**
     * Copy constructor
     *
     * @param toClone Option object to be shallow copied
     */
    public Option(@NonNull Option toClone) {
        mDescription = toClone.mDescription;
        mIsCorrect = toClone.mIsCorrect;
        mRemarks = toClone.mRemarks;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isCorrect() {
        return mIsCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        mIsCorrect = isCorrect;
    }

    public String getRemarks() {
        return mRemarks;
    }

    public void setRemarks(String remarks) {
        mRemarks = remarks;
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
        Option option = (Option) o;
        return mIsCorrect == option.mIsCorrect &&
                Objects.equals(mDescription, option.mDescription) &&
                Objects.equals(mRemarks, option.mRemarks);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(mDescription, mIsCorrect, mRemarks);
    }
}
