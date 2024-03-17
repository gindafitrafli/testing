package com.ginda.testing.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TESTING_GINDA_DETAILS")
public class TestingGindaDetail {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name="DETAILS")
    private String details;

    @MapsId
    @OneToOne(mappedBy = "detail")
    @JoinColumn(name = "ID")
    private TestingGinda testingGinda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public TestingGinda getTestingGinda() {
        return testingGinda;
    }

    public void setTestingGinda(TestingGinda testingGinda) {
        this.testingGinda = testingGinda;
    }
}
