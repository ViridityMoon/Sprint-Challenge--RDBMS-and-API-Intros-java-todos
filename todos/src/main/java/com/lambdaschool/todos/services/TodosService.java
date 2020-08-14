package com.lambdaschool.todos.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TodosService
{
    void markComplete(long todoid);
}
