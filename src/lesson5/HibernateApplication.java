package lesson5;

import lesson5.DAO.StudentDAO;
import lesson5.DAO.StudentDAOImpl;
import lesson5.entity.Student;
import org.hibernate.Session;

public class HibernateApplication {

    public static void main(String[] args) {
        Session session = SessionUtil.getSessionFactory().openSession();

        StudentDAO studentDao = new StudentDAOImpl(session);

        for (int i = 0; i < 1000; i++) {
            Student student = new Student("student" + i, "Mark " + i);
            studentDao.add(student);
        }

        System.out.println(studentDao.getStudents());

        Student student = studentDao.getStudent(999L);
        studentDao.del(student);
        System.out.println(studentDao.getStudents());

        student = studentDao.getStudent(1L);
        student.setName("Mike");
        studentDao.save(student);
        System.out.println(studentDao.getStudents());

        System.out.println(studentDao.getStudent(1L));

        studentDao.closeSession();

    }
}
