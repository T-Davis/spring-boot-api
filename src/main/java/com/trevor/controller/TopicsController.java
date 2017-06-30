package com.trevor.controller;

import com.trevor.service.TopicsService;
import com.trevor.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/topics/{id}")
    public Topics getTopicById(@PathVariable String id) {
        return topicsService.getTopicsById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topics topics) {
        topicsService.addTopic(topics);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topics, @PathVariable String id) {
        topicsService.updateTopic(id, topics);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicsService.deleteTopic(id);
    }

}
