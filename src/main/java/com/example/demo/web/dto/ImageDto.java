package com.example.demo.web.dto;

import lombok.*;

import java.io.File;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImageDto {
    @ToString.Exclude
    private Long id;
    private String name;
    private String format;
    private File content;

    public void initContent(String pathname) {
        File file = new File(pathname);
        content = file;
    }
}
