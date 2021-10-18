package Services;

import Models.NonTeaching;
import exceptions.NonTeachingNotFoundException;

public interface NonTeachingService {

    void add(NonTeaching admin);
    void delete(NonTeaching admin);
    void addAll(NonTeaching... admins);
    void getAllNonTeaching(NonTeaching... admins);
    NonTeaching findById(long id) throws NonTeachingNotFoundException;

}
