package org.revo.Service.domain;

import org.revo.Service.domain.Enum.Gender;
import org.revo.Service.domain.Enum.State;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by revo on 4/28/16.
 */
public class Child {
    private String id;
    private String name;
    private String image;
    private String moreInfo;
    private Point addresses;
    private Person person;
    private State state;
    private Set<SuggestedChild> suggestedChild = new HashSet<>();
    private Gender gender;
    private int age;
    private String uid;
    private boolean founded;
    private Date createdDate;
    private String file;

    public Child() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Point getAddresses() {
        return addresses;
    }

    public void setAddresses(Point addresses) {
        this.addresses = addresses;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<SuggestedChild> getSuggestedChild() {
        return suggestedChild;
    }

    public void setSuggestedChild(Set<SuggestedChild> suggestedChild) {
        this.suggestedChild = suggestedChild;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isFounded() {
        return founded;
    }

    public void setFounded(boolean founded) {
        this.founded = founded;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                ", addresses=" + addresses +
                ", person=" + person +
                ", state=" + state +
                ", suggestedChild=" + suggestedChild +
                ", gender=" + gender +
                ", age=" + age +
                ", uid='" + uid + '\'' +
                ", founded=" + founded +
                ", createdDate=" + createdDate +
                ", file='" + file + '\'' +
                '}';
    }
}
