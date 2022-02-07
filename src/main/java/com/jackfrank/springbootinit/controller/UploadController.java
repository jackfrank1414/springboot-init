package com.jackfrank.springbootinit.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/28 22:57
 */
@Slf4j
@RestController
@Api(value = "上传图片")
public class UploadController {

    @PostMapping("upload")
    public String upload(MultipartFile multipartFile) throws IOException {
        multipartFile.transferTo(new File(Objects.requireNonNull(multipartFile.getOriginalFilename())));
        log.info("图片上传成功！");
        return "图片上传成功！";
    }
}
