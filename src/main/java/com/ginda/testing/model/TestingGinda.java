package com.ginda.testing.model;

import jakarta.persistence.*;


@Entity
@Table(name = "TESTING_GINDA")
public class TestingGinda {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testingGindaIdSeq")
    @SequenceGenerator(sequenceName = "testing_ginda_id", name = "testingGindaIdSeq", allocationSize = 1)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private TestingGindaDetail detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestingGindaDetail getDetail() {
        return detail;
    }

    public void setDetail(TestingGindaDetail detail) {
        this.detail = detail;
    }
}
