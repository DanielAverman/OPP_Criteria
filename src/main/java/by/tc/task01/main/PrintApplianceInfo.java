package by.tc.task01.main;

import by.tc.task01.entity.*;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance instanceof Oven) {
			Oven oven = (Oven) appliance;
			System.out.println(oven);
		}
		if (appliance instanceof Laptop) {
			Laptop laptop = (Laptop) appliance;
			System.out.println(laptop);
		}
		if (appliance instanceof Refrigerator) {
			Refrigerator refrigerator = (Refrigerator) appliance;
			System.out.println(refrigerator);
		}
		if (appliance instanceof Speakers) {
			Speakers speakers = (Speakers) appliance;
			System.out.println(speakers);
		}
		if (appliance instanceof TabletPC) {
			TabletPC tabletPC = (TabletPC) appliance;
			System.out.println(tabletPC);
		}
		if (appliance instanceof VacuumCleaner) {
			VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
			System.out.println(vacuumCleaner);
		}
		if (!appliance.toString().isEmpty()) {
			System.out.println(appliance);
		}
	}

}
