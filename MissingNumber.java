
public class MissingNumber {
	
	public static void GetMissingNum()
    {
        int[] a = { 5, 4, 4, 2, 1};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++)
            b[a[i] - 1]++;
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] == 0)
                System.out.println("Missing: {0}" + i + 1);
            else if (b[i] > 1)
            	System.out.println("Repeated: {0}" + i + 1);
        }              
    }
}
