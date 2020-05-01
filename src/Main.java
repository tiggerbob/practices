class B // one non-static field vf, one static sf
{
    int vf;
    static int sf;

    B(int i) {
        vf = i;
        sf = i + 1;
    }
}

class C extends B // two non-static fields vf, one static sf
{
    int vf;
    static int sf;

    C(int i) {
        super(i + 20);
        vf = i;
        sf = i + 2;
    }
}

class D extends C // three non-static fields vf
{
    int vf;

    D(int i) {
        super(i + 40);
        vf = i;
        sf = i + 4;
    }
}

public class Main {

    public static void main(String[] args) {


    }
}
