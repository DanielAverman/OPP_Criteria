package by.tc.task01.entity;

public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeaker;
    private String frequencyRange;
    private int cordLength;

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeaker=" + numberOfSpeaker +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberOfSpeaker, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeaker = numberOfSpeaker;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeaker() {
        return numberOfSpeaker;
    }

    public void setNumberOfSpeaker(int numberOfSpeaker) {
        this.numberOfSpeaker = numberOfSpeaker;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}


