package staticNonstaticFields;

class TLC {
    static int sf;
    int nf;

    static class SMC {
        static int ssf = sf + sf;
        int snf = sf + TLC.sf;
    }

    class NMC {
        int nnf1 = sf + nf;
        int nnf2 = TLC.sf + TLC.this.nf;
    }

    void nm() {
        class NLC {
            int m(final int p) {
                return sf + nf + p;
            }
        }
    }

    public static void main(String[] args) {
        sf = 4;
        System.out.println(SMC.ssf);
        sf = 6;
        System.out.println(SMC.ssf);
    }
}