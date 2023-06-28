package com.springboot.jpahibernate.learningjpaandhibernate.SpringDataJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "laptop")
public class LaptopClassSpecificationsEntity {
    @Id
    private int id;

    @Column( name = "name")
    private String name;
    @Column(name = "price")
    private int price;

    public LaptopClassSpecificationsEntity() {
    }

    public LaptopClassSpecificationsEntity(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LaptopClassSpecificationsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
