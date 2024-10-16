import  java.util.Scanner;


public class Volume{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Enter length :");
    double lenght = input.nextDouble();


    double area = 0.4330*(lenght)*(lenght);
    System.out.printf("\n The sum of area is: %.2f",area);


    double volume = area * lenght;
      System.out.printf("\nVolume is %.2f",volume);

}

}