
import java.lang.*;

public class pr_interface
{
    public static void main(String arg[])
    {   
        Store s = new Store();

        Customer c1 = new Customer("Mohasin");
        Customer c2 = new Customer("Patel");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}

interface Member 
{
    void callBack();
}

class Store
{
    Member mem[] = new Member[10];
    int count = 0;

    void register(Member m)
    {
        mem[count] = m;
        count++;
    }

    void inviteSale()
    {
        for(int i = 0; i<count; i++)
        {
            mem[i].callBack();
        }
    }
}

class Customer implements Member
{
    String name; 

    public Customer(String name)
    {
        this.name = name;
    }

    public void callBack()
    {
        System.out.println("Ok, I will visit " + this.name);
    }
}