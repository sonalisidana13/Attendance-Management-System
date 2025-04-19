package org.example.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

//@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassroomDto {

    Integer id;
    String className;

    public Integer getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }


}
