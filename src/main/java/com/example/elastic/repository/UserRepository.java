package com.example.elastic.repository;

import com.example.elastic.model.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import javax.annotation.PostConstruct;
import java.util.List;

public interface UserRepository extends ElasticsearchRepository<Users,Long> {

 //   List<Users> findByName(String text);
}
