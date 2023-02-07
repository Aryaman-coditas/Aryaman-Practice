package Third_week;

public class NumPatFloyd {
    public static void main(String[] args) {

        int rows=5;
        int v=1;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(v+" ");
                v++;
            }

            System.out.println();
        }
    }
}
