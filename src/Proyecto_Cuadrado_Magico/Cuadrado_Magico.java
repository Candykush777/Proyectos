package Proyecto_Cuadrado_Magico;
    /*Realizar una aplicación que permita crear un cuadrado mágico. Para ello nada más arrancar la aplicación
 pedirá el tamaño del cuadrado (3x3, 4x4, etc...)
Una vez echo esto se mostrará por consola el cuadrado generado
* Para que un cuadrado sea mágico, todas cada una delas filas, columnas y diagonales es la misma. */
import java.util.Scanner;

public class Cuadrado_Magico {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce las filas  del cuadraro mágico : ");
            int filas = scanner.nextInt();
            System.out.println("Introduce las columnas  del cuadraro mágico : ");
            int columnas = scanner.nextInt();
            int[][] cuadradoMágico = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    int numeroAleatorio;
                    boolean repetido;
                    do {
                        numeroAleatorio = (int) (Math.random() * 99) + 1;
                        repetido = false;
                        for (int k = 0; k < filas; k++) {
                            for (int l = 0; l < columnas; l++) {
                                if (cuadradoMágico[k][l] == numeroAleatorio) {
                                    repetido = true;
                                    break;
                                }
                            }
                            if (repetido) {
                                break;
                            }
                        }
                    }
                    while (repetido);
                    cuadradoMágico[i][j] = numeroAleatorio;

                }


            }
            System.out.println();
            System.out.println("Muestra el cuadrado mágigo : ");
            System.out.println();
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(cuadradoMágico[i][j] + "\t");

                }

                System.out.println();

            }

        }
    }

