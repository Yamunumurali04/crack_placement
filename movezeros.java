public class movezeros {
    public static void main(String args[])
    {
         int array[] = {1,0,2,3,0,0};
         int count =0;
         int n = array.length;
         for(int i = 0;i< n;i++)
         {
            if(array[i] != 0)
            {
                array[count++] = array[i];
            }
         }
         while(count < n)
         {
             array[count++] = 0;
         }
         for(int arr : array)
         {
            System.out.println(arr);
         }
    }
    
}
