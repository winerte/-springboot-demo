package com.winerte.service;

import org.springframework.web.multipart.MultipartFile;

public interface IOssService {
    String upload(String url);
    String upload(MultipartFile file);
    boolean needUpload(String imageUrl);
}