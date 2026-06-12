public class LinkedListDemo {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);

        list.set(2,6);
        System.out.println(list);
    }
}
