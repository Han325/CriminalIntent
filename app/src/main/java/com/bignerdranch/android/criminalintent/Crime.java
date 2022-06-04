package com.bignerdranch.android.criminalintent;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequiresPolice;
    private String mSuspect;

    public Crime(){
        this(UUID.randomUUID());
    }


    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(boolean requiresPolice) {
        mRequiresPolice = requiresPolice;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }

    public String getFormattedDate(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());

        return simpleDateFormat.format(mDate);
    }

}
