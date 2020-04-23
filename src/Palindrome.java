public class Palindrome {

//    Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie

    public boolean checkPalindrome(String word){
        word.toLowerCase();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        if (word.equals(reversedWord)){
            return true;
        } else {
            return false;
        }
    }

}
