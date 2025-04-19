package org.example.service;

import org.example.dto.ClassroomDto;

public interface IClassroomService {

    /**
     * @param classroomDto
     * @return
     * @implNote This method is used to create classroom
     */
    Integer createClassroom(ClassroomDto classroomDto);
}
