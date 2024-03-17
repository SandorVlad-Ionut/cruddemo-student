package com.stud.cruddemo.dao;
import com.stud.cruddemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDAO {
    public void save (Student theStudent);

    Student findById (Integer id);

    List <Student> findByLastName(String lastName);

    List <Student> findAll();

    void update(Student theStudent);

    void delete (Integer id);

    int deleteAll();


}
