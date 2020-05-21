package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class TodoResourceJpa {
	
	Logger log = LoggerFactory.getLogger(TodoResourceJpa.class);
	
	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/users/jpa/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		log.info("Entering to retrieving todos");
		return todoRepository.findAll();
	}
	
	
	@GetMapping("/users/jpa/{username}/todos/{id}")
	public Optional<Todo> getTodo(@PathVariable String username,
			@PathVariable long id) {
				return todoRepository.findById(id);
	}
	
	
	@DeleteMapping("/users/jpa/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(
			@PathVariable String username, @PathVariable long id){
		log.info("Entering to deletingGet todo");
		todoRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("/users/jpa/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(
			@PathVariable String username
			, @PathVariable long id
			, @RequestBody Todo todo){
		log.info("Updating todo " + id);
		Todo updatedTodo = todoRepository.save(todo);
		log.info("Succesfully updated todo " + id);
		log.info(todo.toString());
		return new ResponseEntity<Todo>(updatedTodo,HttpStatus.OK);
	}
	
	
	@PostMapping("/users/jpa/{username}/todos")
	public ResponseEntity<Todo> createTodo(
			@PathVariable String username
			, @RequestBody Todo todo){
		Todo createdTodo = todoRepository.save(todo);
		
		// location
		// get current resource url
		//{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
