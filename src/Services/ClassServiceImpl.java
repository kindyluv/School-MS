package Services;

import Models.Class;
import db.ClassDb;
import db.SchoolDb;

import java.util.ArrayList;
import java.util.List;

public class ClassServiceImpl implements ClassService{
    private static List<Class> classes = new ArrayList<>();
    private static ClassDb classDb = new ClassDb();

    @Override
    public void add(Class _class) {
       classes.add(_class);
    }

    @Override
    public void delete(Class _class) {
        classes.remove(_class);
    }

    @Override
    public Class findById(long id) throws ClassNotFoundException{
        Class foundClass = classDb.findById(id);
        if (foundClass == null) {
            throw new ClassNotFoundException("This is not a valid class id");
        }else return foundClass;
    }

    @Override
    public List<Class> getAllClasses(Class... _class) {
        for (Class newClass: _class) {
            classDb.add(newClass);
        }return null;
    }

    @Override
    public void addAll(Class... _class) {
        for(Class newClass : _class){
            classDb.add(newClass);
        }
    }
}
