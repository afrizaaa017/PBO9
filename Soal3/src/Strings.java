import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak string yang ingin Anda urutkan? ");
        size = scan.nextInt();
        scan.nextLine();  

        stringList = new String[size];

        System.out.println("\nMasukkan string-string...");
        for (int i = 0; i < size; i++) {
            System.out.print("String " + (i+1) + ": ");
            stringList[i] = scan.nextLine();
        }

        // Sorting.selectionSort(stringList);
        Sorting.insertionSort(stringList);

        System.out.println("\nString-string Anda dalam urutan yang telah diurutkan...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + " ");
        }
        System.out.println();

        scan.close(); 
    }
}
