public class FizzBuzz {
    public static  String fizzBuzz(int num){
        if (num % (11*7*5*3) == 0){
            return "Fizz Buzz Foo Bar";
        }else if (num % (11*7*5) == 0){
            return "Buzz Foo Bar";
        }else if (num % (11*7*3) == 0){ //si tot asa pana acoperim toate combinatiile - nu le mai fac
            return "Fizz Foo Bar";
        }else if (num % (5*3) == 0){
            return "Fizz Buzz";
        }else if (num % 5 == 0){
            return "Buzz";
        }else if (num % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(num);
    }

    public static void main(String[] args){
        for (int i=1; i<1156; i++)
        {
            System.out.println(fizzBuzz(i));
        }
    }
}

