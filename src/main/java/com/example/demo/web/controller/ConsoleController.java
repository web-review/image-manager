package com.example.demo.web.controller;

import com.example.demo.service.image.Image;
import com.example.demo.web.dto.ImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

@Configuration
public class ConsoleController {
    ImageController imageController;
    Scanner in = new Scanner(System.in);
    boolean answer = true;

    @Autowired
    public ConsoleController(ImageController controller) {
        this.imageController = controller;
    }

    public void run() {
        ImageDto imageDto = new ImageDto();
        imageDto.initContent("image/i1.jpg");
        imageDto.setName("i1");
        imageDto.setFormat(".jpg");
        imageController.save(imageDto);
    }
}
