package com.example.todowithdockerkub.dtos;

import lombok.Data;

import java.util.List;

@Data
public class TodoBatchUpdateDto {
    private List<TodoUpdateDto> todos;
}
