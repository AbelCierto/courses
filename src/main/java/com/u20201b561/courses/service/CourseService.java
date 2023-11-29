package com.u20201b561.courses.service;

import com.u20201b561.courses.entity.Course;
import com.u20201b561.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    public Course getById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> findByTeacherId(int teacherId) {
        return courseRepository.findByTeacherId(teacherId);
    }
}
