package com.epam.notekeeper.notekeeper.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.TreeMap;

@Repository
public class NotesRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map<String, String> getNotes() {
        return jdbcTemplate.query("SELECT date_of_creation, note FROM notes", resultSet -> {
            TreeMap<String, String> mapResult = new TreeMap<>();
            while (resultSet.next()) {
                mapResult.put(resultSet.getString("date_of_creation"), resultSet.getString("note"));
            }
            return mapResult;
        });
    }
}
