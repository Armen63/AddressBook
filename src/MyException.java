/**
 * Created by Armen on 9/1/2016.
 */
public class MyException {
    class MyRuntimeException extends RuntimeException
    {
        void RTmessage()
        {
            System.out.println("Runtime error");
        }
    }

    class MyCheckedException extends Exception
    {
        void Chmessage()
        {
            System.out.println("Checked Exception !!!");
        }
    }
}
