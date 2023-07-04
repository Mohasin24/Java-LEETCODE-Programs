
class try1
{
    public static void main(String[] args) 
    {
        
    }

    static int fun(int num)
    {
        System.out.println(num);
        if(num<1)
        {
            return 0;
        }
        else if(num%2 == 0)
        {
            return fun(num-1);
        }
        else
        {
            return num + fun(num-2);
        }
    }
}