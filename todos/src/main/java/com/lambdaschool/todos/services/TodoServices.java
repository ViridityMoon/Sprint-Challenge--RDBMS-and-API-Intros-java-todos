package com.lambdaschool.todos.services;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TodoServices
{
    void markComplete(long todoid);
}
