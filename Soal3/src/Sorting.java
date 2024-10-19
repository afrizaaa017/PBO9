public class Sorting {
    
    public static void selectionSort(Comparable[] List) {
    int min;
    Comparable temp;

    for (int index = 0; index < List.length - 1; index++) {
        min = index;
        for (int scan = index + 1; scan < List.length; scan++) {
            // Ubah kondisi untuk urutan menurun
            if (List[scan].compareTo(List[min]) < 0) {
                min = scan;
            }
        }

        // Tukar elemen
        temp = List[min];
        List[min] = List[index];
        List[index] = temp;
    }
}


    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Mengurutkan dalam urutan menurun
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }

}
