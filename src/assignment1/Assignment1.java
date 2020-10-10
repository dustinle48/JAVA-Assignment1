/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import Dog.java;

/**
 *
 * @author ducth
 */
public class Assignment1 { 
    private static boolean checkId(ArrayList<Integer> dogIds, int dogId) {
        boolean check = dogIds.contains(dogId);
        return check;
    }
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Dog dog1 = new Dog(12412, "alex", 14.00, 'F');
        Dog dog2 = new Dog(11224, "alan", 11.00, 'M');
        Dog dog3 = new Dog(51524, "alen", 13.00, 'M');
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to DSS");        
        
        int dogId;
        String taskInput;
        String name;
        Double age;
        char sex;
		int newDogId;
        String foundHome;
        ArrayList<Dog> DogList = new ArrayList();
		ArrayList<int> DogIdList = new ArrayList();
		DogList.add(new Dog(12412, "alex", 14.00, 'F', true);
		DogList.add(new Dog(11224, "alan", 11.00, 'M', false);
		DogList.add(new Dog(51524, "alen", 13.00, 'M', true);
		for( Dog list : DogList){
			DogIdList.add(list.getId());
		}
       // Dog[] arr = new Dog[5];
       // Dog Alex = new Dog(12412, "alex", 14.00, 'F');
       // Dog Alan = new Dog(11224, "alan", 11.00, 'M');
       // Dog Alen = new Dog(51524, "alen", 13.00, 'M');                    
        
        do {
            System.out.println("Please choose a task:");
            System.out.println("1. Add dog");
            System.out.println("2. View all dogs");
            System.out.println("3. View all available dogs");
			System.out.println("4. View dog");
            System.out.println("5. Update dog home status");
            System.out.println("6. Exit");
        
            System.out.println("Enter a number:");
            taskInput = keyboard.nextLine();
            
            if (taskInput.equals("1")) {
                System.out.println("--------------------");
                System.out.println("Add new dog");
                System.out.println("--------------------");
                                
				dogId = (1 + rand.nextInt(2)) * 10000 + rand.nextInt(10000);
                //Check if Id is unique
                do {
                    //Auto generate Id
                    dogId = (1 + rand.nextInt(2)) * 10000 + rand.nextInt(10000);
                }while (checkId(dogIds, dogId));                        
                System.out.println("New dog id: " + dogId);

                System.out.println("Please enter name:");
                name = keyboard.nextLine();
               
                do {
                    System.out.println("Please enter age:");
                    age = keyboard.nextDouble();
                } while (!keyboard.hasNextDouble());
                
                do {
                    System.out.println("Please enter sex (F or M):");
                    sex = keyboard.next().charAt(0);
                }while (!((sex == 'M') || sex == 'F'));                               

                //dogIds.add(dogId);
				DogList.add(new Dog(dogId, name, age, sex, false);
                //Dog newdog = new Dog(dogId, name, age, sex, false);
                System.out.println("New dog has been added.");
                System.out.println("--------------------");
            } else if (taskInput.equals("2")) {
				System.out.println("Dog List:");
                for (Dog element : DogList) {
                    System.out.println(element.ViewAll());                    
                }
               // System.out.println("--------------------");
            } else if (taskInput.equals("3")) {
				System.out.println("All avaiable dogs:");
                for (Dog element : DogList) {
					if(element.getStatus() = false){
						System.out.println(element.ViewAll());  
					}
				}
			}	else if (taskInput.equals("4")) {
				System.out.println("Please enter dog ID:");
                    newDogId = keyboard.nextInt();
				if(DogIdList.contains(newDogId){
					for( Dog element : DogList){
						if (element.getId == newDogId){
							System.out.println(element.ViewAll());
						}
					}
				}else{
					System.out.println("There is no dog with that id.");
				}
				
			}	else if (taskInput.equals("5")) {
				System.out.println("Please enter dog ID:");
                    newDogId = keyboard.nextInt();
				if(DogIdList.contains(newDogId){
					for( int i = 0; i < DogList.size(); i++){
						if (DogList[i].getId == newDogId){
							DogList[i].Update();
							System.out.println("Dog home status updated");
							System.out.println(DogList[i].ViewAll());
						}
					}
				}else{
					System.out.println("There is no dog with that id.");
				}
				
			}	else{
				System.out.println("Please choose a task as list above:");
				taskInput = keyboard.nextLine();
			}				
        } while (!taskInput.equals("5"));      
        
        /*Dog dog1 = new Dog(1241, "alex", 14.00, 'F');
        System.out.println(dog1.foundHome);*/
    }  
}
