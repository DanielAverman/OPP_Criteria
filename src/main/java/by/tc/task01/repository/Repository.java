package by.tc.task01.repository;

import by.tc.task01.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Laptop> laptops = new ArrayList<>();
    private List<Oven> ovens = new ArrayList<>();
    private List<Refrigerator> refrigerators = new ArrayList<>();
    private List<Speakers> speakers = new ArrayList<>();
    private List<TabletPC> tabletPCS = new ArrayList<>();
    private List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

    public Repository() {
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public List<Oven> getOvens() {
        return ovens;
    }

    public void setOvens(List<Oven> ovens) {
        this.ovens = ovens;
    }

    public List<Refrigerator> getRefrigerators() {
        return refrigerators;
    }

    public void setRefrigerators(List<Refrigerator> refrigerators) {
        this.refrigerators = refrigerators;
    }

    public List<Speakers> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speakers> speakers) {
        this.speakers = speakers;
    }

    public List<TabletPC> getTabletPCS() {
        return tabletPCS;
    }

    public void setTabletPCS(List<TabletPC> tabletPCS) {
        this.tabletPCS = tabletPCS;
    }

    public List<VacuumCleaner> getVacuumCleaners() {
        return vacuumCleaners;
    }

    public void setVacuumCleaners(List<VacuumCleaner> vacuumCleaners) {
        this.vacuumCleaners = vacuumCleaners;
    }
}
