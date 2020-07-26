package io.epam.task.TaskOnCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CustomCollectionList {
		public static void main(String[] args) 
		{
			List<Integer> listOfElements = new ArrayList<>(10);
			Scanner sc = new Scanner(System.in);
			System.out.println("\tElements\nadd\nfetch\nremove");
			String input;
			for(int i = 0;; ++i) 
			{
				input = sc.nextLine();
				if(input.equals("exit") == true) break;
				switch(input) 
				{
					case "add" : listOfElements.add(sc.nextInt());sc.nextLine();break;
					case "fetch" : try
									{
										int elementToFetch = listOfElements.get(sc.nextInt());
										System.out.println("Fetched element is :"+elementToFetch);
										sc.nextLine(); 
									}
									catch(Exception e) 
									{
										System.out.println("No such element exists in the list");	
									}	
									break;
					case "remove": try
									{
										int elementToBeRemoved = listOfElements.remove(sc.nextInt());
										System.out.println("The element that has been removed is :"+elementToBeRemoved);
										sc.nextLine(); 
									}
									catch(Exception e)
									{
										System.out.println("There is no such element to remove");
									}	
									break;
					default: System.out.println("Invalid choice of operation");break;
				}
			}
			
			System.out.println("Printing Elements:");
			
			for(int i : listOfElements) System.out.println(i);
			sc.close();
		}
}
