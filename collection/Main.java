import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main{

    public static void main(){

        esercizio3();
    }

    public static void esercizio1(){

        double[] temperature = {12.5, 15.0, 9.8, 18.2, 14.0, 11.3, 16.7};

        Map<Integer, String> giorni = new HashMap<>();

        giorni.put(0, "Lunedì");
        giorni.put(1, "Martedì");
        giorni.put(2, "Mercoledì");
        giorni.put(3, "Giovedì");
        giorni.put(4, "Venerdì");
        giorni.put(5, "Sabato");
        giorni.put(6, "Domenica");

        int argmax = 0;
        for(int i = 0; i < temperature.length; ++i){

            if(temperature[i] > temperature[argmax]) argmax = i;
        }

        System.out.println(giorni.get(argmax));
    }

    public static void esercizio2(){

        List<String> playlist = new ArrayList<>();

        playlist.add("Intro");
        playlist.add("Groove");
        playlist.add("Ballad");
        playlist.add("Finale");

        System.out.println(playlist);
        System.out.println("---------------------------------------");

        playlist.remove(2);

        System.out.println(playlist);
        System.out.println("---------------------------------------");

        playlist.addFirst("Sorpresa");

        System.out.println(playlist);
        System.out.println("---------------------------------------");

        System.out.println(playlist);
        System.out.println(playlist.size() + " ------------------------------------");
    }

    public static void esercizio3(){

        Map<String, Integer> ordineAlfa = new TreeMap<>();          //TreeMap per memorizzare in ordine alfabetico
        Map<String, Integer> ordineArrivo = new LinkedHashMap<>();  //LinkedHaskMap per memorizzare in ordine di arrivo

        ordineAlfa.put("FilmZ", 45);
        ordineArrivo.put("FilmZ", 45);

        ordineAlfa.put("FilmD", 9045);
        ordineArrivo.put("FilmD", 9045);

        ordineAlfa.put("FilmA", 4455);
        ordineArrivo.put("FilmA", 4455);

        ordineAlfa.put("FilmO", 67);
        ordineArrivo.put("FilmO", 67);

        System.out.println("Ordine di arrivo: " + ordineArrivo + "\n");
        System.out.println("Ordine alfabetico: " + ordineAlfa + "\n");
    }
}