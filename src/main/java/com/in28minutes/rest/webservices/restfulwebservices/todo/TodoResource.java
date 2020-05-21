package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.net.URI;
import java.util.List;

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
public class TodoResource {
	
//	Logger log = LoggerFactory.getLogger(TodoResource.class);
//	
//	@Autowired
//	TodoHardcodedService todoService;
//	
//	@GetMapping("/users/{username}/todos")
//	public List<Todo> getAllTodos(@PathVariable String username){
//		log.info("Entering to retrieving todos");
//		return todoService.findAll();
//	}
//	
//	
//	@GetMapping("/users/{username}/todos/{id}")
//	public Todo getTodo(@PathVariable String username,
//			@PathVariable long id) {
//				return todoService.findById(id);
//		
//	}
//	
//	
//	@DeleteMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<Void> deleteTodo(
//			@PathVariable String username, @PathVariable long id){
//		log.info("Entering to deletingGet todo");
//		if(todoService.deleteById(id)!=null)
//			return ResponseEntity.noContent().build();
//		
//		log.info("Todo was not found");
//		return ResponseEntity.notFound().build();
//	}
//	
//	
//	@PutMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<Todo> updateTodo(
//			@PathVariable String username
//			, @PathVariable long id
//			, @RequestBody Todo todo){
//		log.info("Updating todo " + id);
//		Todo updatedTodo = todoService.save(todo);
//		log.info("Succesfully updated todo " + id);
//		log.info(todo.toString());
//		return new ResponseEntity<Todo>(updatedTodo,HttpStatus.OK);
//	}
//	
//	
//	@PostMapping("/users/{username}/todos")
//	public ResponseEntity<Todo> createTodo(
//			@PathVariable String username
//			, @RequestBody Todo todo){
//		Todo createdTodo = todoService.save(todo);
//		
//		// location
//		// get current resource url
//		//{id}
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
}
