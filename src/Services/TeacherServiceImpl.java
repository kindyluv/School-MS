package Services;

import Models.Teacher;
import db.TeacherDb;
import exceptions.TeacherNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherService{
    private static List<Teacher> teachers = new ArrayList<>();
    private TeacherDb teacherDb = new TeacherDb();

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public Teacher findById(long id) throws TeacherNotFoundException{
       Teacher foundId = teacherDb.findById(id);
       if (foundId == null) {
           throw new TeacherNotFoundException("Please enter a valid id");
       }else
        return foundId;
    }

    @Override
    public List<Teacher> getAllTeachers(Teacher... teacher) {
        for (Teacher teach : teacher){
            teacherDb.add(teach);
        }
        return null;
    }

    @Override
    public void addAll(Teacher... teacher) {
        for (Teacher teach : teacher) {
            teacherDb.add(teach);
        }
    }
}
