/* Implementation of a HashMap */ 
import java.util.HashMap;

public class Hashmatique {
    public HashMap<String, String> musicHash(){
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Cheap Thrills", "It's Friday night");
        trackList.put("Heartbeat", "That I am ready to go, heartbeat"); 
        trackList.put("Bella", "Elle repondait au nom de 'Bella'"); 
        trackList.put("Photograph", "Hearts are never broken"); 

        return trackList;
 
    }
}
