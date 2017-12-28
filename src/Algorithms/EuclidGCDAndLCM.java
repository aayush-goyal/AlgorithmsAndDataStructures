package Algorithms;

public class EuclidGCDAndLCM {
    public static void main(String args) {

    }
    /*
    private static long gcd(long a, long b)
{
    while (b > 0)
    {
        long temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
}

private static long gcd(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
    return result;
}
Least common multiple is a little trickier, but probably the best approach is reduction by the GCD, which can be similarly iterated:

private static long lcm(long a, long b)
{
    return a * (b / gcd(a, b));
}

private static long lcm(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
    return result;
}
     */
}
