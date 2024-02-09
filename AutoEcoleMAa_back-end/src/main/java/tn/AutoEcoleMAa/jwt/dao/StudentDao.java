package tn.AutoEcoleMAa.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.AutoEcoleMAa.jwt.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, String> {

}
