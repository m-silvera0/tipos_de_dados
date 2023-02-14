import java.util.Scanner;

public class OperadorCalc {
    public static void main(String[] miguelzzao ){
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int soma;
        int sub;
        int mult;
        int div;
        int resto;

        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        soma=numero1+numero2;
        System.out.println("A soma dos dois números é:" +soma);
        div=numero1/numero2;
        System.out.println("A divisão dos dois números é:" +div);
        mult=numero1*numero2;
        System.out.println("A multiplicação dos dois números é:" +mult);
        sub=numero1-numero2;
        System.out.println("A subtração dos dois números é:" +sub);
        resto=numero1%numero2;
        System.out.println("O resto dos números é:" +resto);






        
    }
}
