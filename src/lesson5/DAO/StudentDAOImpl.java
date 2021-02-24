package lesson5.DAO;
import lesson5.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImpl implements StudentDAO  {

    Session session;


    @Override
    public void save(Student student) {

    }

    @Override
    public void add(Student student) {

    }

    @Override
    public void del(Student student) {

        Transaction transaction = session.beginTransaction();
        session.remove(student);

    }

    @Override
    public void update(Student student) {
        add(student);
    }

    @Override
    public Student getStudent(Long id) {
        return  session.get(Student.class, id);
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) session.createQuery("from Student").list();
    }


    @Override
    public void closeSession() {
        session.close();
    }

    public StudentDAOImpl(Session session) {
        this.session = session;
    }
}
