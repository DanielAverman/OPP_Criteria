package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.repository.Repository;
import by.tc.task01.service.ServiceFactory;

import java.util.Map;
import java.util.Optional;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public Appliance find(Criteria criteria) {
		Repository repository = ServiceFactory.getInstance().getRepository();
		Appliance appliance = new Appliance();
		switch (criteria.getGroupSearchName()) {
			case Appliance.APPLIANCE_OVEN_STR -> {
				Optional<Oven> responseOven = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.Oven.CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getCapacity() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Oven.DEPTH.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getDepth() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Oven.HEIGHT.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getHeight() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getPowerConsumption() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Oven.WEIGHT.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getWeight() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Oven.WIDTH.toString())) {
						if (entry.getValue() != null) {
							responseOven = repository.getOvens().stream().filter(o -> o.getWidth() == (double)entry.getValue()).findAny();
						}
					}
				}
				if (responseOven.isPresent()) {
					appliance = responseOven.get();
				}
			}
			case Appliance.APPLIANCE_LAPTOP_STR-> {
				Optional<Laptop> responseLaptop = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getBatteryCapacity() == (double)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Laptop.CPU.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getCpu() == (double)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Laptop.OS.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getOs().equals(entry.getValue().toString())).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Laptop.DISPLAY_INCHES.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getDisplayInches() == (double)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getDisplayInches() == (double)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
						if (entry.getValue() != null) {
							responseLaptop = repository.getLaptops().stream().filter(o -> o.getSystemMemory() == (int)entry.getValue()).findAny();
						}
					}
				}
				if (responseLaptop.isPresent()) {
					appliance = responseLaptop.get();
				}
			}
			case Appliance.APPLIANCE_SPEAKERS_STR-> {
				Optional<Speakers> responseSpeakers = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
						if (entry.getValue() != null) {
							responseSpeakers = repository.getSpeakers().stream().filter(o -> o.getNumberOfSpeaker() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
						if (entry.getValue() != null) {
							responseSpeakers = repository.getSpeakers().stream().filter(o -> o.getCordLength() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
						if (entry.getValue() != null) {
							responseSpeakers = repository.getSpeakers().stream().filter(o -> o.getPowerConsumption() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
						if (entry.getValue() != null) {
							responseSpeakers = repository.getSpeakers().stream().filter(o -> o.getFrequencyRange().equals(entry.getValue().toString())).findAny();
						}
					}
				}
				if (responseSpeakers.isPresent()) {
					appliance = responseSpeakers.get();
				}
			}
			case Appliance.APPLIANCE_REFRIGERATOR_STR-> {
				Optional<Refrigerator> responseRefrigerator = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getFreezerCapacity() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getPowerConsumption() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getWeight() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getHeight() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getOverallCapacity() == (double)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
						if (entry.getValue() != null) {
							responseRefrigerator = repository.getRefrigerators().stream().filter(o -> o.getWidth() == (int)entry.getValue()).findAny();
						}
					}
				}
				if (responseRefrigerator.isPresent()) {
					appliance = responseRefrigerator.get();
				}
			}
			case Appliance.APPLIANCE_TABLET_PC_STR-> {
				Optional<TabletPC> responseTabletPC = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.TabletPC.COLOR.toString())) {
						if (entry.getValue() != null) {
							responseTabletPC = repository.getTabletPCS().stream().filter(o -> o.getColor().equals(entry.getValue().toString())).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseTabletPC = repository.getTabletPCS().stream().filter(o -> o.getBatteryCapacity() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
						if (entry.getValue() != null) {
							responseTabletPC = repository.getTabletPCS().stream().filter(o -> o.getDisplayInches() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
						if (entry.getValue() != null) {
							responseTabletPC = repository.getTabletPCS().stream().filter(o -> o.getFlashMemoryCapacity() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
						if (entry.getValue() != null) {
							responseTabletPC = repository.getTabletPCS().stream().filter(o -> o.getMemoryROM() == (int)entry.getValue()).findAny();
						}
					}
				}
				if (responseTabletPC.isPresent()) {
					appliance = responseTabletPC.get();
				}
			}
			case Appliance.APPLIANCE_VACUUM_CLEANER_STR-> {
				Optional<VacuumCleaner> responseVacuumCleaner = Optional.empty();
				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getBagType().equals(entry.getValue().toString())).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getCleaningWidth() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getPowerConsumption() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getFilterType().equals(entry.getValue().toString())).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getMotorSpeedRegulation() == (int)entry.getValue()).findAny();
						}
					}
					if (entry.getKey().equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
						if (entry.getValue() != null) {
							responseVacuumCleaner = repository.getVacuumCleaners().stream().filter(o -> o.getWandType().equals(entry.getValue().toString())).findAny();
						}
					}
				}
				if (responseVacuumCleaner.isPresent()) {
					appliance = responseVacuumCleaner.get();
				}
			}
		}
		return appliance;
	}

}
