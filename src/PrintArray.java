public class PrintArray {

//    Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”

    public void printIt(int[] arr){
        System.out.print("[");
            for (int i = 0; i <= arr.length - 1; i++){
                System.out.print(arr[i]);
                if(i < arr.length - 1){
                    System.out.print(", ");
                }
            }
        System.out.print("]");
    }

}
