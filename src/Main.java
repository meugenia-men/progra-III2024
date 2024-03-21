import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        switch (){
            case 1:
                //region exercise1
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
        }

        //region exercise2
        Integer x=34;
        Integer y=21;
        Double n=3.4;
        Double m=6.9;
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(n+m);
        System.out.println(x+n);

        //endregion

        //region exercise3
        System.out.println("N aumentado en 77 = "+ (N+77));
        System.out.println("N reducido en 3 = "+ (N-3));
        System.out.println("N duplicado = "+ (n*2));
        // endregion

        //region exercise4
        Integer a=45;
        Integer b=23;
        Integer c=6;
        Integer d=12;
        Integer aux;
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;

        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);

        //endregion

        //region exercise5
        Integer X=23;
        if(X%2==0){
            System.out.println("el numero "+ X +" es par");
        }
        else{
            System.out.println("el numero "+ X +" " + "es impar");
        }
        //endregion

        //region excercise6
        Integer B=-12;
        if(B>=0){
            System.out.println("el numero "+ B +" es positivo");
        }
        else{
            System.out.println("el numero "+ B +" es negativo");
        }
        //endregion

        //region exercise7
        Integer ce=-5;
        if(ce>100) {
            System.out.println("el numero " + ce + " es mayor que 100");
        }
        else {
            System.out.println("el numero " + ce + " es menor que 100");
        }

        if(ce%10==0){
            System.out.println("es multiplo de 10");
        }

        if(ce%5==0){
            System.out.println("es multiplo de 5");
        }

        if(ce%2==0){
            System.out.println("es par");
        }
        else{
            System.out.println("es impar");
        }

        if(ce>=0){
            System.out.println("y es numero positivo");
        }
        else{
            System.out.println("y es un numero negativo");
        }
        //endregion

        //region excercise8
        System.out.println("Ingrese su nombre: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Buenos dias "+ name+ "!!!");
        //endregion

        //region excercise9
        System.out.println("Ingrese un numero:");
        Integer num=sc.nextInt();
        Integer doble=num*2,triple=num*3;
        System.out.println("El doble del numero "+ num + " es "+ doble + " y el triple "+ triple);
        //endregion


        //region excercise10
        System.out.println("Ingrese los grados Fahrenheit: ");
        Integer far=sc.nextInt();
        Float result = (float) (far-32)*5/9;
        System.out.println(far + " grados Fahrenheit equivalen a "+ result + " grados Centigrados");
        //endregion

        //region excercise11
        System.out.println("Ingrese el radio de la circunferencia: ");
        Integer rad=sc.nextInt();
        Float area=(float) 3.14*(rad*rad);
        Float longit=(float) 3.14 *rad*2;
        System.out.println("El area de la circunferencia es "+area+ " y la longitud es "+longit);
        //endregion

        //region exercise12
        System.out.println("Ingrese la velocidad en Km/h : ");
        Integer km=sc.nextInt();
        System.out.println("Los "+ km + " km/h equivalen a "+ km*1000 +" m/h");
        //endregion

        //region excercise13

        //endregion

        //region excercise14

        //endregion

        //region excercise15

        //endregion

        //region exercise16
        System.out.println("Ingrese un numero de 3 cifras: ");
        Integer nn=sc.nextInt();
        Integer i=0;

        while(nn>=100){
            nn=nn-100;
            i=i+1;
        }
        System.out.println("Primer cifra es "+i);
        i=0;
        while(nn>=10){
            nn=nn-10;
            i=i+1;
        }
        System.out.println("Segunda cifra es "+i);
        i=0;
        while(nn>0){
            nn=nn-1;
            i=i+1;
        }
        System.out.println("Tercera cifra es "+i);

        //endregion

        //region excercise17

        //endregion

        //region excercise18
        Integer hr=12, min=20, sec=-33;

        if(hr>=0 && hr<24){
            if(min<60 && min>0){
                if(sec>0 && sec<60)
                {
                    System.out.println("Hora Correcta!!!");
                }
                else{
                    System.out.println("segundos incorrectos");
                }
            }
            else {
                System.out.println("minutos incorrectos");
            }
        }
        else{
            System.out.println("hora incorrecta");
        }

        //endregion
    }
}

