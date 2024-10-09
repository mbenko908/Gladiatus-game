package com.game;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private final static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Gladiatus game!");
		System.out.println("Enter your name:");
		final String name = scanner.nextLine();
		final Hero hero = new Hero(name);
		System.out.println("Hello " + hero.getName() + ". Let's get start the game!");
		
		System.out.println("Your abilities");
		for (Map.Entry<Ability, Integer> entry : hero.getAbilities().entrySet()) {
			System.out.print(entry.getKey() + ": " + entry.getValue() + ",");
		}
		System.out.println();
		
	}

}
