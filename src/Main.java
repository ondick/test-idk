import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
            ArrayList<Mazlicek> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            boolean power = true;
            while (power == true) {
                System.out.println("1: Pridat mazlicka");
                System.out.println("2: Vypsat mazlicky");
                System.out.println("3: Ukončit program");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Kolik chces pridat mazlicku?");
                        int cislo = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < cislo; i++) {
                            System.out.println("Jak se jmenuje?");
                            String jmeno1 = sc.nextLine();
                            System.out.println("Jaký je to druh?");
                            String druh1 = sc.nextLine();
                            System.out.println("Kolik mu je?");
                            int vek1 = sc.nextInt();
                            System.out.println("Kolik váží?(kg)");
                            double vaha1 = sc.nextDouble();
                            sc.nextLine();
                            list.add(new Mazlicek(jmeno1,druh1,vek1,vaha1));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("Mazlicek " + (i+1) + ": " + list.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Konec programu.");
                        power = false;

                        break;



                }
            }
            }


        /*List<Integer> list = new ArrayList<>(); Collections. addAll(list, 1, 2, 3, 4, 5); And another one to exemplify the operation with two arrays:
        List<Integer> list = new ArrayList<>(); Integer[] otherList = new Integer[] {1, 2, 3, 4, 5}; Collections.*/
        }

