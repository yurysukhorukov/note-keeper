package com.epam.notekeeper.notekeeper.service;

import com.epam.notekeeper.notekeeper.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotesService {

    @Autowired
    NotesRepository notesRepository;

    public Map<String, String> getNotes() {
        return notesRepository.getNotes();
    }
}
