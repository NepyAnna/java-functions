//Inicializa la clase Welcome
//Crea el método main

//Tarea 1
//Define el método greeting que imprima en terminal ¡Hola FemCoder!
//Ejecuta el método greeting 

//Tarea 2
//Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
//Ejecuta el método greetingCoder 

//¿Sabes donde definir el método y en dónde lo has de ejecutar? Si no lo sabes vuelve al archivo de Resources.md
public  class Welcome {
    public static void greeting(){
        System.out.println("¡Hola FemCoder!");
    }

    public static void greetingCoder(String name) {
        System.out.println("¡Hola, " + name + "!");
    }
    
    public static void main(String[] args) {
        greeting();
        greetingCoder("Anna");
    }
}