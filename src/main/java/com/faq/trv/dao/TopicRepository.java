package com.faq.trv.dao;

import com.faq.trv.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface TopicRepository extends JpaRepository<Topic, Long> {

}
