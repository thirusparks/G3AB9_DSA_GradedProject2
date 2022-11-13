package com.greatlearning.floorspace;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FloorSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int noFloors = sc.nextInt();

		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int floorSize[] = new int[noFloors];

		for (int i = 0; i < noFloors; i++) {

			System.out.println("enter the floor size given on day :  " + (i + 1) );
			floorSize[i] = sc.nextInt();
		}

		int maxFloors = noFloors;

		System.out.println();
		System.out.println("The order of construction is as follows");
		System.out.println();

		for (int i = 0; i < noFloors; i++) {

			int val[] = new int[noFloors];
			String buffer = " ";
			queue.add(floorSize[i]);

			while (!queue.isEmpty() && queue.peek() == maxFloors) {

				buffer += queue.remove() + " ";

				maxFloors--;

			}

			System.out.println("Day : " + (i + 1));
			System.out.println(buffer);
		}
	}
}

