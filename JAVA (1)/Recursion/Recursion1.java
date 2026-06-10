public class Recursion1 {
    static int main(int n) {
        if(n==11){
            return 0;
        }
        return n + main(n + 1);
    }
    public static void main(String[] args) {
        System.out.println(main(1));
    }
}
