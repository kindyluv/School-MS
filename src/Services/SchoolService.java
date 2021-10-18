package Services;

import Models.School;
import exceptions.SchoolNotFoundException;

import java.util.List;

public interface SchoolService {


    void add(School school);
    void delete(School school);
    School update(long id, School school) throws SchoolNotFoundException;
    School findById(long id) throws SchoolNotFoundException;
    List<School> getAll(School... school);
    void addAll(School ...school);
}
