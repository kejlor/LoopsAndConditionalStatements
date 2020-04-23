public class ArrayFactory {

    int entire;

    public ArrayFactory(int entire) {
        this.entire = entire;
    }

    public int[] oneDimension(){
        return new int[entire];
    }

    public int[][] twoDimension(){
         int[][] array = new int[entire][];
         for (int i = 0; i < entire; i++){
             array[i] = new int[entire];
         }
         return array;
    }
//    Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”)
// Couldn't figure it out yet

}
