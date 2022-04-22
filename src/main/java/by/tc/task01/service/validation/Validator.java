package by.tc.task01.service.validation;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Arrays;
import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		String objectFields = "";
		switch (criteria.getGroupSearchName()) {
			case Appliance.APPLIANCE_OVEN_STR -> objectFields = Arrays.toString(SearchCriteria.Oven.values());
			case Appliance.APPLIANCE_LAPTOP_STR -> objectFields = Arrays.toString(SearchCriteria.Laptop.values());
			case Appliance.APPLIANCE_REFRIGERATOR_STR -> objectFields = Arrays.toString(SearchCriteria.Refrigerator.values());
			case Appliance.APPLIANCE_SPEAKERS_STR -> objectFields = Arrays.toString(SearchCriteria.Speakers.values());
			case Appliance.APPLIANCE_TABLET_PC_STR -> objectFields = Arrays.toString(SearchCriteria.TabletPC.values());
			case Appliance.APPLIANCE_VACUUM_CLEANER_STR -> objectFields = Arrays.toString(SearchCriteria.VacuumCleaner.values());
		}

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			if (!objectFields.contains(entry.getKey())) {
				return false;
			}
		}
		
		return true;
	}

}