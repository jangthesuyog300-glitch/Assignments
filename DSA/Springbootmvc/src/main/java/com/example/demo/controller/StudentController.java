package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.beans.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/stud")
public class StudentController {

    @Autowired
    private StudentService sserv;

    // Display all students
    @GetMapping
    public ModelAndView getAll() {
        List<Student> slist = sserv.getAllstudents();
        return new ModelAndView("student", "slist", slist);
    }
    

    // Show Edit Student form
    @GetMapping("/editstudent/{sid}")
    public ModelAndView editStudent(@PathVariable int sid) {
        Student s = sserv.updateById(sid); // or sserv.getById(sid)
        return new ModelAndView("editstudent", "stud", s); // pass 'stud' to JSP
    }
    
    
    
    @PostMapping("/update")  // Matches form action exactly
    public ModelAndView update(@ModelAttribute("stud") Student s) {
        sserv.updatestudent(s);
        return new ModelAndView("redirect:/stud");
    }
    
    @GetMapping("/delete/{sid}")
    public ModelAndView delete(@PathVariable int sid) {
    	sserv.delete(sid);
    	 return new ModelAndView("redirect:/stud");
    }
    
    @GetMapping("/addstudent")
    public ModelAndView showAddStudentForm() {
        return new ModelAndView("addstudent");
    }

    @PostMapping("/addstudent")
    public ModelAndView submitStudent(@ModelAttribute Student stud) {
        sserv.addstud(stud);
        return new ModelAndView("redirect:/stud");
    }


  
}
