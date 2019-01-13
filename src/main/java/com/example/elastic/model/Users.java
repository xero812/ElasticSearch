package com.example.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users",type = "users",shards = 5)
public class Users {

    private Long id;
    private String name;

    public Users(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users() {
    }
}
