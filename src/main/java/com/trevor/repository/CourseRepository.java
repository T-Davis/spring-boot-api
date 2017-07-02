package com.trevor.repository;

import com.trevor.model.Course;
import com.trevor.model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tdavis on 6/30/17.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
