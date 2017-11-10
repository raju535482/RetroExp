package com.example.corei3.retroexp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by SONY on 30-08-2017.
 */

public class RequestMain implements Serializable
{   @SerializedName("device")
    private Device device;

    @SerializedName("data")
    private Data data;

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public Device getDevice ()
    {
        return device;
    }

    public void setDevice (Device device)
    {
        this.device = device;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", device = "+device+"]";
    }
}