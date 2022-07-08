package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Oksana";
        String uzvards = "Jolkina";
        int vecums = 34;
        boolean isPresent = true;
        System.out.println("Vārds: " + vards + "\n" + "Uzvards: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbība? " + isPresent );

        String teikums = String.format("Vārds: %s",vards);
        System.out.println(teikums);
    }
}
