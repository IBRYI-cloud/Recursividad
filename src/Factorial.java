public class Factorial {
    /**
     * 5! = 5 * 4 * 3 * 2 * 1
     *
     */
    public static int FactorialSinRecursividad(int numero){
        int factorial = 0;
        for (int i = numero; 1 < numero; i--){
            factorial = factorial * i;
            System.out.println(factorial);
        }

        return factorial;
    }


    public static int factorial(int numero){
        int factorial = 0;
        factorial = numero * factorial( numero - 1);
        return factorial;
    }
    /* maximo comun divisor(mcd), algoritmo de euclides
    a= 412 y b= 184
     */
    public static int mcd(int a, int b){
        int mcd;
            if (a == b){
            //caso base
            mcd= b;
            }else {
                    if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
                mcd = mcd(a, b);
        }
        return mcd;
    }
}
