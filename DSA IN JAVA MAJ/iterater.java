import java.util.*;
public class iterater {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();

        cities.add("delhi");
        cities.add("mumbai");
        cities.add("lucknow");
        cities.add("kanpur");
        cities.add("noida");
        cities.add("basti");
        System.out.println(cities);

        LinkedHashSet<String> citiess = new LinkedHashSet<>();
        citiess.add("delhi");
        citiess.add("mumbai");
        citiess.add("lucknow");
        citiess.add("kanpur");
        citiess.add("noida");
        citiess.add("basti");
        System.out.println(citiess);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("lucknow");
        ts.add("kanpur");
        ts.add("noida");
        ts.add("basti");

        System.out.println(ts);

        //Iterator it = cities.iterator();
        //while(it.hasNext()){
            //System.out.println(it.next());
        //}
        //for(String city : cities){
           // System.out.println(city);
        //}

    }
    
}
