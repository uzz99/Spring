package com.beyond.department.service;

import java.util.List;

import com.beyond.department.vo.Department;

public interface DepartmentService {

	int getTotalCount(String openYn);
	
	List<Department> getDepartments(int page, int numOfRows, String openYn);

	Department getDepartmentByDeptNo(String deptNo);

	int save(Department department);

	int delete(String deptNo);

}
