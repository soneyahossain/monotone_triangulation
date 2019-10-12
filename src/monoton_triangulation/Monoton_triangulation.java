/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monoton_triangulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author soneya
 */
public class Monoton_triangulation {

    int[][] coordinate;
    int numOfpoints;
    
    
    public Monoton_triangulation(int data_size, Scanner input)
    {
        System.out.println(data_size+"  ");
        numOfpoints=data_size;
        coordinate=new int [data_size][2];
        input(input);
    }
     private void input(Scanner input)
   {
       String in;
       for (int i=-1;i<numOfpoints+1;i++)
       {
            in = input.nextLine();
            StringTokenizer strToken = new StringTokenizer(in);
            int count = strToken.countTokens();
            for(int x = 0;x < count;x++){
                  coordinate[i][x] = Integer.parseInt((String)strToken.nextElement());
                  
            }
       }
       
       for (int i=0;i<coordinate.length;i++)
       {
           System.out.print(coordinate[i][0]+"  ");
           System.out.println(coordinate[i][1]);
          
       }
     
       
       
   }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input_5.txt"));
        int data_size = input.nextInt();
        final Monoton_triangulation instance= new Monoton_triangulation(data_size,input);
    }
}
