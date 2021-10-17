package Services;

import Models.Teacher;
import exceptions.TeacherNotFoundException;

import java.util.List;

public interface TeacherService {

    void add(Teacher teacher);
    void delete(Teacher teacher);
    Teacher findById(long id) throws TeacherNotFoundException;
    List<Teacher> getAllTeachers(Teacher... teacher);
    void addAll(Teacher... teacher);
}
