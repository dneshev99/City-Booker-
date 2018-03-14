package com.ip.project.models;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private Blob photo;

    @ManyToOne
    @JoinColumn(name = "place_id",nullable = false)
    private Place place;

    public Long getId() {
        return id;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
}
