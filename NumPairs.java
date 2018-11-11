import java.util.Arrays;

public class NumPairs {
    /*public static int countPairs(int v[], int size) {
        int count = 0;
        for (int i=0;i<size;i++)
            for (int j=i+1; j<size;j++)
                if (v[i] + v[j] == 0)
                    count++;
                return count;
    }*/
    public static void main(String[] args){
        int[] v = {3,2,-3,-2,3,0};
        int size = v.length;
       /* for (int i=0; i<size;i++)
            System.out.println(v[i]); */
       int aux;
       int count=0;
        Arrays.sort(v);
        /*for (int i=0; i<size;i++){
            aux = v[i];
            for (int j=i+1;j<size;j++){
                if (aux + v[j] == 0) {
                    System.out.println(aux);
                    System.out.println(v[j]);
                    count++;
                }
            }
        }*/

        int i=0;
        int j=size-1;
        while (i<j) {
            if (v[i]<0 && v[j]>0){
                if (Math.abs(v[i])>Math.abs(v[j])){
                    i++;
                }else if (v[i]+v[j] == 0){
                    count++;
                    System.out.println("("+v[i]+" : "+v[j]+")");
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else
                break;
        }
        System.out.println("Numarul de perechi este:"+count);
    }
}
