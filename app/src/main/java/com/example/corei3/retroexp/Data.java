package com.example.corei3.retroexp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by SONY on 30-08-2017.
 */

public class Data implements Serializable
{   @SerializedName("countryId")
    private String countryId;
    @SerializedName("userId")
    private String userId;

    public String getCountryId ()
    {
        return countryId;
    }

    public void setCountryId (String countryId)
    {
        this.countryId = countryId;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [countryId = "+countryId+", userId = "+userId+"]";
    }
}