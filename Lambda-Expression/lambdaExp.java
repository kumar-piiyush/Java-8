//Basic Implentation

// interface Intf{
//     public void m1();
// }

// class Demo implements Intf{
//     public void m1(){
//         System.out.println("Hello");
//     }
// }

// public class lambdaExp {
//     public static void main(String[] args) {

//         Intf i = new Demo();
//         i.m1();
//     }
// }

// ---------------------------------------------------------------------------------------------





// Implementation using Lambda Expression

// 
//     public void m1(){
//         System.out.println("Hello");
//     }
// 

// Lambda for this will be :

// ()->System.out.println("Hello");






//So final code can be written as 

interface Intf{
    public void m1();
}

public class lambdaExp {
    public static void main(String[] args) {
        Intf i = ()-> System.out.println("Hello using Lambda expression");
        i.m1();
        i.m1();
        i.m1();
        i.m1();
    }
}
