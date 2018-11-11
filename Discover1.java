public class Discover1 {

    public static void main(String[] args) {
       /*
       //Discover 1
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1.equals(i2)); //true i1 are aceeasi valoare ca si i2
        System.out.println(i1==i2); //true
        //Why? obiectele de tip integer create in range-ul -128 si 127 sunt stocate intr-un array de Integer
       */

       /*
       //Discover 2
       Integer i11 = new Integer(127);
       Integer i22 = new Integer(127);
       System.out.println(i11.equals(i22)); //true - au aceleasi valori
       System.out.println(i11==i22); //false - pointeaza catre instante de obiecte separate in heap
       */

       //Discover 3
       Integer i111 = 128;
       Integer i222 = 128;
       System.out.println(i111.equals(i222)); // true - valorile sunt egale
       System.out.println(i111==i222); //false - i111 si i222 sunt diferite, pointeaza catre instante diferite de obiecte in heap

    }
}
