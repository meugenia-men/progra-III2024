import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.ref.Cleaner;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer opc;
        do {
            System.out.println("-------------> Ingrese el numero de ejercicio o 0 para salir: ");

            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    //region exercise1
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 1 >>>>>>>>");
                    Integer N = 2;
                    Double A = 0.3;
                    Character C = 'r';

                    System.out.println(N);
                    System.out.println(A);
                    System.out.println(C);
                    System.out.println(N + A);
                    System.out.println(N - A);
                    System.out.println((int) C);

                    //endregion

                    break;
                case 2:
                    //region exercise2
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 2 >>>>>>>>");
                    Integer x = 34;
                    Integer y = 21;
                    Double n = 3.4;
                    Double m = 6.9;
                    System.out.println("x por y = " + (x * y));
                    System.out.println("x - y = " + (x - y));
                    System.out.println("m + n = " + n + m);
                    System.out.println("x + n = " + x + n);
                    //endregion
                    break;
                case 3:
                    //region exercise3
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 3 >>>>>>>>");
                    Integer nu = 22;
                    System.out.println("N = " + nu);
                    System.out.println("N aumentado en 77 = " + (nu + 77));
                    System.out.println("N reducido en 3 = " + (nu - 3));
                    System.out.println("N duplicado = " + (nu * 2));
                    // endregion
                    break;
                case 4:
                    //region exercise4
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 4 >>>>>>>>");
                    Integer a = 45;
                    Integer b = 23;
                    Integer c = 6;
                    Integer d = 12;

                    System.out.println(" A = " + a);
                    System.out.println(" B = " + b);
                    System.out.println(" C = " + c);
                    System.out.println(" D = " + d);

                    Integer aux;
                    aux = b;
                    b = c;
                    c = a;
                    a = d;
                    d = aux;

                    System.out.println(" A = " + a);
                    System.out.println(" B = " + b);
                    System.out.println(" C = " + c);
                    System.out.println(" D = " + d);

                    //endregion
                    break;
                case 5:
                    //region exercise5
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 5 >>>>>>>>");
                    Integer X = 23;
                    if (X % 2 == 0) {
                        System.out.println("el numero " + X + " es par");
                    } else {
                        System.out.println("el numero " + X + " " + "es impar");
                    }
                    //endregion
                    break;
                case 6:
                    //region excercise6
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 6 >>>>>>>>");
                    Integer B = -12;
                    if (B >= 0) {
                        System.out.println("el numero " + B + " es positivo");
                    } else {
                        System.out.println("el numero " + B + " es negativo");
                    }
                    //endregion
                    break;
                case 7:
                    //region exercise7
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 7 >>>>>>>>");
                    Integer ce = -5;
                    if (ce > 100) {
                        System.out.println("el numero " + ce + " es mayor que 100");
                    } else {
                        System.out.println("el numero " + ce + " es menor que 100");
                    }

                    if (ce % 10 == 0) {
                        System.out.println("es multiplo de 10");
                    }

                    if (ce % 5 == 0) {
                        System.out.println("es multiplo de 5");
                    }

                    if (ce % 2 == 0) {
                        System.out.println("es par");
                    } else {
                        System.out.println("es impar");
                    }

                    if (ce >= 0) {
                        System.out.println("y es numero positivo");
                    } else {
                        System.out.println("y es un numero negativo");
                    }
                    //endregion
                    break;
                case 8:
                    //region excercise8
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 8 >>>>>>>>");
                    System.out.println("Ingrese su nombre: ");
                    sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    System.out.println("Buenos dias " + name + "!!!");
                    //endregion
                    break;
                case 9:
                    //region excercise9
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 9 >>>>>>>>");
                    System.out.println("Ingrese un numero:");
                    Integer num = sc.nextInt();
                    Integer doble = num * 2, triple = num * 3;
                    System.out.println("El doble del numero " + num + " es " + doble + " y el triple " + triple);
                    //endregion
                    break;
                case 10:
                    //region excercise10
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 10 >>>>>>>>");
                    System.out.println("Ingrese los grados Fahrenheit: ");
                    Integer far = sc.nextInt();
                    Float result = (float) (far - 32) * 5 / 9;
                    System.out.println(far + " grados Fahrenheit equivalen a " + result + " grados Centigrados");
                    //endregion
                    break;
                case 11:
                    //region excercise11
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 11 >>>>>>>>");
                    System.out.println("Ingrese el radio de la circunferencia: ");
                    Integer rad = sc.nextInt();
                    Float area = (float) 3.14 * (rad * rad);
                    Float longit = (float) 3.14 * rad * 2;
                    System.out.println("El area de la circunferencia es " + area + " y la longitud es " + longit);
                    //endregion
                    break;
                case 12:
                    //region exercise12
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 12 >>>>>>>>");
                    System.out.println("Ingrese la velocidad en Km/h : ");
                    Integer km = sc.nextInt();
                    System.out.println("Los " + km + " km/h equivalen a " + km * 1000 + " m/h");
                    //endregion
                    break;
                case 13:
                    //region excercise13
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 13 >>>>>>>>");
                    //endregion
                    break;
                case 14:
                    //region excercise14
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 14 >>>>>>>>");
                    //endregion
                    break;
                case 15:
                    //region excercise15
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 15 >>>>>>>>");

                    //endregion
                    break;
                case 16:
                    //region exercise16
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 16 >>>>>>>>");
                    System.out.println("Ingrese un numero de 3 cifras: ");
                    Integer nn = sc.nextInt();
                    Integer i = 0;

                    while (nn >= 100) {
                        nn = nn - 100;
                        i = i + 1;
                    }
                    System.out.println("Primer cifra es " + i);
                    i = 0;
                    while (nn >= 10) {
                        nn = nn - 10;
                        i = i + 1;
                    }
                    System.out.println("Segunda cifra es " + i);
                    i = 0;
                    while (nn > 0) {
                        nn = nn - 1;
                        i = i + 1;
                    }
                    System.out.println("Tercera cifra es " + i);

                    //endregion
                    break;
                case 17:
                    //region excercise17
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 17 >>>>>>>>");
                    //endregion
                    break;
                case 18:
                    //region excercise18
                    System.out.println("<<<<<<<< EJERCICIO NUMERO 18 >>>>>>>>");
                    Integer hr = 12, min = 20, sec = -33;

                    if (hr >= 0 && hr < 24) {
                        if (min < 60 && min > 0) {
                            if (sec > 0 && sec < 60) {
                                System.out.println("Hora Correcta!!!");
                            } else {
                                System.out.println("segundos incorrectos");
                            }
                        } else {
                            System.out.println("minutos incorrectos");
                        }
                    } else {
                        System.out.println("hora incorrecta");
                    }

                    //endregion
                    break;
                default:
                    break;
            }
        } while (opc != 0);
    }
}

