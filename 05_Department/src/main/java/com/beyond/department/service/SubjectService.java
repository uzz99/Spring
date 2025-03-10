package com.beyond.department.service;

import java.util.List;

import com.beyond.department.vo.Subject;

public interface SubjectService {

	int getTotalCount(String deptNo);

	List<Subject> getSubjects(String deptNo, int page, int numOfRows, int totalCount);

}
