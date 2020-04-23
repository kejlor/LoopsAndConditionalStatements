public class CountingTillX {

//    Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X

    public void counting(int x){
        for (int i = 0; i <= x; i++){
            System.out.println(i);
        }
    }
//    Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie)
    public void countingWithWhile(int x){
        int number = 0;
        while (number <= x){
            System.out.println(number);
        }
    }

}
