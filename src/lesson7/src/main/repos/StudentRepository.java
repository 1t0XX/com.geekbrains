package lesson7.src.main.repos;


import lesson7.src.main.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {}
