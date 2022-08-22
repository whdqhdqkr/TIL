package oop;

public class Main {
    static void run() {
        var innerInstance = new OuterClass().new InnerClass();
//        var errorInnerInstance = new OuterClass.InnerClass(); // Error!
        var staticInnerInstance = new OuterClass.StaticInnerClass();
//        var errorStaticInnerInstance = OuterClass().new StaticInnerClass(); // Error!
    }
}
