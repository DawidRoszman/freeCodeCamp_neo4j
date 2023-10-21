package eu.dawidroszman.spring_with_neo4j_tutorial.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Lesson {
    @Id @GeneratedValue
    private Long id;
    private String identifier;
    private String title;

    public Lesson() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
