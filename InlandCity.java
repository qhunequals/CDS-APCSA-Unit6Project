public class InlandCity extends CityInAustralia{
    
    private int dist;
    private String parks[];

    public InlandCity(String n, int p, String h[], int d, String b[]){
        super(n, p, h);
        dist = d;
        parks = b;
    }

    public String toString(){
        String parkList = "";
        for(int i = 0; i < parks.length; i++){
            parkList = parkList + parks[i] + ", ";
        }
        return super.toString() + "\nIt is an inland city, " + dist + " km away from the nearest national park. It has the following parks:\n" + parkList;
    }
}