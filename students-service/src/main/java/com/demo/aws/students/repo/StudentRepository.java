package com.demo.aws.kubernetes.kubernetesdemo.repo;

import com.demo.aws.kubernetes.kubernetesdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
