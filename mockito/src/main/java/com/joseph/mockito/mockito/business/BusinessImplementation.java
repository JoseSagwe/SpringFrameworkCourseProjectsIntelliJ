package com.joseph.mockito.mockito.business;

public class BusinessImplementation  {
    private DataService dataService;

    public BusinessImplementation(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value:data) {
            if(value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }

}

