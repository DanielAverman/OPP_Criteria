package by.tc.task01.entity;

public class Appliance {

	public static final String APPLIANCE_OVEN_STR= "Oven";
    public static final String APPLIANCE_LAPTOP_STR= "Laptop";
    public static final String APPLIANCE_REFRIGERATOR_STR= "Refrigerator";
    public static final String APPLIANCE_VACUUM_CLEANER_STR= "VacuumCleaner";
    public static final String APPLIANCE_TABLET_PC_STR= "TabletPC";
    public static final String APPLIANCE_SPEAKERS_STR= "Speakers";

    @Override
    public String toString() {
        return "Appliance{" + this.getClass().getSimpleName() +
                "}";
    }
}
