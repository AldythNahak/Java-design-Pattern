/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpatterndemo;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class MVCPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student model = retriveStudentsFromDatabase();
        
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        controller.setStudentName("Aldyth");
        controller.updateView();
        
        
    }
    

    private static Student retriveStudentsFromDatabase() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Student student = new Student();
    student.setName("Bethran");
    student.setRollNo("03");
        return student;
    }
}
