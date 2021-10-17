package exceptions;

public class TeacherNotFoundException extends Throwable {

    TeacherNotFoundException() {
        super();
    }

    public TeacherNotFoundException(String message) {
        super(message);
    }

    TeacherNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    TeacherNotFoundException(Throwable cause) {
        super(cause);
    }
}
