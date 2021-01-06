package com.via.backendvia;

import com.via.backendvia.model.Note;
import com.via.backendvia.service.NoteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/notes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotesRestController {

    @Autowired
    private NoteService noteService;

    @GetMapping(value = "/")
    @ApiOperation(value = "Get all notes", notes = "Retrieving the collection of user notes", response = Note[].class)
    public List<Note> getAllNotes() {
        return noteService.findAll();
    }

    @GetMapping(value = "/get/{id}")
    public Note getById(@PathVariable String id) {
        return noteService.findById(id);
    }

    @PostMapping("/save")
    Note newNote(@RequestBody Note newNote) {
        return noteService.saveOrUpdateNote(newNote);
    }
}
