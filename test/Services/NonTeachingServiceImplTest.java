package Services;

import Models.NonTeaching;
import Models.Teacher;
import db.NonTeachingDb;
import exceptions.NonTeachingNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Models.Gender.*;
import static org.junit.jupiter.api.Assertions.*;

class NonTeachingServiceImplTest {
    NonTeachingService nonTeachingService;
    NonTeachingDb nonTeachingDb;

    @BeforeEach
    void setUp() {
        nonTeachingDb = new NonTeachingDb();
        nonTeachingService = new NonTeachingServiceImpl();
    }

    @Test
    void add() {
        NonTeaching admin1 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Art", MALE);
        assertEquals(1, admin1.getId());
        NonTeaching admin2 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Science", FEMALE);
        assertEquals(2, admin2.getId());
        nonTeachingService.add(admin1);
    }

    @Test
    void addAll() {
        NonTeaching admin1 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Art", MALE);
        assertEquals(1, admin1.getId());
        NonTeaching admin2 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Science", FEMALE);
        assertEquals(2, admin2.getId());
        nonTeachingService.addAll(admin1, admin2);
    }

    @Test
    void delete() {
        NonTeaching newTeach = null;
        NonTeaching admin1 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Art", MALE);
        assertEquals(1, admin1.getId());
        NonTeaching admin2 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Science", FEMALE);
        assertEquals(2, admin2.getId());
        nonTeachingService.addAll(admin1, admin2);
        nonTeachingService.delete(admin1);
        assertEquals(1, newTeach.getId());
    }

    @Test
    void getAllNonTeaching() {

    }

    @Test
    void findById() throws NonTeachingNotFoundException {
        NonTeaching admin1 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Art", MALE);
        assertEquals(1, admin1.getId());
        NonTeaching admin2 = new NonTeaching("Lois", "Ama", "01/10/2020",
                "Faculty Of Science", FEMALE);
        assertEquals(2, admin2.getId());
        nonTeachingService.addAll(admin1, admin2);
        nonTeachingService.findById(1);
    }
}