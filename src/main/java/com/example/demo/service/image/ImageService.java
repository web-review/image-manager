package com.example.demo.service.image;

import com.example.demo.web.dto.ImageDto;

import java.util.List;

public interface ImageService {
    List<ImageDto> findAll();
    void save(ImageDto imageDto);
}
