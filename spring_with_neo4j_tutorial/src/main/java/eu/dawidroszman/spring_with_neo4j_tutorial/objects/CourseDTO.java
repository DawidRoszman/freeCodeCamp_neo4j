package eu.dawidroszman.spring_with_neo4j_tutorial.objects;

import eu.dawidroszman.spring_with_neo4j_tutorial.models.Lesson;

import java.util.ArrayList;
import java.util.List;

public class CourseDTO {
    private String indentifier;
    private String title;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<>();

    public CourseDTO(String indentifier, String title, String teacher) {
        this.indentifier = indentifier;
        this.title = title;
        this.teacher = teacher;
    }

    public String getIndentifier() {
        return indentifier;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
