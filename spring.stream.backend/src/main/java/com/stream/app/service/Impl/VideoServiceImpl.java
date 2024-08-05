package com.stream.app.service.Impl;

import com.stream.app.entities.Video;
import com.stream.app.reposiotries.VideoRepository;
import com.stream.app.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public Video save(Video video, MultipartFile file) {
        return null;
    }

    @Override
    public Video get(String videoId) {
        return videoRepository.findById(videoId).get();
    }

    @Override
    public Video getByTitle(String title) {
        return videoRepository.findByTitle(title).get();
    }

    @Override
    public List<Video> getAll() {
        return List.of();
    }
}
