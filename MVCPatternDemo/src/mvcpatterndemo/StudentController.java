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
public class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    
    public void setStudentRollNo(String rollNo){
        model.setName(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
       public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    } 
    
}
