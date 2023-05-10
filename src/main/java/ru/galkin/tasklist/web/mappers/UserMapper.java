package ru.galkin.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.galkin.tasklist.domain.user.User;
import ru.galkin.tasklist.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
