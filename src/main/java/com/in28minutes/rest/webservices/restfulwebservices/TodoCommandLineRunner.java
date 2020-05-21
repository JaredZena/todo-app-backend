package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import com.in28minutes.rest.webservices.restfulwebservices.todo.TodoRepository;

@Component
public class TodoCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(TodoCommandLineRunner.class);
	
	@Autowired
	TodoRepository todoRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Todo> todos = new ArrayList<Todo>();
		todos.add(new Todo("/SuperMovil/montoLimitePorOrdenRetiroSinTarjeta.go",true));
		todos.add(new Todo("Learn about React",false));
		todos.add(new Todo("Learn about Java",false));
		todos.add(new Todo("Go to Durango",false));
		todos.add(new Todo("Finish trap with Dr Campos",false));
		todos.add(new Todo("Create ImpAg company",false));
		
		for(Todo todo : todos) {
			todoRepository.save(todo);
		}
		
		List<Todo> retrievedTodos = todoRepository.findAll();
		log.info("Retrieved todos: " + retrievedTodos);
		
	}

}
