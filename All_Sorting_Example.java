package sorting;

public class All_Sorting_Example
{
    public static void main(String arg[])
    {
        int[] arr = new int[] {4,1,5,2,3,7,6,10,9,12,11,8};

        SortingAlgo obj = new SortingAlgo();

//        obj.Bubble_Sort(arr);
//        obj.Selection_Sort(arr);
//        obj.Insertion_Sort(arr);
        obj.Cyclic_Sort(arr);

        printArray(arr);
    }

    private static void printArray(int[] a)
    {
        for(int x : a)
        {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

class  SortingAlgo
{
    // swaps the elements
    private void swap(int[] a, int e1, int e2)
    {
        int temp = a[e1];
        a[e1] = a[e2];
        a[e2] = temp;
    }

    // Bubbles out the largest element and put at the ending index on correct position
    public void Bubble_Sort(int[] a)
    {
        int n = a.length;

        for(int i = 0; i<n-1; i++)
        {
            for(int j = 1; j<n-i; j++)
            {
                if(a[j-1]>a[j])
                {
                    swap(a,(j-1),(j));
                }
            }
        }
    }

    // finds the smallest element index an put it at the correct index
    public void Selection_Sort(int[] a)
    {
        int n = a.length;

        for(int i = 0; i<n; i++)
        {
            int min = i;

            for(int j = i+1; j<n; j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }

            swap(a,min,i);
        }
    }

    // insertion sort divides the array as sorted half and unsorted half starting with second position

    public void Insertion_Sort(int[] a)
    {
        int n = a.length;

        for(int i = 1; i<n; i++)
        {
           for(int j = i-1; j>=0; j-- )
           {
               if(a[j]>a[j+1])
               {
                   swap(a,j,j+1);
               }
               else
               {
                   break;
               }
           }

//            int j = i-1; //0
//            while(j>=0 && a[j]>a[j+1])
//            {
//                swap(a,j,j+1);
//                j--;
//            }
        }
    }

    // works only with values in range from 0-N
    public void Cyclic_Sort(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            if(i != (a[i]-1))
            {
                swap(a,i,a[i]-1);
            }
        }
    }
}
