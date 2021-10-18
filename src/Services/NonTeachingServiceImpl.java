package Services;

import Models.NonTeaching;
import db.NonTeachingDb;
import exceptions.NonTeachingNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class NonTeachingServiceImpl implements NonTeachingService{
    private static List<NonTeaching> admins = new ArrayList<>();
    private NonTeachingDb nonTeachingDb = new NonTeachingDb();

    @Override
    public void add(NonTeaching admin) {
        admins.add(admin);
    }

    @Override
    public void delete(NonTeaching admin) {
        admins.remove(admin);
    }

    @Override
    public void addAll(NonTeaching... admin) {
        for(NonTeaching _admin : admin){
            nonTeachingDb.add(_admin);
        }
    }

    @Override
    public void getAllNonTeaching(NonTeaching... admin) {

    }

    @Override
    public NonTeaching findById(long id) throws NonTeachingNotFoundException {
        NonTeaching foundId = nonTeachingDb.findById(id);
        if (foundId == null) {
            throw new NonTeachingNotFoundException("Please enter a valid id");
        }else
        return foundId;
    }
}
