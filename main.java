
import java.io.*;
import static java.lang.System.err;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            MiddleSquare ms= new MiddleSquare(8478);
            LinearCongruentialGenerator lcg =new LinearCongruentialGenerator(8478,2,3,200);
            PrintWriter out = new PrintWriter( "output.txt" );
            for(int i=1;i<100;i++)
                out.println(lcg.next());
            out.close();
        }catch (Exception e)
        {
            System.out.println("Got an exception! " + err);
        }
    }
}
