package Proyecto_Bingo;


import java.util.Scanner;

/*Generar el cartón, crear 10 números aleatoriamente, en un array,
, ver despues los números generados, en una sola linea, con un espacio \t,
    Se generan entre (1-99), dar un espacio debajo del cartón, que no se repita el número,
    debe estar dentro de un for nuevo, y crear un array nuevo donde se vayan guardando ,
    los numeros que han salido, ese array es numerosSalidos, debo crear dentro de el for un do while,
    para  que cada número en el cartón sea "No repetido", el bucle do-while  va hacer que se
    regeneren números en caso de que  haya salido uno ya, y así no se repita. Una vez conseguido esto,
    hacemos que se imprima por consola el cartón generado de 10 números, con espacios, luego que me imprima
    los números que salen del bingo, y despues me vaya cantando por orden los numeros que coincidan de mi linea y bingo,
    la linea debe parar de cantarla al 5 acierto y el bingo al 10 acierto, después me debe decir en cuantos intentos he acertado la linea
    y en cuantos aciertos he acertado el bingo, y finalmente si acierto en cuantos números me sale el bingo saldrá el importe de mi apuesta ganadora.*/
    public class Bingo{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de números que se prevé acertar en el bingo");
            int cantidadAciertos = scanner.nextInt();
            int[] carton = new int[10];
            System.out.println("Introduce tu apuesta en $");
            int apuesta = scanner.nextInt();
            int Cantolinea = 0;
            int CantoBingo = 0;
            int numeroslinea = 0;
            int numerosbingo = 0;
            int[] numerosSalidos = new int[99];
            int[] Bingo = new int[99];

            // Generar el cartón
            for (int i = 0; i < carton.length; i++) {
                int numeroAleatorio;
                boolean repetido;

                do {
                    numeroAleatorio = (int) (Math.random() * 99) + 1;
                    repetido = false;

                    for (int j = 0; j < i; j++) {
                        if (carton[j] == numeroAleatorio) {
                            repetido = true;

                        }
                    }

                } while (repetido);

                carton[i] = numeroAleatorio;
            }

            System.out.println("El cartón generado es: ");
            for (int item : carton) {
                System.out.print(item + "\t");
            }
            System.out.println();

            // Generar los números del Bingo
            for (int i = 0; i < Bingo.length; i++) {
                int numeroAleatorio;
                boolean repetido;

                do {
                    numeroAleatorio = (int) (Math.random() * 99) + 1;
                    repetido = false;

                    for (int j = 0; j < i; j++) {
                        if (Bingo[j] == numeroAleatorio) {
                            repetido = true;

                        }
                    }

                } while (repetido);
                Bingo[i] = numeroAleatorio;
            }

            // Imprimir los números del Bingo organizados en bloques de 20 por línea
            System.out.println("Los números del Bingo son: ");
            for (int i = 0; i < Bingo.length; i++) {
                System.out.print(Bingo[i] + "\t");

                // Salto de línea después de imprimir 20 números en una fila
                if ((i + 1) % 20 == 0) {
                    System.out.println();
                }
            }

            // Salto de línea al final si es necesario
            if (Bingo.length % 20 != 0) {
                System.out.println();
            }
            System.out.println();

            // Juego de Bingo
            for (int i = 0; i < Bingo.length && CantoBingo < carton.length; i++) {
                int numeroAleatorio;
                boolean repetido;

                do {
                    numeroAleatorio = Bingo[i]; // Usar el número generado en lugar de generar uno nuevo
                    repetido = false;

                    for (int j = 0; j < i; j++) {
                        if (Bingo[j] == numeroAleatorio) {
                            repetido = true;


                        }
                    }

                } while (repetido);

                for (int j = 0; j < carton.length; j++) {
                    if (carton[j] == numeroAleatorio) {
                        Cantolinea++;
                        if (Cantolinea == 5 && numeroslinea == 0) {
                            numeroslinea = i + 1; // Guardar el número de bingo para la línea
                        }
                        CantoBingo++;
                        if (CantoBingo == 10) ;{
                            numerosbingo = i + 1;
                            // Guardar el número de bingo para el bingo
                        }
                        System.out.println("Número cantado " + numeroAleatorio);

                        if (Cantolinea <= 5) {
                            System.out.println("Números acertados linea " + Cantolinea);
                        }
                        if (CantoBingo <= 10) {
                            System.out.println("Números acertados Bingo " + CantoBingo);
                        }
                    }
                }
            }

            System.out.println("Los intentos para Linea son: " + numeroslinea);
            System.out.println();
            System.out.println("Los intentos para Bingo son:" + numerosbingo);

            if (numerosbingo == cantidadAciertos) {
                System.out.println("El Premio es ... " + (apuesta * 10) + "$");
            } else {
                System.out.println("La apuesta no ha sido premiada");
            }
        }
    }

