package com.example.demo.web.controller;


import com.example.demo.service.image.ImageService;
import com.example.demo.service.image.impl.ImageServiceImpl;
import com.example.demo.web.dto.ImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ImageController {
    ImageService imageService;

    public ImageController() {}

    @Autowired
    public ImageController(ImageServiceImpl userService) {
        this.imageService = userService;
    }

    @GetMapping(value = "/users")
    public List<ImageDto> findAll() {
       return imageService.findAll();
    }

    @PostMapping(value = "/user/save")
    public void save(ImageDto imageDto) { imageService.save(imageDto);
    }

    @GetMapping(value = "/index")
    public String getIndex() {
        return "index";
    }
}
