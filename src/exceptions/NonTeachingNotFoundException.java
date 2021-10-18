package exceptions;

public class NonTeachingNotFoundException extends Throwable {

    public NonTeachingNotFoundException(){
        super();
    }

    public NonTeachingNotFoundException(String message){
        super(message);
    }

    public NonTeachingNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public NonTeachingNotFoundException(Throwable cause){
        super(cause);
    }
}
