class Operations{

    int FirstNumber=24;
    int SecondNumber=16;
    int Result=0;
    public void add(){
        Result = FirstNumber + SecondNumber;
        System.out.println("Sum is:"+Result);
    }

    public void substract(){
        Result = FirstNumber - SecondNumber;
        System.out.println("Differene is:"+Result);
    }

    public void multiply(){
        Result = FirstNumber * SecondNumber;
        System.out.println("Product is:"+Result);
    }

    public void divide(){
        Result = FirstNumber/SecondNumber;
        System.out.println("Divide is:"+Result);
    }

}

public class Calculator {
    public static void main(String args[]){

        Operations operations = new Operations();
        operations.add();
        operations.substract();
        operations.multiply();
        operations.divide();
    }
}
