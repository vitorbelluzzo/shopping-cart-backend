package com.ventidue.shoppingCartBackend.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Blob;


@Data

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;

    private String downloadUrl;

    @Autowired
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
