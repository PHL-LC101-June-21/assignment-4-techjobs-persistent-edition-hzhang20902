package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private static String description;

    public Skill(){}

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}