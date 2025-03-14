public class CoastalCity extends CityInAustralia {
    
    private int dist;
    private String beaches[];

    public CoastalCity(String n, int p, String h[], int d, String b[]){
        super(n, p, h);
        dist = d;
        beaches = b;
    }

    public String toString(){
        String beachList = "";
        for(int i = 0; i < beaches.length; i++){
            beachList = beachList + beaches[i] + ", ";
        }
        return super.toString() + "\nIt is a coastal city, " + dist + " km away from the water. It has the following beaches:\n" + beachList;
    }
}