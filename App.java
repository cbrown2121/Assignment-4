public class App {
    public static void main(String[] args) throws Exception {
        int i = 5;
        int j = i-- +i;
        System.out.println(j);
        System.out.println(i);
    }
}
