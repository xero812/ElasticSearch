package com.example.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "shakespeare",type = "doc",shards = 5)
public class Shakespeare {

    private Long id;
    private Long line_id;
    private String line_number;
    private String play_name;
    private String speaker;
    private Long speech_number;
    private String text_entry;
    private String type;

    public Shakespeare() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLine_id() {
        return line_id;
    }

    public void setLine_id(Long line_id) {
        this.line_id = line_id;
    }

    public String getLine_number() {
        return line_number;
    }

    public void setLine_number(String line_number) {
        this.line_number = line_number;
    }

    public String getPlay_name() {
        return play_name;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public Long getSpeech_number() {
        return speech_number;
    }

    public void setSpeech_number(Long speech_number) {
        this.speech_number = speech_number;
    }

    public String getText_entry() {
        return text_entry;
    }

    public void setText_entry(String text_entry) {
        this.text_entry = text_entry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
