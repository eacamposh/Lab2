package Lab2;

public class Canada {

  private Province[] provinces = new Province[10];

  /**
   * Default constructor which simply creates an array of ten Province objects, to match Canada’s
   * provinces.
   */
  public Canada() {
    provinces[0] = new Province("Alberta", "Edmonton", 4262635);
    provinces[1] = new Province("British Columbia", "Victoria", 5000879);
    provinces[2] = new Province("Manitoba", "Winnipeg", 1342153);
    provinces[3] = new Province("New Brunswick", "Fredericton", 775610);
    provinces[4] = new Province("Newfoundland and Labrador", "St. John's", 510550);
    provinces[5] = new Province("Nova Scotia", "Halifax", 969383);
    provinces[6] = new Province("Ontario", "Toronto", 14223942);
    provinces[7] = new Province("Prince Edward Island", "Charlottetown", 154331);
    provinces[8] = new Province("Quebec", "Quebec City", 8501833);
    provinces[9] = new Province("Saskatchewan", "Regina", 1132505);

  }

  /**
   *
   */
  public void displayAllProvinces() {
    for (Province prov : provinces) {
      System.out.println(prov.getDetails() + "\n");
    }
  }

  /**
   * @param min
   * @param max
   * @return int
   */
  public int getNumOfProvincesBetween(int min, int max) {
    int aux = 0;
    for (Province prov : provinces) {
      long population = prov.getPopulation() / 1000000;
      if (population >= min  & population <= max  ) {
        aux++;
      }
    }

    return aux;
  }
}
