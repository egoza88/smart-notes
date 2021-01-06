package com.via.backendvia.service;

import com.via.backendvia.model.Note;
import org.bson.types.ObjectId;

import java.util.List;

public interface NoteService {

    List<Note> findAll();

    Note findById(String id);

    Note saveOrUpdateNote(Note note);

    void deleteNoteById(String id);
}
