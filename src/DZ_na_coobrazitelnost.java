//ДЗ на сообразительность
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int c [] ={5,3,5,21,2,4,5,1,3,8,9};
        for(int i =0;i>c.length;i++){
            c[i]=(int) (Math.random()*10);
        }
        System.out.println("not sorted" +Arrays.toString(c));
        int f;
        for(int i =0;i<c.length;i++){
            for(int j =0;j<c.length -1;j++){
                if(c[j]>c[j+1]){
                    f =c[j];
                    c[j]=c[j+1];
                    c[j+1]=f;



                }
            }
            System.out.println( Arrays.toString(c));
        }
        System.out.println(" sorted" +Arrays.toString(c));


    }

        }
