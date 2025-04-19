package org.example.dao;

import org.example.entity.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClassroomDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createClassroom(Classroom value) {

        String sql = "INSERT INTO classroom (name) VALUES (?)";
        return jdbcTemplate.update(sql, value.getClassName());
    }
}
