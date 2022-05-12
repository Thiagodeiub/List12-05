import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsercaoEDelecao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        char x;


        do {
            String name;
            System.out.println("digite um nome para lista");
            name = scan.nextLine();
            nomes.add(name);
            System.out.println("Deseja adicionar um item? (s/n");
            x = scan.next().charAt(0);

        } while (x == 's');


        for (String nome : nomes
        ) {
            System.out.println(nome);

        }

    }

}





