import java.util.Scanner;

    public class Desafio {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String welcame ;
            int A;
            int B;
           String compare;

            System.out.println("Bem Vindo ao Comparador de A & B, Digite 'CONTINUE' para continuar!");
            welcame = scan.next();
            System.out.println("Digite um numero inteiro para representar 'A':");
            A = scan.nextInt();
            System.out.println("Digite um numero inteiro para representar 'B':");
            B = scan.nextInt();
            System.out.println("Digite'COMPARAR' para comparar se os numeros são iguais ");
            compare = scan.next();
            
            if (A==B)
            compare = "São Iguais";
            else 
            compare = "São Diferentes";

            System.out.println(compare);
            System.out.println("Obrigado por usar o comparador! ");
        }
    }
