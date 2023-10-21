package eu.dawidroszman.spring_with_neo4j_tutorial.services;

import eu.dawidroszman.spring_with_neo4j_tutorial.models.Lesson;
import eu.dawidroszman.spring_with_neo4j_tutorial.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;

    public LessonService(@Autowired LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> getAllLessonsByCourseIdentifier(String identifier) {
        return lessonRepository.findLessonsByCourseIdentifier(identifier);
    }
}
