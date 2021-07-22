package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Sethu on 2021/07/22.
 */
public interface CourseRepository extends CrudRepository<Course,String> {

     List<Course> findByTopicId(String topicId);
}
