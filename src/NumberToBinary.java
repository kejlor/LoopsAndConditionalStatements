public class NumberToBinary {

//    Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.

    public String toBinary(int number){
        return Integer.toString(number, 2);
    }

}
