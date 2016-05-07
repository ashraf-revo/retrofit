package org.revo.Service.domain;

/**
 * Created by revo on 4/28/16.
 */
public class SuggestedChild {
    private String id;
    private int confidence;
    private Child suggested;
    private Child child;

    public SuggestedChild() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public Child getSuggested() {
        return suggested;
    }

    public void setSuggested(Child suggested) {
        this.suggested = suggested;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "SuggestedChild{" +
                "id='" + id + '\'' +
                ", confidence=" + confidence +
                ", suggested=" + suggested +
                ", child=" + child +
                '}';
    }
}
