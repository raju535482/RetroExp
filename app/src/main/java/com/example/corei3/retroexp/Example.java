package com.example.corei3.retroexp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SONY on 30-08-2017.
 */

public class Example implements Serializable {
    private ArrayList<ResponseMainClass> data;

    private String code;

    public ArrayList<ResponseMainClass> getData ()
    {
        return data;
    }

    public void setData (ArrayList<ResponseMainClass> data)
    {
        this.data = data;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", code = "+code+"]";
    }
}
