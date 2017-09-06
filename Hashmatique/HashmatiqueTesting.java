/* Test Program for Hashmatique */ 
import java.util.HashMap;

public class HashmatiqueTesting {
    public static void main(String[] args){
        Hashmatique music = new Hashmatique();
        HashMap<String, String> mytrackList = new HashMap<>();

        String lyrics;

        mytrackList = music.musicHash();
        lyrics = mytrackList.get("Heartbeat");

        System.out.println(lyrics);

        for(String song : mytrackList.keySet()){
            System.out.println(song+": "+mytrackList.get(song));
        }
    }
}
