public class CompareValues {
    public static void main(String[] args){
        int x=0;
        while (x++ <10){ } //mai intai face ++ si dupa verifica - deci x=11
        String message = x>10 ?"Greater than":"false";
        System.out.println(message+","+x);
    }
}
