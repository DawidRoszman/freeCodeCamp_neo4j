package eu.dawidroszman.spring_with_neo4j_tutorial.repositories;

import eu.dawidroszman.spring_with_neo4j_tutorial.models.Lesson;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface LessonRepository extends Neo4jRepository<Lesson, Long> {
    @Query("MATCH (:Course {identifier: $identifier}) <- [:BELONGS_TO] - (l:Lesson) RETURN l")
    List<Lesson> findLessonsByCourseIdentifier(String identifier);
}
