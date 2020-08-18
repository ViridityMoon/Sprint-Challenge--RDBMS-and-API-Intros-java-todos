package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todoServices")
public class TodoServicesImpl implements TodoServices
{
    @Autowired
    private TodoRepository todorepo;



    @Override
    public void markComplete(long todoid)
    {
        Todo completeTodo = todorepo.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException(("Todo " + todoid + " Not Found!")));

        completeTodo.setCompleted(!completeTodo.getCompleted());

        todorepo.save(completeTodo);
    }
}
