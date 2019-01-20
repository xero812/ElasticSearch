package com.example.elastic.repository;

import com.example.elastic.model.Shakespeare;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PlayRepository extends ElasticsearchRepository<Shakespeare,Long> {

}
