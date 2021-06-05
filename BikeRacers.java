/* 1.c)Five Bikers Compete in a race such that they drive at a constant speed which 
       may or may not be the same as the other. To qualify the race,the speed of a 
       racer must be more than the average speed of all 5 racers. Take as input the 
       speed of each racer and print back the speed of qualifying racers */

import java.io.*;
import java.util.*;
class BikeRacers
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int speed[]=new int[5];
      for(int i=0;i<5;i++)
      {
          System.out.print("\nEnter the speed of Racer-"+(i+1)+": ");
          speed[i]=sc.nextInt();
      }
      int sum=0;
      for(int i=0;i<5;i++)
          sum+=speed[i];
      double avg=sum/5;
          System.out.print("\nAverage Speed of Bikeracers is: "+avg);
      System.out.print("\nThe speed of qualifying racers are: ");
      for(int i=0;i<5;i++)
      {
          if(speed[i]>=avg)
              System.out.print("\nRacer-"+(i+1)+": "+speed[i]);
       }
   }
}
