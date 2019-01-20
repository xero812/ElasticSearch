package com.example.elastic.resource;

import com.example.elastic.model.Shakespeare;
import com.example.elastic.repository.PlayRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/shakespeare")
public class SearchResource {

    @Autowired
    private PlayRepository playRepository;

    @GetMapping(value = "/find")
    public List<Shakespeare> findByText(@RequestParam("text") String text) {
        List<Shakespeare> result = new ArrayList<>();
        playRepository.search(QueryBuilders.multiMatchQuery(text,"text_entry","speaker")).forEach(result::add);
        return result;
    }

    @GetMapping(value = "/find/{line}")
    public List<Shakespeare> findByLine(@PathVariable String line) {
        List<Shakespeare> result = new ArrayList<>();
        playRepository.search(QueryBuilders.matchQuery("line_number",line)).forEach(result::add);
        return result;
    }



}
