package org.example.controller;

import org.example.dto.ClassroomDto;
import org.example.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/classroom")
public class ClassroomController {

    @Autowired
    private IClassroomService classroomService;

    @PostMapping("/")
    public ResponseEntity<?> createClassroom(@RequestBody ClassroomDto classroomDto){

        try{
            Integer classId = classroomService.createClassroom(classroomDto);
            return ResponseEntity.status(HttpStatus.OK).body(classId);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }
}
