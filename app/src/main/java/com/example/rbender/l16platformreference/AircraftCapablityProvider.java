package com.example.rbender.l16platformreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbender on 8/31/2016.
 */
public class AircraftCapablityProvider {
    public static List<AircraftCapability> getAircraftCapabilities() {
        List<AircraftCapability> capes = new ArrayList<>();
        AircraftCapability aircraft = new AircraftCapability();
        aircraft.setAircraftName("F15 E Suite 7E");
        List<JMessage> jMessages = new ArrayList<>();
        jMessages.add(new JMessage("J3.5 Land Point/Track", true));
        jMessages.add(new JMessage("J3.4 Subsurface", false));
        aircraft.setjMessages(jMessages);
        capes.add(aircraft);

        aircraft = new AircraftCapability();
        aircraft.setAircraftName("F16C+ SCU 6");
        jMessages = new ArrayList<>();
        jMessages.add(new JMessage("J3.4 Subsurface", false));
        jMessages.add(new JMessage("J3.5 Land Point/Track", true));
        jMessages.add(new JMessage("J28.2 Text Message", true));

        capes.add(aircraft);

        return capes;
    }
}
