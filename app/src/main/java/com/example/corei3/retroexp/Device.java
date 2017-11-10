package com.example.corei3.retroexp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by SONY on 30-08-2017.
 */

public class Device implements Serializable
{   @SerializedName("id")
    private String id;
    @SerializedName("time")
    private String time;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time = "+time+"]";
    }
}