package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Todo {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue
	private long id;
	
//	@NonNull
//	private String username;
//	
//	@NonNull
//	private String description;
//	
//	@NonNull
//	private Date targetDate;
//	
//	@NonNull
//	private boolean isDone;
	
	@NonNull
	private String key;
	
	@NonNull
	private boolean isDeactivated;
}
