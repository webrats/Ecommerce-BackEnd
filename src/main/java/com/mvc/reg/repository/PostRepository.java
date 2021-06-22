package com.mvc.reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.reg.model.PostDao;

public interface PostRepository extends JpaRepository<PostDao, Long> {

}
