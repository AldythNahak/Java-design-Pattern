/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daopatterndemo;

/**
 *
 * @author User
 */
public class DaoPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          StudentDao studentDao = new StudentDaolmpl();
        //print student
        for (Student student: studentDao.getAllStudents()){
            System.out.println("Student: RollNo : "+student.getRollNo()+
                    ", Name : "+student.getName());
            
        }
        //update
        Student student = studentDao.getAllStudents().get(0);
        student.setName("M.Rashford");
        studentDao.updateStudent(student);
        
        //get student
        studentDao.getStudent(0);
            System.out.println("Student: RollNo : "+student.getRollNo()+
                    ", Name : "+student.getName());
    }
    
}
