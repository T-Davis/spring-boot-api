package com.trevor.repository;

import com.trevor.model.Topics;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tdavis on 6/30/17.
 */
public interface TopicsRepository extends CrudRepository<Topics, String> {
}
