
class TypesOfVariable{
    //instance variable
    int result=0;
    static int count=0;

    public void add(){
        //local variable
        int number1=0,number2=0;
        result = number1 + number2;
        System.out.println(number1+" "+number2);
    }


    public void static_variable(){
        System.out.println("Static is: "+ count);
        count++;
        System.out.println("Now static is: "+ count);
    }
}
public class VariableDemo {
    public static void main(String[] args) {
        TypesOfVariable tc = new TypesOfVariable();
        tc.add();
        tc.static_variable();

    }
}
