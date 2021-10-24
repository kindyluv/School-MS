package Services;

import Models.Class;
import db.ClassDb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassServiceImplTest {
    ClassService classService;
    ClassDb classDb;

    @BeforeEach
    void setUp() {
        classDb = new ClassDb();
        classService = new ClassServiceImpl();
    }

    @Test
    @DisplayName("Add Class")
    void add() {
        Class class1 = new Class("Phoenix");
        assertEquals(1, class1.getId());
        Class class2 = new Class("Maven");
        assertEquals(2, class2.getId());
        Class class3 = new Class("Andre");
        assertEquals(3, class3.getId());
        classService.addAll(class1,class2,class3);
    }

    @Test
    void delete() throws ClassNotFoundException {
        Class class1 = new Class("Phoenix");
        assertEquals(1, class1.getId());
        Class class2 = new Class("Maven");
        assertEquals(2, class2.getId());
        Class class3 = new Class("Andre");
        assertEquals(3, class3.getId());
        classService.addAll(class1,class2,class3);
        classService.delete(class1);
    }

    @Test
    void findById() throws ClassNotFoundException {
        Class class1 = new Class("Phoenix");
        assertEquals(1, class1.getId());
        Class class2 = new Class("Maven");
        assertEquals(2, class2.getId());
        Class class3 = new Class("Andre");
        assertEquals(3, class3.getId());
        classService.addAll(class1,class2,class3);
        classService.findById(1);
    }

    @Test
    void getAllClasses() {
        Class class1 = new Class("Phoenix");
        assertEquals(1, class1.getId());
        Class class2 = new Class("Maven");
        assertEquals(2, class2.getId());
        Class class3 = new Class("Andre");
        assertEquals(3, class3.getId());
        classService.addAll(class1,class2,class3);
        classService.getAllClasses(class1,class2,class3);
    }
}