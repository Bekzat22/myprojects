//ДЗ на сообразительность
public class DZ_na_coobrazitelnost {
    public static void main(String[] args) {
        int[] b = {5, 7, 2, 4, 45, 3, -9, 8, 9};
        sort(b);

        for(int i =0;i<b.length;i++)
            System.out.print(b[i]+" ");

    }
    public static void sort(int[] b){
        int r = b.length;
        for(int i = 0; i < r;i++){
            for(int c =1;c<r-i;c++){
                if(b[c]<b[c-1]){
                    int t = b[c];
                    b[c]=b[c-1];
                    b[c-1]=t;

                }
            }
        }
    }

    }
