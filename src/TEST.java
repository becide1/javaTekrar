import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Yazi : ");
//        String a = sc.nextLine();

//        for (int i = 0; i < a.length(); i++) {
//            System.out.print(a.charAt(i)+" ");

        String[][] fullname = {{"Bekir", "Sacide", "Muhammed"},
                               {"Canverdi1", "Canverdi2", "Canverdi3"},
                               {"kirkalti", "kirk", "onbes"}};
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

//                System.out.println(fullname[i][j] + " ");
                System.out.print(fullname[i][j] + " ");
            }
            System.out.println();
        }
    }
}



