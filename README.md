# Java-8

This repo is all about the learning of Java 8

Resource: https://www.youtube.com/watch?v=Tm2BpKlv1rU&list=PLd3UqWTnYXOlrKZWFTbgguqNRA_uVyeBl


Note : 

Lambda expression can be used only for functional interface i.e. interface having exactly 1 abstract class

example - 

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