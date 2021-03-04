package com.example.demo.service.image.impl;

import com.example.demo.service.image.Image;
import com.example.demo.service.repository.ImageRepository;
import com.example.demo.service.image.ImageService;
import com.example.demo.web.dto.ImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ConfigurableApplicationContext context) {
        this.imageRepository = context.getBean(ImageRepository.class);
    }

    @Override
    public List<ImageDto> findAll() {
        List<ImageDto> images = new LinkedList<>();
        for (Image image: imageRepository.findAll()) {
            ImageDto imageDto = new ImageDto(image.getId(),
                    image.getName(),
                    image.getFormat(),
                    image.getContent());
            images.add(imageDto);
        }
        return images;
    }

    @Override
    public void save(ImageDto imageDto) {
        Image image = new Image(imageDto.getId(),
                imageDto.getName(),
                imageDto.getFormat(),
                imageDto.getContent());
        imageRepository.save(image);
    }
}
