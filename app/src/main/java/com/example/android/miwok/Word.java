package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTransalation, String miwokTranslation) {
        mDefaultTranslation = defaultTransalation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTransalation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTransalation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
