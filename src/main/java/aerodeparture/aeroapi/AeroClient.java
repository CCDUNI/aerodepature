package aerodeparture.aeroapi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AeroClient{

    static private final String BASE_URL = "https://aeroapi.flightaware.com/aeroapi"; 
    static String API_KEY = System.getenv("AEROAPI_KEY");

    private String current_airport = "LHR";

    private final HttpClient client;

    public AeroClient(){
        client = HttpClient.newHttpClient();   
    }

    public String getFlightData(String airport){

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(BASE_URL + "/airports/" + airport + "/flights"))
        .header("x-apikey", API_KEY)
        .GET()
        .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }

    }
}