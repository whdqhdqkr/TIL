package oop;

public class OuterClass {
    private int outerValue = 10;
    private static int outerStaticValue = 100;

    class InnerClass {
        private int innerValue = 20;

        public int getValue() {
            outerValue++;
            return innerValue;
        }

        // private static int innerStaticValue = 200; // Error!
        // public static int getInnerStaticValue() { } // Error!
    }

    public static class StaticInnerClass {
        private int staticInnerValue = 30;
        private static int staticInnerStaticValue = 300;

        public int getStaticInnerValue() {
            // outerValue++; // Error!
            outerStaticValue++;
            return staticInnerValue;
        }

        public static int getStaticInnerStaticValue() {
            // outerValue++; // Error!
            outerStaticValue++;
            return staticInnerStaticValue;
        }
    }
}
