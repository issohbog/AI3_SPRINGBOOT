package com.aloha.pagehelper.service;

import java.util.List;

import com.aloha.pagehelper.domain.Pagination;
import com.aloha.pagehelper.domain.Posts;
import com.github.pagehelper.PageInfo;

public interface PostService {
    // 목록
    public List<Posts> list() throws Exception;
    // 페이징 목록
    public List<Posts> page(Pagination pagination) throws Exception;

    // ⭐ pagehelper를 이용한 페이징 목록 (현재 페이지, 페이지당 게시글 수) 매개변수로 받아온다.
    public PageInfo<Posts> page(int page, int size) throws Exception;
    
    // 조회 
    public Posts select(Integer no) throws Exception;
    // 등록
    public Boolean insert(Posts post) throws Exception;
    // 수정
    public Boolean update(Posts post) throws Exception;
    // 삭제
    public Boolean delete(Integer no) throws Exception;
}
