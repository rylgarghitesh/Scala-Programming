package exercises.oops.helper;

public class Pack {

    class Jist {
        public int a = 5;
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println("work");
        System.out.println(new Pack().new Jist().b());
    }
}
