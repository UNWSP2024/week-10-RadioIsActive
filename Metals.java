package src.JavaWeek10Programs;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Metals {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String name;
        String density;
        Double melt;
        Double boil;
        int hardness;

        System.out.print("Enter the name of the metal: ");
        name = userinput.nextLine();
        System.out.print("Enter the density of "+name+" in g/cm^3: ");
        density = userinput.nextLine();
        System.out.print("Enter the melting point of "+name+" in Celcius: ");
        melt = userinput.nextDouble();
        System.out.print("Enter the boiling point of "+name+" in Celcius: ");
        boil = userinput.nextDouble();
        System.out.print("Enter the hardness (0-10) of "+name+": ");
        hardness = userinput.nextInt();

        melt = (9.0 / 5) * melt + 32;
        boil = (9.0 / 5) * boil + 32;

        System.out.println("\nMetal: "+name);
        System.out.println("Density: "+density);
        System.out.println("Melting point in Fahrenheit: "+melt);
        System.out.println("Boiling point in Fahrenheit: "+boil);
        System.out.println("Hardness: "+hardness);

        userinput.close();	
    }
}
