public class Main {
    public static void main(String[] args) {
        bugfix();
        System.out.println("Это код из ветки <sout1>");
        System.out.println("Hello world!");
        System.out.println("Это исправленный код из ветки <sout 1> + <sout 3>");
        System.out.println("Баг пофиксили, ура!");
    }
    public static void bugfix() {
        System.out.println("Этот код фиксит найденный баг");
    }
}