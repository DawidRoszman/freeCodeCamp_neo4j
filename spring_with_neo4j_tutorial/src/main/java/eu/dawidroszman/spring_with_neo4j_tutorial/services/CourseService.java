package eu.dawidroszman.spring_with_neo4j_tutorial.services;

import eu.dawidroszman.spring_with_neo4j_tutorial.models.Course;
import eu.dawidroszman.spring_with_neo4j_tutorial.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(@Autowired CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseByIdentifier(String identifier){
        return courseRepository.findCourseByIdentifier(identifier)
                .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404), "Course not found!"));
    }

}
