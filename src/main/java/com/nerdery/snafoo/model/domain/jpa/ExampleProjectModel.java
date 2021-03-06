package com.nerdery.snafoo.model.domain.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Example domain model object with a few persistence annotations. It can be safely deleted once you have implemented your
 * own model class(es).
 */
@Entity
public class ExampleProjectModel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int hours;

    @Column(nullable = false)
    private int developers;

    public ExampleProjectModel() {
    }

    public ExampleProjectModel(String name, int hours, int developers) {
        this.name = name;
        this.hours = hours;
        this.developers = developers;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDevelopers() {
        return developers;
    }

    public void setDevelopers(int developers) {
        this.developers = developers;
    }
}
