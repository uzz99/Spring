package com.beyond.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.beyond.department.vo.Subject;

@Mapper
public interface SubjectMapper {

	int selectSubjectCount(@Param("deptNo") String deptNo);
	
	List<Subject> selectAllByDeptNo(@Param("deptNo")String deptNo, RowBounds rowBounds);

}
