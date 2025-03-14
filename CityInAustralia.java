class CityInAustralia {
	
    private String name;
    private int pop;
    private String hosp[];

    public CityInAustralia(String n, int p, String h[]){
        name = n;
        pop = p;
        hosp = h;
    }

    public String toString(){
        String hospList = "";
        for(int i = 0; i < hosp.length; i++){
            hospList += hosp[i] + ", ";
        }
        return ("\n\n" + name + " has " + pop + " people. It has the following hospitals:\n" +  hospList);
    }
    

}