package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sethu on 2021/07/21.
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        for(Course topic :courseRepository.findByTopicId(topicId)){
            courses.add(topic);
        }
        return courses;
    }

    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    public void update(Course topic) {
        courseRepository.save(topic);
    }

    public void delete(String id) {
        courseRepository.delete(id);
    }

}
