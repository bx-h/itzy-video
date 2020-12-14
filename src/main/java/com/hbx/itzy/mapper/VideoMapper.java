package com.hbx.itzy.mapper;

import com.hbx.itzy.model.Video;

public interface VideoMapper {
    Video getVideoById(int id);

    int addVideo(Video video);

}
