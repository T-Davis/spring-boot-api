package com.trevor.controller;

import com.trevor.Service.TopicsService;
import com.trevor.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tdavis on 6/26/17.
 */
@RestController
public class TopicsController {

    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicsService.getAllTopics();
    }

}
