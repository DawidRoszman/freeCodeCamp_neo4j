package eu.dawidroszman.spring_with_neo4j_tutorial.repositories;

import eu.dawidroszman.spring_with_neo4j_tutorial.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface CourseRepository extends Neo4jRepository<Course, Long> {
    Optional<Course> findCourseByIdentifier(String identifier);
}
