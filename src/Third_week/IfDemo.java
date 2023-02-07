package Third_week;

class SimpleIf{
    public void display(){
        int number1=10;
        if(number1 > 100){
            System.out.println("Number1 is greater:: "+number1);
        }
    }

}

class IfElseDemo{

    public void display(){
        int number1=10;
        if(number1 > 100){
            System.out.println("Number1 is greater:: "+number1);
        }

        else{
            System.out.println("Number1 is smaller");
        }
    }
}


class IfElseLadder{

    public void display() {
        int number1=12, number2=22, number3=11;
        if(number1>number2 && number1>number3){
            System.out.println("Number 1 is greater");
        }

        else if (number2>number1 && number2>number3) {
            System.out.println("Number 2 is greater");

        }

        else
            System.out.println("Number 3 is greater");

    }
}


public class IfDemo {
    public static void main(String[] args) {
        SimpleIf simpleIf = new SimpleIf();
        simpleIf.display();

        IfElseDemo ifElseDemo = new IfElseDemo();
        ifElseDemo.display();


        IfElseLadder ifElseLadder = new IfElseLadder();

    }
}
