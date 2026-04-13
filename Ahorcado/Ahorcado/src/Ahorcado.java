import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner que nos permite que el usuario escriba.
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabrasecreta = "alajuelense";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos: 

        //Capturar las letras en una variables String
        char[] letrasAdivinadas = new char[palabrasecreta.length()];


        // Estructura de control : Iterativa (Bucle For) para los guiones
        for (int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }

        // Estructura de control : Iterativa (Bucle While)
        while (!palabraAdivinada && intentos < intentosMaximos ) {
                                                        //ValueOF Se usa mucho para convertir
            System.out.println("Palabra a adivina: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduzca una letra por favor");
            //Usamos la clase scanner para pedir una letra
            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;
            
            // Estructurade de control Iterativa (Bucle for)

            for(int i = 0; i < palabrasecreta.length(); i++){
                //Estructura de control: condicional
                if(palabrasecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            
            if(!letraCorrecta){
                intentos ++;
                System.err.println("¡Incorrecto! Le quedan "+ (intentosMaximos - intentos));

            }

            if(String.valueOf(letrasAdivinadas).equals(palabrasecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: "+ palabrasecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Que pena, se ha quedado sin intentos. ¡Game Over! ");
        }

        scanner.close();
    }
}
