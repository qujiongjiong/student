package cn.kgc.serviceImpl;

import cn.kgc.entity.Student;
import cn.kgc.mapper.StudentMapper;
import cn.kgc.sevivice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updata(Student student) {
        return studentMapper.updata(student);
    }

    @Override
    public int del(Integer id) {
        return studentMapper.del(id);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
