package Lab2;

/**
 * private String name; // e.g. “British Columbia” private String capital;  // e.g. “Victoria”
 * private long population; // e.g. 2264823
 */
public class Province {

  public static final String DEFAULT_CAPITAL = "Victoria";
  public static final String DEFAULT_PROVINCE = "British Columbia";
  public static final long DEFAULT_POPULATION = 4648055;
  public static final String[] DEFAULT_NAME_PROVINCE = {"Alberta", "British Columbia", "Manitoba",
      "New Brunswick", "Newfoundland and Labrador", "Nova Scotia", "Ontario",
      "Prince Edward Island", "Quebec", "Saskatchewan"};
  public static final String[] DEFAULT_NAME_CAPITAL = {"Edmonton", "Victoria", "Winnipeg",
      "Fredericton", "St. John's", "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};

  private String name;
  private String capital;
  private long population;

  /**
   * Constructor takes all three parameters and assigns them if they follow the rules: name: Must be
   * one of the 10 Canadian Provinces capital: Must be the name of the capital city population: Must
   * be between 30,000 and 15,000,000
   *
   * @param name       province of province
   * @param capital    capital of province
   * @param population population of province
   */
  public Province(String name, String capital, long population) {
    if (isValidPopulation(population) && (isValidProvince(name))
        && (isValidCapitalCity(capital))) {
      this.name = name;
      this.capital = capital;
      this.population = population;
    } else {
      // if there is any error; create the default data, shown below
      this.population = DEFAULT_POPULATION; // 4,648,055
      this.name = DEFAULT_PROVINCE; // “British Columbia”
      this.capital = DEFAULT_CAPITAL; // “Victoria”
    }
  }

  /**
   * Constructor (default) that takes no parameters and simply sets the data to British Columbia,
   * Victoria, 4648055.
   */
  public Province() {
    this.name = "British Columbia";
    this.capital = "Victoria";
    this.population = 4648055;
  }

  /**
   * @param name
   * @return true
   */
  private boolean isValidProvince(String name) {
    for (int i = 0; i < DEFAULT_NAME_PROVINCE.length; i++) {
      if (DEFAULT_NAME_PROVINCE[i].equals(name)) {
        return true;
      }
    }
    return false;
  }

  /**
   * @param capital
   * @return true
   */
  private boolean isValidCapitalCity(String capital) {

    for (int i = 0; i < DEFAULT_NAME_CAPITAL.length; i++) {
      if (DEFAULT_NAME_CAPITAL[i].equals(capital)) {
        return true;
      }
    }
    return false;
  }

  /**
   * @param population
   * @return true
   */
  public Boolean isValidPopulation(long population) {
    return population >= 15000 & population <= 15000000;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  /**
   * Method called public String getDetails() which returns a String in the format: The capital of
   * British Columbia (population. 4648055) is Victoria.
   *
   * @return String
   */
  public String getDetails() {
    return "The capital " + getName() + " (Population. " + getPopulation() + ") " + "is "
        + getCapital();
  }
}
