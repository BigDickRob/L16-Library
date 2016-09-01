package com.example.rbender.l16platformreference;

/**
 * Created by rbender on 8/31/2016.
 */
public class JMessage {
    private String name;
    private boolean enabled;

    public JMessage(String name,boolean enabled){
        this.name=name;
        this.enabled=enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
