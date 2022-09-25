
package project1;

import java.util.Scanner;

public class taxcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sal;double tax;
        System.out.println("Enter Salary");
        Scanner r=new Scanner(System.in);
        sal=r.nextInt();
        
        if(sal<=500000)
        {
        	System.out.println("No tax");
        	
        }
        else if (sal>500000 && sal<=1000000)
        {
        	tax=sal*.10;
        	System.out.println(sal+" "+tax);
        }
        else
        { 	tax=sal*.20;
            System.out.println(sal+" "+tax);
        }

}
}
