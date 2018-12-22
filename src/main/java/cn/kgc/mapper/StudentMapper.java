package cn.kgc.mapper;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentMapper {
    //添加
    public int addStudent(Student student);
    //修改
    public int updata(Student student);
    //删除
    public int del(Integer id);
    //查
    public Student getStudentById(Integer id);

    //查所有
    public List<Student> getAll();



}
