package com.laptrinhjavaweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "numberofbasement")
    private Integer numberOfBasement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfBasement() {
        return numberOfBasement;
    }

    public void setNumberOfBasement(Integer numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }
}
