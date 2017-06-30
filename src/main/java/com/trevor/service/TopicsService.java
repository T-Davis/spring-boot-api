package com.trevor.service;

import com.trevor.model.Topics;
import com.trevor.repository.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tdavis on 6/26/17.
 */

@Service
public class TopicsService {

    @Autowired
    private TopicsRepository topicsRepository;

    private List<Topics> topics = new ArrayList<>(Arrays.asList(
            new Topics("spring", "spring framework", "learn spring"),
                new Topics("java", "core java", "learn java"),
                new Topics("javascript", "javascript", "learn javascript")
        ));

    public List<Topics> getAllTopics() {
        return topics;
    }

    public Topics getTopicsById(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topics topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topics topic) {
        for(int i = 0; i < topics.size(); i++) {
            Topics t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
