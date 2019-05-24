package com.example.internshiptest.entity;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Subject {

    int mSubjectPicture;
    String mSubjectName;
    float mProgressBar;
    float mProgressPercentage;

    public Subject(int mSubjectPicture, String mSubjectName, float mProgressBar, float mProgressPercentage) {
        this.mSubjectPicture = mSubjectPicture;
        this.mSubjectName = mSubjectName;
        this.mProgressBar = mProgressBar;
        this.mProgressPercentage = mProgressPercentage;
    }

    public int getSubjectPicture() {
        return mSubjectPicture;
    }

    public String getSubjectName() {
        return mSubjectName;
    }

    public float getProgressBar() {
        return mProgressBar;
    }

    public float getmProgressPercentage() {
        return mProgressPercentage;
    }
}
