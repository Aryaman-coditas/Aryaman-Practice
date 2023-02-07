public class Operators {
    public static void main(String args[]){
        int Number1=10;
        int Number2=5;
        int Result=0;

        System.out.println("*********Arithmetic Operators*************");
        System.out.println("First Number + Second Number = "+ (Number1 + Number2));
        System.out.println("First Number - Second Number = "+ (Number1 - Number2));
        System.out.println("First Number * Second Number = "+ (Number1 * Number2));
        System.out.println("First Number / Second Number = "+ (Number1 / Number2));
        System.out.println("First Number % Second Number = "+ (Number1 % Number2));

        System.out.println("");

        System.out.println("*********Assignment Operators*************");
        System.out.println("Number1+=Number2 = "+ (Number1+=Number2));
        System.out.println("Number1*=Number2 = "+ (Number1*=Number2));

        System.out.println("");

        System.out.println("*********Relational Operators*************");
        System.out.println("Number1>Number2 = "+ (Number1>Number2));
        System.out.println("Number1!=Number2 = "+ (Number1!=Number2));
        System.out.println("Number1>Number2 = "+ (Number1>=Number2));

        System.out.println("");

        System.out.println("*********Logical Operators*************");
        System.out.println((Number1 > Number2) && (Number1 < Number2));
        System.out.println((Number1 > Number2) || (Number1 < Number2));

        System.out.println("");

        System.out.println("**************Increment Decrement Operator***************");
        int Number3=10;
        int Number4=20;
        System.out.println("Original Value of Number3 = "+Number3);
        System.out.println("Value after increment = "+ ++Number3);

        System.out.println("Original Value of Number4 = "+Number4);
        System.out.println("Value after decrement = "+ --Number4);


        System.out.println("");

        System.out.println("**************Instance Operator***************");
        String string = "Coditas";
        boolean result;

        result = string instanceof String;
        System.out.println("Is it an instance of String? : " + result);


        System.out.println("");

        System.out.println("**************Ternary Operator***************");
        String Number5="Even";
        String result2;
        result2 = (Number5 == "Even") ? "True" : "False";
        System.out.println(result2);





    }
}
