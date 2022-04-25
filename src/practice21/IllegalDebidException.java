package practice21;

public class IllegalDebidException extends Exception {
   public IllegalDebidException() {
       super();
   }

   public IllegalDebidException(String message, Throwable cause) {
       super(message, cause);
   }

   public IllegalDebidException(String message) {
       super(message);
   }

   public IllegalDebidException(Throwable cause) {
       super(cause);
   }
}
