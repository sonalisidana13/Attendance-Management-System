package org.example.entity;

import io.micrometer.common.util.StringUtils;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.example.enums.UserType;
import org.example.utils.CommonUtils;
import org.example.utils.Result;

import java.util.Objects;

@Data
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Integer userId;
    UserType userType;
    String username;
    String email;
    String phone;

    public User(Integer userId, UserType userType, String username, String email, String phone) {
        this.userId = userId;
        this.userType = userType;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public static Result<User> create(Integer userId, UserType userType, String username, String email,
                                      String phone) {
        if (Objects.isNull(userId)) {
            return Result.fail("User Id Cannot be empty");
        }
        if (Objects.isNull(userType)) {
            return Result.fail("User Type Cannot be empty");
        }
        if (Objects.isNull(username)) {
            return Result.fail("User Name Cannot be empty");
        }
        if (Objects.isNull(email) || StringUtils.isBlank(email)) {
            return Result.fail("Email Cannot be empty");
        }
        if (!CommonUtils.validateEmailFormat(email)) {
            return Result.fail("Invalid Email Format");
        }
        if (Objects.isNull(phone) || StringUtils.isBlank(phone)) {
            return Result.fail("Phone Number Cannot be empty");
        }
        if (!CommonUtils.validatePhoneNumber(phone)) {
            return Result.fail("Invalid Phone Number Format");
        }
        return Result.ok(new User(userId, userType, username, email, phone));
    }
}
