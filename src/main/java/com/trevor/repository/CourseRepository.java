package com.trevor.repository;

import com.trevor.model.Course;
import com.trevor.model.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tdavis on 6/30/17.
 */
public interface CourseRepository extends CrudRepository<Course, String> {
}
