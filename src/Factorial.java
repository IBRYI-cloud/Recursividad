import java.io.PrintStream;

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
    /*
    suma de elementos de un vector
    vector = {2, 4, 6}
    suma = 2 + {4, 6}
    SUMA = 4 + {6}
    suma = 6 (caso base)
     */
    public static int sumaVector(int[] vector, int indice){
        int suma;
        if (indice == vector.length - 1){
            //caso base
            suma = vector[indice];

        }else {
                suma = vector [indice] + sumaVector(vector, indice + 1);
        }
        return suma;
    }
}
