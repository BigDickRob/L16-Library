package com.example.rbender.l16platformreference;

import java.util.List;

/**
 * Created by rbender on 8/31/2016.
 */
public class AircraftCapability {
    private String aircraftName;
    private List<JMessage> jMessages;

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public List<JMessage> getjMessages() {
        return jMessages;
    }

    public void setjMessages(List<JMessage> jMessages) {
        this.jMessages = jMessages;
    }
}
