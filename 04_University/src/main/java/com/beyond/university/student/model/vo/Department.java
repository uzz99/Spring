package com.beyond.university.student.model.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private String no;
	
	private String name;
	
	private String category;
	
	private String openYn;
	
	private int capacity;
	
	private List<Student> students;
}
