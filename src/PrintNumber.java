public class PrintNumber {

//    Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1)

    public void printIt(int number){
        while (number > 0){
            int temporary = number % 10;
            number /= 10;
            System.out.println(temporary);
        }
    }
}
