package db;

import Models.NonTeaching;

import java.util.ArrayList;
import java.util.List;

public class NonTeachingDb {
    private List<NonTeaching> admins = new ArrayList<>();

    public NonTeaching findById(Long id) {
        return admins.get(Math.toIntExact(id));
    }

    public void add(NonTeaching admin) {
        admins.add(admin);
    }
}
