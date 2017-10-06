package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseMapper;
import com.example.model.CourseModel;

import groovy.util.logging.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService {
	@Autowired
    private CourseMapper courseMapper;

	@Override
	public CourseModel selectCourse(String id_course) {
		//log.info ("select course with id course {}", id_course);
		return courseMapper.selectCourse(id_course);
	}
}
