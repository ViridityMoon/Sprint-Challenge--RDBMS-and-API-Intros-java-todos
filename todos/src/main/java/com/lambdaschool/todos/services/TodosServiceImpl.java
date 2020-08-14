package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todoServices")
public class TodosServiceImpl implements TodosService
{
    @Autowired
    private TodoRepository todorepo;

    @Override
    public void markComplete(long todoid) {

    }
}
