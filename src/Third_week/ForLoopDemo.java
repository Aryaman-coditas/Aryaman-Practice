package Third_week;

class ForDemo{
    public void display(){
        for (int i=0;i<10;i++){
            System.out.println("Details are::"+i);
        }
    }
}

class PrintPatterns{
    public void displayData(){
        for(int i=1;i<5;i++){ //row
            for(int j=1;j<=5;j++){ //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class ForLoopDemo {

    public static void main(String[] args) {
        ForDemo forDemo = new ForDemo();

        forDemo.display();

        PrintPatterns printPatterns = new PrintPatterns();
        printPatterns.displayData();
    }

}
