package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.utils.Result;

import java.util.Objects;

@Data
public class Classroom {

    // ✅ Explicit no-args constructor
    public Classroom() {
    }

    // ✅ Explicit all-args constructor
    public Classroom(Integer id, String className) {
        this.id = id;
        this.className = className;
    }


    private Integer id;
    private String className;

    public static Result<Classroom> create(Integer id, String className) {
        if (Objects.isNull(className)) {
            return Result.fail("Class Name Cannot be empty");
        }
        return Result.ok(new Classroom(id, className));
    }
}
