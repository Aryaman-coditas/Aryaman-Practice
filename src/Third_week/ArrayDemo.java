package Third_week;

class OneDArray{
    public void display(){
        int rollNumber[];//way one
        rollNumber = new int[5];//defination

        //way2
        String name[] = new String[5];// definaation


        //way3
        String city[]={"Pune","Indore"};

        //ways to print
        for(int i=0;i< city.length;i++){
            System.out.println(city[i]);
        }

        //way2

        name[0]="Aryaman";
        name[1]="Abhay";
        name[2]="Tanmay";
        name[3]="Jay";

        for (String newName:name) {
            System.out.println(newName);
        }


    }
}

class JaggedArrayDemo{

    public void display(){

        int a[][] = new int[3][3];


        for(int i=0;i<a.length;i++){
            for(int j=0;j<=a.length;j++){

            }
        }
    }
}
class TwoDArray{
    public void display(){

    }
}
public class ArrayDemo {
    final static public strictfp void main(String... args) {
        System.out.println("Hello");


        OneDArray oneDArray = new OneDArray();
        oneDArray.display();

        TwoDArray twoDArray = new TwoDArray();
        twoDArray.display();

        JaggedArrayDemo jaggedArrayDemo = new JaggedArrayDemo();
        jaggedArrayDemo.display();
    }
}
