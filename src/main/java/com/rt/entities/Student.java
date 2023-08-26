package com.rt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sname")
    private String sname;

    @Column(name = "age")
    private String age;

    @Column(name = "adr")
    private String adr;

    @Column(name = "mob")
    private String mob;

    public Student() {
    }

    public Student(int id, String name, String sname, String age, String adr, String mob) {
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.adr = adr;
        this.mob = mob;
    }

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

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getage() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
