import java.util.Scanner;

public class DogTest{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

Dog dog = new Dog("","");
System.out.printf("initial name is %s%n%n",dog.getDogName());
System.out.printf("initial breed is %s%n%n",dog.getDogBreed());

System.out.println("Enter the dog name:");
String dogName = scanner.nextLine();
dog.setDogName(dogName);
String name = dog.getDogName();
System.out.println();

System.out.println("Enter the dog breed:");
String dogBreed = scanner.nextLine();
 dog.setDogBreed(dogBreed);
String breed = dog.getDogBreed();
System.out.println();

System.out.printf("The dog name is %s%n",name );
System.out.printf("The breed of the dog is %s%n",breed); 






}







}