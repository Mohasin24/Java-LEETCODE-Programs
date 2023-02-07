
import java.lang.*;
import java.util.*;

import javax.swing.RootPaneContainer;

public class pr_singleton_roll_num 
{
    public static void main(String arg[])
    {
        Student sobj[] = new Student[6];
        sobj[0] = new Student();
        sobj[1] = new Student();
        sobj[2] = new Student();
        sobj[3] = new Student();
        sobj[4] = new Student();
        sobj[5] = new Student();
        
        sobj[0].showRoll();
        sobj[1].showRoll();
        sobj[2].showRoll();
        sobj[3].showRoll();
        sobj[4].showRoll();
        sobj[5].showRoll();
    }
}

class Student
{
    private String rollNo;

    private static int rollCount = 1;

    private String generateRollNo()
    {
        Date d1 = new Date();

        Calendar c1 = Calendar.getInstance();

        String rn = "Univ - "+ (c1.get(Calendar.YEAR)) + " - " + rollCount;
        rollCount++;

        return rn;
    }

    public Student()
    {
        if(rollCount>5)
        {
            this.rollNo = null;
        }
        else
        {
            this.rollNo = generateRollNo();
        }
    }

    public void showRoll()
    {
        System.out.println("Roll no: "+this.rollNo);
    }


}
