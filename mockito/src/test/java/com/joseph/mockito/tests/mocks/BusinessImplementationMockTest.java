package com.joseph.mockito.tests.mocks;

import com.joseph.mockito.tests.business.BusinessImplementation;


import com.joseph.mockito.tests.business.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class BusinessImplementationMockTest {

    @Mock
    private DataService dataServiceMock;


    @InjectMocks
    BusinessImplementation business;


    @Test
    void findTheGreatestFromAllData_basicScenario() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12, 27, 56});
        int result = business.findTheGreatestFromAllData();
        Assertions.assertEquals(56, result);
    }

    @Test
    void findTheGreatestFromAllData_EmptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        int result = business.findTheGreatestFromAllData();
        Assertions.assertEquals(Integer.MIN_VALUE, result);
    }


    @Test
    void findTheGreatestFromAllData_OneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {36});
        BusinessImplementation business = new BusinessImplementation(dataServiceMock);
        Assertions.assertEquals(36, business.findTheGreatestFromAllData());
    }

}


