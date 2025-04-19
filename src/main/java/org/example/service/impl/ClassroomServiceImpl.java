package org.example.service.impl;

import org.example.dao.ClassroomDao;
import org.example.dto.ClassroomDto;
import org.example.entity.Classroom;
import org.example.service.IClassroomService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ClassroomServiceImpl implements IClassroomService {

    @Autowired
    private ClassroomDao classroomDao;

    @Override
    public Integer createClassroom(ClassroomDto classroomDto) {

        if(Objects.isNull(classroomDto)){
            throw new IllegalArgumentException("Classroom Data cannot be empty");
        }

        Result<Classroom> result = Classroom.create(classroomDto.getId(), classroomDto.getClassName());

        if(result.isFailure()){
            throw new IllegalArgumentException(result.getError());
        }

        return classroomDao.createClassroom(result.getValue());

    }
}
