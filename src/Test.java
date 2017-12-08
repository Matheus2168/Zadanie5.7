import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 5 imion");
        String[] names = new String[5];

        for (int i = 0 ; i < names.length ; i++){
            names[i] = sc.nextLine();
        }

        for (int i = names.length-1 ; i>= 0 ; i--){
            System.out.println("Czesc "+names[i]);
        }


    }

}
