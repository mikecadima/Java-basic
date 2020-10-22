package javaAlgos;

public class DowncastingEx {
	public static void main(String[] args) {
		Animal animalReference = new Dog();
		
		Dog dogReference = (Dog) animalReference;
		
		Bird birdReference = (Bird) animalReference;
		
		if(animalReference instanceof Dog)
			dogReference = (Dog) animalReference;
		else
			System.out.println("animalReference does not point to dog obj");
	}
}
class Animal {}
class Dog extends Animal{}
class Bird extends Animal{}
