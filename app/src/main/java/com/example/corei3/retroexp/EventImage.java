package com.example.corei3.retroexp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by SONY on 30-08-2017.
 */

public class EventImage implements Serializable {
    private String ephEventPhotoName;

    public String getEphEventPhotoName ()
    {
        return ephEventPhotoName;
    }

    public void setEphEventPhotoName (String ephEventPhotoName)
    {
        this.ephEventPhotoName = ephEventPhotoName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ephEventPhotoName = "+ephEventPhotoName+"]";
    }

}
