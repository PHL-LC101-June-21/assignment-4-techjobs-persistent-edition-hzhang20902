package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{




    private String employer;

    private List<Skill> skills = new ArrayList<>();

    @ManyToOne
    public Employer employer1 = new Employer();




    public Job() {
    }

    public Job(String anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
