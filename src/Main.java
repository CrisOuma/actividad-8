import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese los datos de el primer perro");
        System.out.println("nombre: ");
        String n1 = scanner.next();
        System.out.println("raza: ");
        String r1 = scanner.next();
        System.out.println("color: ");
        String c1 = scanner.next();
        System.out.println("número de ojos: ");
        int e1 = scanner.nextInt();
        System.out.println("número de patas: ");
        int p1 = scanner.nextInt();
        System.out.println("número de orejas: ");
        int ear1 = scanner.nextInt();
        System.out.println("tiene dueño? (s/n)");
        String own1 = scanner.next();
        boolean owner1;
        if (own1 == "s"){
            owner1 = true;
        }else{
            owner1 = false;
        }
        System.out.println("que tipo de comida consume? ");
        String food1 = scanner.next();
        System.out.println("cuántos gramos por plato? ");
        int grm1 = scanner.nextInt();

        perro dog1 = new perro(r1, n1, c1, e1, p1, ear1, owner1);

        System.out.println("ingrese los datos de el segundo perro");
        System.out.println("nombre: ");
        String n2 = scanner.next();
        System.out.println("raza: ");
        String r2 = scanner.next();
        System.out.println("color: ");
        String c2 = scanner.next();
        System.out.println("número de ojos: ");
        int e2 = scanner.nextInt();
        System.out.println("número de patas: ");
        int p2 = scanner.nextInt();
        System.out.println("número de orejas: ");
        int ear2 = scanner.nextInt();
        System.out.println("tiene dueño? (s/n)");
        String own2 = scanner.next();
        boolean owner2;
        if (own2 == "s"){
            owner2 = true;
        }else{
            owner2 = false;
        }
        System.out.println("que tipo de comida consume? ");
        String food2 = scanner.next();
        System.out.println("cuántos gramos por plato? ");
        int grm2 = scanner.nextInt();

        perro dog2 = new perro(r2, n2, c2, e2, p2, ear2, owner2);

        dog1.comer(food1, grm1);
        System.out.println(dog1.ladrar());

        dog2.comer(food2, grm2);
        System.out.println(dog2.ladrar());
    }
}