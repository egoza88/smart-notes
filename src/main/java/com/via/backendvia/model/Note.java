package com.via.backendvia.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Getter
@Setter
@Document(collection = "notes")
public class Note {

    @Id
    @NonNull()
    private String id;
    private long timestamp;
    private String header;
    private String content;

    public Note() {
    }

    public Note(long timestamp, String header, String content) {
        this.timestamp = timestamp;
        this.header = header;
        this.content = content;
    }
}
