package com.example.android.miwok;

/**
 * Creating a custom class called Word.
 * Object of this call will have 4 properties DefaultTranslation, MiwokTranslation,
 * imageResourceId, audioResourceId
 * {@link Word} represents a single Android platform release.
 * a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word (state)*/
    private String mDefaultTranslation;

    /** Miwok translation for the word (state)*/
    private String mMiwokTranslation;

    /** Miwok audio resource id for the word*/
    private int mAudioResourceId;

    /** Miwok image resource integer for the word (state)*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this work */
    private static int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object. (constructor)
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioResourceId  is the resource ID for the audio file associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object. (constructor)
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceId is the drawable resource Id for the image association with the word
     *
     * @param audioResourceId  is the resource ID for the audio file associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     *  Get the default translation of the word. (method)
     */

    public String getDefaultTranslation () {
        return  mDefaultTranslation;
    }

    /**
     *  Get the Miwok translation of the word. (method)
     */

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    /**
     *  Get the image resource Id of the word (method)
     */

    public int getImageResourceId () { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word
     */

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    /**
     * Returns the sound resource ID for the word (method)
     */

    public int getAudioResourceID () { return mAudioResourceId; }

    /**
     * @return the string representation of the (@link word) object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
