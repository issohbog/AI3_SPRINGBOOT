package com.aloha.rest.service;

import java.util.List;

import com.aloha.rest.dto.Posts;

public interface PostService {
    // 목록
    public List<Posts> list() throws Exception;
    // 조회 
    public Posts select(Integer no) throws Exception;
    // 등록
    public Boolean insert(Posts post) throws Exception;
    // 수정
    public Boolean update(Posts post) throws Exception;
    // 삭제
    public Boolean delete(Integer no) throws Exception;
}
