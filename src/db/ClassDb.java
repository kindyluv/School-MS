package db;

import Models.Class;

import java.util.ArrayList;
import java.util.List;

public class ClassDb {
    private final List<Class> classes = new ArrayList<>();

    public Class findById(long id) {
        return classes.get((int) id);
    }

    public void add(Class newClass) {
        classes.add(newClass);
    }
}
