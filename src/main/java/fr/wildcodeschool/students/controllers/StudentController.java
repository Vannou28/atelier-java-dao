package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repository.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentRepoTls")
    private StudentDao studentsTls;

    @Autowired
    @Qualifier("studentRepoBdx")
    private StudentDao studentsBdx;

    
    @ResponseBody
    @GetMapping("/studentsTls")
    public List<Student> getStudents() {
        return studentsTls.findAll();
    }

    @ResponseBody
    @GetMapping("/studentsBdx")
    public List<Student> getStudentsBdx() { 
        return studentsBdx.findAll();
    }

  
}