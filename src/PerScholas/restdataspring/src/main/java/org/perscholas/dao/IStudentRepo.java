package org.perscholas.dao;

import org.perscholas.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public class IStudentRepo implements JpaRepository<Student, Long> {


}
