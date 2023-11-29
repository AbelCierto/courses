package com.u20201b561.courses.controller;
import com.u20201b561.courses.entity.Course;
import com.u20201b561.courses.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/courses")

public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAll() {
        List<Course> courses = courseService.getAll();
        if(courses.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/save")
    public ResponseEntity<Course> save(@RequestBody Course course) {
        return ResponseEntity.ok(courseService.save(course));
    }

}
