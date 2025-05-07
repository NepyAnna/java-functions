import java.util.Random;
import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        /* 
        Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que ingrese datos y recogerlos).
      
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose 3 numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        scanner.nextLine();

        if(isHigherThanSix(firstNumber, secondNumber, thirdNumber) || isLessThanOne(firstNumber, secondNumber, thirdNumber)){
            scanner.close();
            System.exit(0);
        }

        System.out.println("Do you wanna to roll dices?");
        String rollsDiceAnswer = scanner.nextLine();

        if (rollsDiceAnswer.equalsIgnoreCase("no")){
            scanner.close();
            System.exit(0);
        }

        int sumSelectedNumbers = firstNumber + secondNumber + thirdNumber;
        int sumRolledDices = rollDice() + rollDice() + rollDice();

        System.out.println(String.format("The sum of the numbers selected: %d%nThe sum of the numbers rolled: %d%n", sumSelectedNumbers, sumRolledDices));
        if(userWon(sumSelectedNumbers, sumRolledDices)) {
            System.out.println("You WON!!!");
        } else {
            System.out.println("Sorry, maybe next time");
        }
    }



    /**
     * 
     * Function name: isLessThanOne
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if numbers are less than 1
     */
    
    public  static  boolean isLessThanOne(int num1, int num2, int num3) {
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    /**
     * 
     * Function name: isHigherThanSix
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    public static  boolean isHigherThanSix(int num1, int num2, int num3) {
        return num1 > 6 || num2 > 6 || num3 > 6;
    }

    /**
     * 
     * Function name: userWon
     * 
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    public  static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return sumNumbers > sumDiceRolls && Math.abs(sumNumbers - sumDiceRolls) < 5;
    }

    /**
     * Function name: rollDice
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    public  static  int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
