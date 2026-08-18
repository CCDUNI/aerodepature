package aerodepature.aeroapi;

import org.junit.jupiter.api.Test;

import aerodeparture.aeroapi.AeroClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AeroClientTest {
    
    AeroClient client = new AeroClient();
    
    @Test
    void testGetFlightData() {
        String flightData = client.getFlightData("LHR");
        //assertEquals(200, flightData.size())
        assertEquals(true, flightData.contains("flights"));
    }
}
