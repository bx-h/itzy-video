package com.hbx.itzy.mapper;

import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    String getComment(@Param("userId") int userId, @Param("videoId") int videoId);
}
