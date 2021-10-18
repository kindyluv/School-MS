package Services;

import Models.School;
import db.SchoolDb;
import exceptions.SchoolNotFoundException;

import java.util.List;

public class SchoolServiceImpl implements SchoolService{
    private SchoolDb schoolDb;

    public SchoolServiceImpl(SchoolDb schoolDb){
        this.schoolDb = schoolDb;    }

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);
    }

    @Override
    public School update(long id, School school) throws SchoolNotFoundException {
        School foundSchool = findById(id);

        return foundSchool;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if (foundSchool ==  null){
            throw new SchoolNotFoundException("School with this id not found");
        }
        return foundSchool;
    }

    @Override
    public List<School> getAll(School... school) {
        for (School sch : schoolDb.getAll()){
            schoolDb.add(sch);
        }
        return null;
    }

    @Override
    public void addAll(School... school) {
        for (School sch : school) {
            schoolDb.add(sch);
        }
    }
}
