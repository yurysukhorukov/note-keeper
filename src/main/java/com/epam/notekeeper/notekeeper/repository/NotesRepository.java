package com.epam.notekeeper.notekeeper.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class NotesRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map<String, String> getNotes() {
        return jdbcTemplate.query("SELECT date_of_creation, note FROM notes", resultSet -> {
            Map<String, String> mapResult = new HashMap<>();
            while (resultSet.next()) {
                mapResult.put(resultSet.getString("date_of_creation"), resultSet.getString("note"));
            }
            return mapResult;
        });
    }
}
