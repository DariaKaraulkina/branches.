public class Main {
    public static void main(String[] args) {
        bugfix();
        System.out.println("Это код из ветки <sout1>");
        System.out.println("Hello world!");
        System.out.println("Баг пофиксили, ура!");
    }
    public static void bugfix() {
        System.out.println("Этот код фиксит найденный баг");
    }
}