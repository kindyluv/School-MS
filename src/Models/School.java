package Models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String name;
    private List<Class> classes = new ArrayList<>();
    private List<Student> student = new ArrayList<>();
    private List<Staffs> staffs = new ArrayList<>();
    private String address;
    private String description;
    private SchoolType schoolType;
    private static long counter = 0;


    public School(String name, String description, SchoolType schoolType) {
        this.id = ++counter;
        this.name = name;
        this.description = description;
        this.schoolType = schoolType;
    }

    public School() {
        this.id = ++counter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Staffs> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staffs> staffs) {
        this.staffs = staffs;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public void addClass(Class _class){
        classes.add(_class);
    }

    public void removeClass(Class _class){
        classes.remove(_class);
    }
}
