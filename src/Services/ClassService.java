package Services;

import Models.Class;

import java.util.List;

public interface ClassService {

    void add(Class _class);
    void delete(Class _class) throws ClassNotFoundException;
    Class findById(long id) throws ClassNotFoundException;
    List<Class> getAllClasses(Class... _class);
    void addAll(Class... _class);
}
