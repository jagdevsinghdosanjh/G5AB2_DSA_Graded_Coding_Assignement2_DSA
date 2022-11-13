package com.greatlearning.g5ab2.dsa.gca2.question1.main;

import java.util.ArrayList;
import java.util.Collections;

import com.greatlearning.g5ab2.dsa.gca2.question1.model.FactoryClass;

public class CalculateFloor {
	static FactoryClass popelement1;
	static int prevday = 1;

	static void FloorSize(ArrayList<FactoryClass> arraylist) {
		Collections.sort(arraylist);
		while (!arraylist.isEmpty()) {
			popelement1 = arraylist.remove(0);

			if (popelement1.getDay() < prevday) {
				System.out.print(popelement1.getFloor() + " ");
			} else {
				while (prevday <= popelement1.getDay()) {
					System.out.println("");
					System.out.println("Day: " + prevday);
					prevday++;
				}
				System.out.print(popelement1.getFloor() + " ");
			}
		}
	}
}
