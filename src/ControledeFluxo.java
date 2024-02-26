import java.util.Scanner;

public class ControledeFluxo {

    public static void main ( String Args[]){
        Scanner s = new Scanner( System.in);

        System.out.println("Digite 4 notas ");
        float nota1 = s.nextFloat();
        float nota2 = s.nextFloat();
        float nota3 = s.nextFloat();
        float nota4 = s.nextFloat();

        double media1 = (nota1 + nota2 + nota3 + nota4) /4 ;

        if ( media1 >= 7) {
            System.out.println("Aprovado , sua media é " + media1 );

     }
        if ( media1 >= 5){
            System.out.println("Recuperacao , sua media é " + media1);
        }
        else if ( media1 < 5 ){
            System.out.println("Reprovado , sua media é " + media1);
        }
    }
}

