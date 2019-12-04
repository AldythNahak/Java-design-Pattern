/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daopatterndemo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDaolmpl implements StudentDao{
    List<Student> students;
    
    public StudentDaolmpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Aldyth",0);
        Student student2 = new Student("Bethran",1);
        students.add(student1);
        students.add(student2);
    }
    
    
    @Override
    public List<Student> getAllStudents() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        students.get(student.getRollNo()).setName(student.getName());
          System.out.println("Student Roll No "+student.getRollNo()+", Updated");
    }

    @Override
    public void deleteStudent(Student student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   students.remove(student.getRollNo());
        System.out.println("Student Roll No "+student.getRollNo()+", Deleted");
    }
}
