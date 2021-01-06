package com.via.backendvia.service;

import com.via.backendvia.model.Note;
import com.via.backendvia.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note findById(String id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public Note saveOrUpdateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteById(String id) {
        noteRepository.deleteById(id);
    }
}
