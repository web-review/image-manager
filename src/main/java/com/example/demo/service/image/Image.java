package com.example.demo.service.image;

import lombok.*;

import javax.persistence.*;
import java.io.File;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "images")
public class Image {
    @ToString.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "format")
    private String format;
    @Column(name = "content")
    private File content;
}
