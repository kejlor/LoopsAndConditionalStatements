import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        CountingTillX countingTillX = new CountingTillX();
        countingTillX.counting(10);
        PrintNumber printNumber = new PrintNumber();
        printNumber.printIt(123);
        ReversedString reversedString = new ReversedString();
        reversedString.reversed("pies");
        NumberToBinary numberToBinary = new NumberToBinary();
        System.out.println(numberToBinary.toBinary(5));
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome("kajak"));
        System.out.println(palindrome.checkPalindrome("kotek"));
        PrintArray printArray = new PrintArray();
        int[] array = {1, 2 , 3};
        printArray.printIt(array);
        int[] notSortedArray = {10, 2, 1, 5, 30, 6, 3};
        System.out.println();
        bubbleSort(notSortedArray);
    }

//    Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej
//    do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.

    public static void bubbleSort(int[] array){
        int ammountOfElements = array.length;
        do {
            for (int i = 0; i < ammountOfElements - 1; i++){
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            ammountOfElements--;
        }
        while (ammountOfElements > 1);
        //print sorted array
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + " ");
        }
    }

}
