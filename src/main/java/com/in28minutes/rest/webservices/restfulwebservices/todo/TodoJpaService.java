  package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoJpaService {
	
//	@Autowired
//	TodoRepository todoRepository;
//	
//	Logger log = LoggerFactory.getLogger(TodoJpaService.class);
//
//	private static List<Todo> todos = new ArrayList<Todo>();
//	private static long idCounter = 0;
//	
//	static {
//		todos.add(new Todo(++idCounter,"in28minutes","Finish Angular course",new Date(),false));
//		todos.add(new Todo(++idCounter,"in28minutes","Learn about React",new Date(),false));
//		todos.add(new Todo(++idCounter,"in28minutes","Learn about Java",new Date(),false));
//		todos.add(new Todo(++idCounter,"in28minutes","Go to Durango",new Date(),false));
//		todos.add(new Todo(++idCounter,"in28minutes","Finish trap with Dr Campos",new Date(),false));
//		todos.add(new Todo(++idCounter,"in28minutes","Create ImpAg company",new Date(),false));
//	}
//	
//	
//	public List<Todo> findAll(){
//		log.info("Returning all todos");
//		return todos;
//	}
//	
//	
//	public Todo save(Todo todo) {
//		if (todo.getId() == -1 || todo.getId() == 0) {
//			todo.setId(++idCounter);
//			todos.add(todo);
//		}else {
//			deleteById(todo.getId());
//			todos.add(todo);
//		}
//		return todo;
//	}
//	
//	public Todo deleteById(long id) {
//		Todo todo = findById(id);
//		
//		if(todo==null) return null;
//		
//		if(todos.remove(todo)) {
//			log.info("Removing todo: " + todo.toString());
//			log.info(todos.toString());
//			return todo;
//		}
//		
//		return null;
//	}
//
//
//	public Todo updateById(String id, Todo todo) {
//		Todo currentTodo = findById(todo.getId());
//		
//		if(currentTodo==null) return null;
//		
//		todos.set((int) todo.getId()-1, todo);
//		
//		return null;
//	}
//
//
//	public Todo findById(long id) {
//		for(Todo todo : todos) {
//			if(todo.getId() == id) {
//				return todo;
//			}
//		}
//		return null;
//	}
	
}
