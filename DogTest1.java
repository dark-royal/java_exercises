import java.util.Scanner;

public class DogTest1{
   public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

Dog dog = new Dog();

System.out.print("Enter dog's name");
String dogName = dog.nextLine();

dog.setDogName(String name);
String name = dog.getDogName();

System.out.print("Enter the dog's breed");
String dogBreed = dog.nextLine();

dog.setDogBreed(String breed);
String breed = dog.getDogBreed();

System.out.printf("The dog name is %s%n",name);
System.out.printf("The dog breed is %s%n",breed);









}




}