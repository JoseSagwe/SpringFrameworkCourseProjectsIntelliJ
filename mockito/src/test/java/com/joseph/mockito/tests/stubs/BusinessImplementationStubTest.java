package com.joseph.mockito.tests.stubs;

import com.joseph.mockito.tests.business.BusinessImplementation;
import com.joseph.mockito.tests.business.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BusinessImplementationStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataServiceStub DataServiceStub =new DataServiceStub();
        BusinessImplementation business = new BusinessImplementation(DataServiceStub);
        int result = business.findTheGreatestFromAllData();
        assertEquals(56, result);
    }

}


//Creating a stub
class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {12, 27, 56};
    }
}
