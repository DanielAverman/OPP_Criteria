package by.tc.task01.service;

import by.tc.task01.repository.Repository;
import by.tc.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	private final Repository repository = new Repository();
	
	private ServiceFactory() {}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

	public Repository getRepository() {
		return repository;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
