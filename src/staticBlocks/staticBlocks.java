package staticBlocks;

class StaticBlock {
    static int i = 5;

        static {
        i = 0;
    }

    {
        i = 18;
    }
}
class SubStatic extends StaticBlock{
    static int i = 6;

    static {
        i =10;
    }
}

class test {

    public static void main(String[] args) {
//
        System.out.println(StaticBlock.i); // when no other previous code, static block will be instantiated
        SubStatic s2 = new SubStatic(); // when subclass is instantiated
        s2.i = 12;
        System.out.println(SubStatic.i);
        System.out.println(StaticBlock.i); // parent class will use instance variable

        StaticBlock s = new StaticBlock();
        s.i = 29;
        System.out.println(StaticBlock.i);

    }


}
