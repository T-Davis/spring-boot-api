package com.trevor.Service;

import com.trevor.model.Topics;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tdavis on 6/26/17.
 */
@Service
public class TopicsService {

    private List<Topics> topics = Arrays.asList(
            new Topics("spring", "spring framework", "learn spring"),
                new Topics("java", "core java", "learn java"),
                new Topics("javascript", "javascript", "learn javascript")
        );

    public List<Topics> getAllTopics() {
        return topics;
    }
}
