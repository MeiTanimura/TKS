package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Forumは後々変更
import com.example.demo.model.Forum;

@Repository
//Forumは後々変更
public interface ForumRepository extends JpaRepository<Forum, Integer> {
	
}
