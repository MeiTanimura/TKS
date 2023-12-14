package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Forum;
import com.example.demo.repository.ForumRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ForumService {
	
	@Autowired
	ForumRepository repository;

	public List<Forum> findAll(){
	return repository.findAll();
	}
	
	public void insert(Forum forum) {
		repository.save(forum);
	}
}
