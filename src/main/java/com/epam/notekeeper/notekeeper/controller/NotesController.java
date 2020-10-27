package com.epam.notekeeper.notekeeper.controller;

import com.epam.notekeeper.notekeeper.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NotesController {

    @Autowired
    NotesService notesService;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    Map<String, String> getNotes() {
        return notesService.getNotes();
    }
}
