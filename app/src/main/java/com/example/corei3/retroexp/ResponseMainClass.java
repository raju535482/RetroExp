package com.example.corei3.retroexp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SONY on 30-08-2017.
 */

public class ResponseMainClass implements Serializable {

    private String eventVenueAddress;

    private String eventRatingValue;

    private String evntCapacityQty;

    private String eventFeatured;

    private String eventEndDate;

    private String eventLongitude;

    private String eventVenueName;

    private String eventVideo;

    private String eventId;

    private String eventCategoryName;

    private ArrayList<EventClassList> eventClassList;

    private String eventTicketPrice;

    private String eventLatitude;

    private String EventTotalTickets;

    private String eventBoom;

    private String eventIs;

    private String eventPopular;

    private String eventEndTime;

    private String eventStartDate;

    private String eventPhoto;

    private String eventStartTime;

    private String eventCountryName;

    private String eventDescription;

    private String eventName;

    private ArrayList<EventImage> eventImage;

    private String eventThumb;

    private String userEventLike;

    public String getEventVenueAddress ()
    {
        return eventVenueAddress;
    }

    public void setEventVenueAddress (String eventVenueAddress)
    {
        this.eventVenueAddress = eventVenueAddress;
    }

    public String getEventRatingValue ()
    {
        return eventRatingValue;
    }

    public void setEventRatingValue (String eventRatingValue)
    {
        this.eventRatingValue = eventRatingValue;
    }

    public String getEvntCapacityQty ()
    {
        return evntCapacityQty;
    }

    public void setEvntCapacityQty (String evntCapacityQty)
    {
        this.evntCapacityQty = evntCapacityQty;
    }

    public String getEventFeatured ()
    {
        return eventFeatured;
    }

    public void setEventFeatured (String eventFeatured)
    {
        this.eventFeatured = eventFeatured;
    }

    public String getEventEndDate ()
    {
        return eventEndDate;
    }

    public void setEventEndDate (String eventEndDate)
    {
        this.eventEndDate = eventEndDate;
    }

    public String getEventLongitude ()
    {
        return eventLongitude;
    }

    public void setEventLongitude (String eventLongitude)
    {
        this.eventLongitude = eventLongitude;
    }

    public String getEventVenueName ()
    {
        return eventVenueName;
    }

    public void setEventVenueName (String eventVenueName)
    {
        this.eventVenueName = eventVenueName;
    }

    public String getEventVideo ()
    {
        return eventVideo;
    }

    public void setEventVideo (String eventVideo)
    {
        this.eventVideo = eventVideo;
    }

    public String getEventId ()
    {
        return eventId;
    }

    public void setEventId (String eventId)
    {
        this.eventId = eventId;
    }

    public String getEventCategoryName ()
    {
        return eventCategoryName;
    }

    public void setEventCategoryName (String eventCategoryName)
    {
        this.eventCategoryName = eventCategoryName;
    }

    public ArrayList<EventClassList> getEventClassList ()
    {
        return eventClassList;
    }

    public void setEventClassList (ArrayList<EventClassList> eventClassList)
    {
        this.eventClassList = eventClassList;
    }

    public String getEventTicketPrice ()
    {
        return eventTicketPrice;
    }

    public void setEventTicketPrice (String eventTicketPrice)
    {
        this.eventTicketPrice = eventTicketPrice;
    }

    public String getEventLatitude ()
    {
        return eventLatitude;
    }

    public void setEventLatitude (String eventLatitude)
    {
        this.eventLatitude = eventLatitude;
    }

    public String getEventTotalTickets ()
    {
        return EventTotalTickets;
    }

    public void setEventTotalTickets (String EventTotalTickets)
    {
        this.EventTotalTickets = EventTotalTickets;
    }

    public String getEventBoom ()
    {
        return eventBoom;
    }

    public void setEventBoom (String eventBoom)
    {
        this.eventBoom = eventBoom;
    }

    public String getEventIs ()
    {
        return eventIs;
    }

    public void setEventIs (String eventIs)
    {
        this.eventIs = eventIs;
    }

    public String getEventPopular ()
    {
        return eventPopular;
    }

    public void setEventPopular (String eventPopular)
    {
        this.eventPopular = eventPopular;
    }

    public String getEventEndTime ()
    {
        return eventEndTime;
    }

    public void setEventEndTime (String eventEndTime)
    {
        this.eventEndTime = eventEndTime;
    }

    public String getEventStartDate ()
    {
        return eventStartDate;
    }

    public void setEventStartDate (String eventStartDate)
    {
        this.eventStartDate = eventStartDate;
    }

    public String getEventPhoto ()
    {
        return eventPhoto;
    }

    public void setEventPhoto (String eventPhoto)
    {
        this.eventPhoto = eventPhoto;
    }

    public String getEventStartTime ()
    {
        return eventStartTime;
    }

    public void setEventStartTime (String eventStartTime)
    {
        this.eventStartTime = eventStartTime;
    }

    public String getEventCountryName ()
    {
        return eventCountryName;
    }

    public void setEventCountryName (String eventCountryName)
    {
        this.eventCountryName = eventCountryName;
    }

    public String getEventDescription ()
    {
        return eventDescription;
    }

    public void setEventDescription (String eventDescription)
    {
        this.eventDescription = eventDescription;
    }

    public String getEventName ()
    {
        return eventName;
    }

    public void setEventName (String eventName)
    {
        this.eventName = eventName;
    }

    public ArrayList<EventImage> getEventImage ()
    {
        return eventImage;
    }

    public void setEventImage (ArrayList<EventImage> eventImage)
    {
        this.eventImage = eventImage;
    }

    public String getEventThumb ()
    {
        return eventThumb;
    }

    public void setEventThumb (String eventThumb)
    {
        this.eventThumb = eventThumb;
    }

    public String getUserEventLike ()
    {
        return userEventLike;
    }

    public void setUserEventLike (String userEventLike)
    {
        this.userEventLike = userEventLike;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [eventVenueAddress = "+eventVenueAddress+", eventRatingValue = "+eventRatingValue+", evntCapacityQty = "+evntCapacityQty+", eventFeatured = "+eventFeatured+", eventEndDate = "+eventEndDate+", eventLongitude = "+eventLongitude+", eventVenueName = "+eventVenueName+", eventVideo = "+eventVideo+", eventId = "+eventId+", eventCategoryName = "+eventCategoryName+", eventClassList = "+eventClassList+", eventTicketPrice = "+eventTicketPrice+", eventLatitude = "+eventLatitude+", EventTotalTickets = "+EventTotalTickets+", eventBoom = "+eventBoom+", eventIs = "+eventIs+", eventPopular = "+eventPopular+", eventEndTime = "+eventEndTime+", eventStartDate = "+eventStartDate+", eventPhoto = "+eventPhoto+", eventStartTime = "+eventStartTime+", eventCountryName = "+eventCountryName+", eventDescription = "+eventDescription+", eventName = "+eventName+", eventImage = "+eventImage+", eventThumb = "+eventThumb+", userEventLike = "+userEventLike+"]";
    }
}
