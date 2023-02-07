public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World");
        Addition add1 = new Addition();
        add1.Number1=20;
        add1.Number2=30;
        add1.add();
    }
}

class Addition{
    int Number1,Number2,Result=0;
    public void add(){
        Result = Number1 + Number2;
        System.out.println("Addition is:"+Result);
    }
}