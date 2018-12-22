package cn.kgc.controller;

import cn.kgc.entity.Student;
import cn.kgc.sevivice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/all")
    public String all(HttpServletRequest request){
        List<Student> students=studentService.getAll();
        HttpSession session=request.getSession();
        session.setAttribute("list",students);
        return "index.jsp";
    }


    //添加
    @RequestMapping(value = "/add")
    public String add(Student student ){
        System.out.println(student.getstudentNumber());
        if(student.getId()==null){
            studentService.addStudent(student);
        }else{
            studentService.updata(student);
        }
       return "redirect:all";
    }
//修改
    @RequestMapping(value = "/updata")
    public String updata(@RequestParam("id") int id,HttpServletRequest request){
        Student student=studentService.getStudentById(id);
        HttpSession session=request.getSession();
        session.setAttribute("students",student);
        return "updata.jsp";
    }

//删
    @RequestMapping(value = "/del")
    public String del(@RequestParam("id") int id){
        studentService.del(id);
        return "redirect:all";
    }


}
