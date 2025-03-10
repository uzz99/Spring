package com.beyond.department.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.beyond.department.mapper.SubjectMapper;
import com.beyond.department.vo.Subject;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectMapper subjectMapper;
	
    @Override
    public int getTotalCount(String deptNo) {
        return subjectMapper.selectSubjectCount(deptNo);
    }

    @Override
    public List<Subject> getSubjects(String deptNo, int page, int numOfRows, int totalCount) {
        int offset = (page - 1) * numOfRows;
		int limit = numOfRows;
		RowBounds rowBounds = new RowBounds(offset, limit);

		return subjectMapper.selectAllByDeptNo(deptNo, rowBounds);
    }
}
