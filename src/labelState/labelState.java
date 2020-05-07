package labelState;

public class labelState {
    public static void main(String[] args) {
        loops:
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 3; m++){
                if(i == 1) {
                    continue loops;
                }
                System.out.println(i + " " + m);
            }
        }
    }

}
