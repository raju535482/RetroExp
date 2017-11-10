package com.example.corei3.retroexp;

import java.io.Serializable;

/**
 * Created by SONY on 28-10-2017.
 */

public class EventClassList implements Serializable {
    private String evntClassQty;

    private String evntId;

    private String evntClassPrice;

    private String evntClassId;

    private String evntClassCreateDate;

    private String evntClassIsDelete;

    private String evntClassName;

    public String getEvntClassQty ()
    {
        return evntClassQty;
    }

    public void setEvntClassQty (String evntClassQty)
    {
        this.evntClassQty = evntClassQty;
    }

    public String getEvntId ()
    {
        return evntId;
    }

    public void setEvntId (String evntId)
    {
        this.evntId = evntId;
    }

    public String getEvntClassPrice ()
    {
        return evntClassPrice;
    }

    public void setEvntClassPrice (String evntClassPrice)
    {
        this.evntClassPrice = evntClassPrice;
    }

    public String getEvntClassId ()
    {
        return evntClassId;
    }

    public void setEvntClassId (String evntClassId)
    {
        this.evntClassId = evntClassId;
    }

    public String getEvntClassCreateDate ()
    {
        return evntClassCreateDate;
    }

    public void setEvntClassCreateDate (String evntClassCreateDate)
    {
        this.evntClassCreateDate = evntClassCreateDate;
    }

    public String getEvntClassIsDelete ()
    {
        return evntClassIsDelete;
    }

    public void setEvntClassIsDelete (String evntClassIsDelete)
    {
        this.evntClassIsDelete = evntClassIsDelete;
    }

    public String getEvntClassName ()
    {
        return evntClassName;
    }

    public void setEvntClassName (String evntClassName)
    {
        this.evntClassName = evntClassName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [evntClassQty = "+evntClassQty+", evntId = "+evntId+", evntClassPrice = "+evntClassPrice+", evntClassId = "+evntClassId+", evntClassCreateDate = "+evntClassCreateDate+", evntClassIsDelete = "+evntClassIsDelete+", evntClassName = "+evntClassName+"]";
    }
}
