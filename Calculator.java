public class Calculator {
    
    public static void main(String[] args) {
        System.out.println(add(7, 3.5));
        System.out.println(subtract(7, 3.5));
        System.out.println(multiply(7, 3.5));
        System.out.println(divide(7, 3.5));
    }

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */

    public static double  add(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */

    public  static double multiply(double number1, double number2) {
        return number1*number2;
    }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */

    public  static  double divide(double number1, double number2) {
        return number1/number2;
    }
}
