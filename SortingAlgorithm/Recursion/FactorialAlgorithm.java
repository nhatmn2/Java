package SortingAlgorithm.Recursion;

public class FactorialAlgorithm {
    public static void main (String[] args){
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }


    //NOTE: be careful when using recursive. If you don't have the exit condition the code will have stack overflow condition 
    //because the recursive haven't returned the result untill it reaches the exit condition. All the result will be stored in the stack first.
    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!;
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3! 
    // n! = n * (n - 1)!
    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num -1);
    }


    //not going to use recursion
    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; ++i){
            factorial *= i;
        }
        return factorial;
    }
}
