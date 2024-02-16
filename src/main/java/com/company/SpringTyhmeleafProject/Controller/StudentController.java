package com.company.SpringTyhmeleafProject.Controller;

import com.company.SpringTyhmeleafProject.Model.Student;
import com.company.SpringTyhmeleafProject.Service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("listStudent",studentService.getAllStudent());
        return "index";
    }
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model){
        Student student= new Student();
        model.addAttribute("student",student);
        return "newstudent";

    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id")Integer id,Model model){
        Student student=studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "updatestudent";
    }
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id")Integer id,Model model){
        studentService.deleteStudent(id);
        return "redirect:/";
    }

}
