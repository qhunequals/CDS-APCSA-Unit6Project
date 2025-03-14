// Hospital Locator Starter       A+CR
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    
    String hospitals1[] = {"Alice Springs Hospital", "Alice Springs Private Hospital", "The Centre for Remote Health"};
    String parks1[] = {"Olive Pink Botanical Garden", "Alive Springs Desert Park", "Simpsons gap"};
    CityInAustralia AliceSprings = new InlandCity("AliceSprings", 33000, hospitals1, 1, parks1);

    String hospitals2[] = {"Bendigo Base Hospital", "St John of God Bendigo Hospital", "Bendigo Private Hospital"};
    String parks2[] = {"Rosalind Park", "Bendigo Regional Park", "Greater Bendigo National Park", "Kangaroo Flat Bushland Reserve", "Huntly Nature Reserve"};
    CityInAustralia Bendigo = new InlandCity("Bendigo", 122647, hospitals2, 1, parks2);

    String hospitals3[] = {"Royal Brisbane and Women's Hospital", "Princess Alexandra Hospital", "The Prince Charles Hospital"};
    String beaches3[] = {"Shorncliffe Beach", "Nudgee Beach", "Suttons Beach"};
    CityInAustralia Brisbane = new CoastalCity("Brisbane", 2280000, hospitals3, 15, beaches3);

    String hospitals4[] = {"Royal Darwin Hospital", "Darwin Private Hospital", "Palmerston Regional Hospital"};
    String beaches4[] = {"Mindil Beach", "Casuarina Beach", "Vesteys Beach"};
    CityInAustralia Darwin = new CoastalCity("Darwin", 147000, hospitals4, 0, beaches4);

    String hospitals5[] = {"The Royal Melbourne Hospital", "St Vincent's Hospital Melbourne", "The Alfred Hospital"};
    String beaches5[] = {"St Kilda Beach", "Brighton Beach", "Williamstown Beach"};
    CityInAustralia Melbourne = new CoastalCity("Melbourne", 5150000, hospitals5, 0, beaches5);

    String hospitals6[] = {"Royal Perth Hospital", "Sir Charles Gairdner Hospital", "Fiona Stanley Hospital"};
    String beaches6[] = {"Cottesloe Beach", "Scarborough Beach", "City Beach"};
    CityInAustralia Perth = new CoastalCity("Perth", 2100000, hospitals6, 0, beaches6);

    String hospitals7[] = {"Rockhampton Hospital", "Hillcrest Private Hospital"};
    String parks7[] = {"Mount Archer National Park", "Rockhampton Botanic Gardens"};
    CityInAustralia Rockhampton = new InlandCity("Rockhampton", 82000, hospitals7, 1, parks7);

    String hospitals8[] = {"Royal Prince Alfred Hospital", "St Vincent's Hospital", "Westmead Hospital", "Sydney Children's Hospital"};
    String beaches8[] = {"Bondi Beach", "Manly Beach", "Coogee Beach", "Bronte Beach", "Cronulla Beach"};
    CityInAustralia Sydney = new CoastalCity("Sydney", 5300000, hospitals8, 5, beaches8);

    String hospitals9[] = {"Toowoomba Hospital", "St. Vincent's Private Hospital Toowoomba", "St. Andrew's Toowoomba Hospital"};
    String parks9[] = {"Queens Park", "Laurel Bank Park", "Picnic Point Parklands"};
    CityInAustralia Toowoomba = new InlandCity("Toowoomba", 128377, hospitals9, 50, parks9);

    String hospitals10[] = {"Wagga Wagga Base Hospital"};
    String parks10[] = {"Webb Park", "Wilga Park", "Willans Hill"};
    CityInAustralia WaggaWagga = new InlandCity("WaggaWagga", 69000, hospitals10, 30, parks10);

    ArrayList<CityInAustralia> cities = new ArrayList<CityInAustralia>();  
    cities.add(AliceSprings);
    cities.add(Bendigo);
    cities.add(Brisbane);
    cities.add(Darwin);
    cities.add(Melbourne);
    cities.add(Perth);
    cities.add(Rockhampton);
    cities.add(Sydney);
    cities.add(Toowoomba);
    cities.add(WaggaWagga);
    System.out.println(cities);
  }
}