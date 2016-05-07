package org.revo.Service.domain;

/**
 * Created by revo on 4/28/16.
 */
public class LocationMessage extends Point{
    private String id;

    public LocationMessage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
