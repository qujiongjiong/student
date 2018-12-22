package cn.kgc.entity;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String studentNumber;

    public Student(Integer id, String name, Integer age, String studentNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentNumber=" + studentNumber +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getstudentNumber() {
        return studentNumber;
    }

    public void setstudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
