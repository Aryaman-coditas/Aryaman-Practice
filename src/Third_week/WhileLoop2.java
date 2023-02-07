package Third_week;

public class WhileLoop2 {
    public static void main(String[] args) {

        int i=0;

        while(i<10){
            i++;
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
    }
}
