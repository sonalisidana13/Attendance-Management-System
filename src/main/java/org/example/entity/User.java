package org.example.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.example.enums.UserType;

@Data
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    String userId;
    UserType userType;
    String username;
    String email;
    String phone;
}
