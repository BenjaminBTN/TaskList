package ru.galkin.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.galkin.tasklist.domain.task.Task;
import ru.galkin.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);
    List<TaskDto> toDto(List<Task> tasks);
    Task toEntity(TaskDto dto);

}
