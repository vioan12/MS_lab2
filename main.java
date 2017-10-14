/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms_lab2;

import java.io.*;
import static java.lang.System.err;

/**
 *
 * @author Asus
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            MiddleSquare ms= new MiddleSquare(8478);
            PrintWriter out = new PrintWriter( "output.txt" );
            for(int i=1;i<=10000;i++)
                out.println(ms.next());
            out.close();
        }catch (Exception e)
        {
            System.out.println("Got an exception! " + err);
        }
    }
    
}
