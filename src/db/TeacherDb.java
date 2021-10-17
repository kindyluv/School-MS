package db;

import Models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherDb {
    private static List<Teacher> teachers = new ArrayList<>();

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public Teacher findById(long id) {
        return teachers.get((int) id);
    }
}
