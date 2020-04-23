public class ReversedString {

    public void reversed(String word){
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }

        System.out.println(reversedWord);
    }

}
