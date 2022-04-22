package by.tc.task01.service.repository;

import by.tc.task01.entity.*;
import by.tc.task01.service.ServiceFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RepositoryInitService {

    public static void init() {
        try (Scanner scanner = new Scanner(new FileReader("/Users/danielaverman/Documents/Java/Epam/Code/Tasks/jwd-task01-template_v2/src/main/resources/appliances_db.txt"))) {
            while (scanner.hasNextLine()) {
                String[] objectInfo = scanner.nextLine().split(" : ");
                if (objectInfo.length < 2) {
                    continue;
                }
                add(objectInfo[0], objectInfo[1]);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    private static void add(String name, String value) {
        switch (name) {
            case Appliance.APPLIANCE_LAPTOP_STR -> {
                String[] paramValue = value.split(", ");
                Laptop laptop = new Laptop(
                    Double.parseDouble(paramValue[0].split("=")[1]),
                    paramValue[1].split("=")[1],
                    Integer.parseInt(paramValue[2].split("=")[1]),
                    Integer.parseInt(paramValue[3].split("=")[1]),
                    Double.parseDouble(paramValue[4].split("=")[1]),
                    Double.parseDouble(paramValue[5].split("=")[1])
                );
                ServiceFactory.getInstance().getRepository().getLaptops().add(laptop);
            }
            case Appliance.APPLIANCE_OVEN_STR -> {
                String[] paramValue = value.split(", ");
                Oven oven = new Oven(
                    Integer.parseInt(paramValue[0].split("=")[1]),
                    Integer.parseInt(paramValue[1].split("=")[1]),
                    Integer.parseInt(paramValue[2].split("=")[1]),
                    Integer.parseInt(paramValue[3].split("=")[1]),
                    Double.parseDouble(paramValue[4].split("=")[1]),
                    Double.parseDouble(paramValue[5].split("=")[1])
                );
                ServiceFactory.getInstance().getRepository().getOvens().add(oven);
            }
            case Appliance.APPLIANCE_REFRIGERATOR_STR -> {
                String[] paramValue = value.split(", ");
                Refrigerator refrigerator = new Refrigerator(
                    Integer.parseInt(paramValue[0].split("=")[1]),
                    Integer.parseInt(paramValue[1].split("=")[1]),
                    Integer.parseInt(paramValue[2].split("=")[1]),
                    Double.parseDouble(paramValue[3].split("=")[1]),
                    Integer.parseInt(paramValue[4].split("=")[1]),
                    Integer.parseInt(paramValue[5].split("=")[1])
                );
                ServiceFactory.getInstance().getRepository().getRefrigerators().add(refrigerator);
            }
            case Appliance.APPLIANCE_SPEAKERS_STR -> {
                String[] paramValue = value.split(", ");
                Speakers speakers = new Speakers(
                    Integer.parseInt(paramValue[0].split("=")[1]),
                    Integer.parseInt(paramValue[1].split("=")[1]),
                    paramValue[2].split("=")[1],
                    Integer.parseInt(paramValue[3].split("=")[1])
                );
                ServiceFactory.getInstance().getRepository().getSpeakers().add(speakers);
            }
            case Appliance.APPLIANCE_TABLET_PC_STR -> {
                String[] paramValue = value.split(", ");
                TabletPC tabletPC = new TabletPC(
                        Integer.parseInt(paramValue[0].split("=")[1]),
                        Double.parseDouble(paramValue[1].split("=")[1]),
                        Integer.parseInt(paramValue[2].split("=")[1]),
                        Integer.parseInt(paramValue[3].split("=")[1]),
                        paramValue[4].split("=")[1]
                );
                ServiceFactory.getInstance().getRepository().getTabletPCS().add(tabletPC);
            }
            case Appliance.APPLIANCE_VACUUM_CLEANER_STR -> {
                String[] paramValue = value.split(", ");
                VacuumCleaner vacuumCleaner = new VacuumCleaner(
                        Integer.parseInt(paramValue[0].split("=")[1]),
                        paramValue[1].split("=")[1],
                        paramValue[2].split("=")[1],
                        paramValue[3].split("=")[1],
                        Integer.parseInt(paramValue[4].split("=")[1]),
                        Integer.parseInt(paramValue[5].split("=")[1])
                );
                ServiceFactory.getInstance().getRepository().getVacuumCleaners().add(vacuumCleaner);
            }
        }
    }
}
