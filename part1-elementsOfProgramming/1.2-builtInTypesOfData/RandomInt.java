// Program 1.2.5 - Casting to get a random integer

public class RandomInt 
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();  // Uniform between [0,1)
        int n = (int) (r * N);     // Uniform between 0 and N-1
        System.out.println(n);
    }    
}