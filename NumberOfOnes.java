
public class NumberOfOnes {
	public static void main(String[] args) {

        int a = 8;
        int orig = a;
        int count = 0;
        while(a>0)
        {
            a = a >> 1 << 1;
            if(orig-a==1)
                count++;
            orig = a >> 1;
            a = orig;
        }
        System.out.println("Number of 1s are: "+count);
}
}
