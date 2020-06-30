package problem1;

public class SmartThermostat {

  private Integer temperature;
  private Integer minHouseTemp = 60;
  private Integer maxHouseTemp = 75;
  private Integer minBedroomTemp = 60;
  private Integer maxBedroomTemp = 68;
  private Integer minBathroomTemp = 58;
  private Integer maxBathroomTemp = 70;
  private Integer minLivingroomTemp = 60;
  private Integer maxLivingroomTemp = 72;
  private Bedroom bedroom;
  private Bathroom bathroom;
  private LivingRoom livingRoom;


  /**
   * Constructs a SmartThermostat object and sets the temperature
   *
   * @param temperature - the current temperature, represented as an Integer
   */
  public SmartThermostat(Integer temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets and checks that temperature falls within range of bedroom set range. If temperature is
   * less than 60 degrees, sets temperature to 60 If temperature is greater than 68 degrees, sets
   * temperature to 68 If temperature is between 60 and 68 degrees, sets temperature to what was
   * passed in
   *
   * @param temperature - the current temperature of the bedroom, represented as an Integer
   * @return - returns a bedroom object
   */
  public Bedroom setBedroomTemp(Integer temperature) {
    Bedroom bedroom = new Bedroom(checkBedroomTemperature(temperature));
    return bedroom;
  }

  /**
   * Sets and checks that temperature falls within range of bathroom set range. If temperature is
   * less than 58 degrees, sets temperature to 58 If temperature is greater than 70 degrees, sets
   * temperature to 70 If temperature is between 58 and 70 degrees, sets temperature to what was
   * passed in
   *
   * @param temperature - the current temperature of the bedroom, represented as an Integer
   * @return - returns a bathroom object
   */
  public Bathroom setBathroomTemp(Integer temperature) {
    Bathroom bathroom = new Bathroom(checkBathroomTemperature(temperature));
    return bathroom;
  }

  /**
   * Sets and checks that temperature falls within range of bedroom set range. If temperature is
   * less than 60 degrees, sets temperature to 60 If temperature is greater than 72 degrees, sets
   * temperature to 72 If temperature is between 60 and 72 degrees, sets temperature to what was
   * passed in
   *
   * @param temperature - the current temperature of the bedroom, represented as an Integer
   * @return - returns a livingRoom object
   */
  public LivingRoom setLivingroomTemp(Integer temperature) {
    LivingRoom livingRoom = new LivingRoom(checkLivingroomTemperature(temperature));
    return livingRoom;
  }

  /**
   * Sets and instantiates 3 new house objects. Sets the entire house to one specific temp. Checks
   * temperature entered then creates a new object with that set temperature,
   *
   * @param temperature - temperature at which all rooms are set, represented as an Integer
   */
  public void setHouseTemp(Integer temperature) {
    bedroom = new Bedroom(checkTemperature(temperature));
    bathroom = new Bathroom(checkTemperature(temperature));
    livingRoom = new LivingRoom(checkTemperature(temperature));
  }

  /**
   * Checks if temperature entered falls within the temperature range and adjusts accordingly. If
   * the user enters a temperature that is too hot, it will adjust the temp to the max setting. If
   * the user enters a temperature that is too cold, it will adjust the temp to the min setting.
   * Otherwise, if the temperature falls between the minimum and maximum it will return the
   * temperature first entered.
   *
   * @param temperature - temperature to see the entire house too, represented as an Integer
   * @return - Specific temperature
   */
  private Integer checkTemperature(Integer temperature) {
    if (temperature >= minHouseTemp && temperature <= maxHouseTemp) {
      return temperature;
    } else if (temperature < minHouseTemp) {
      return minHouseTemp;
    } else {
      return maxHouseTemp;
    }
  }

  /**
   * Checks if temperature entered falls within the temperature range and adjusts accordingly. If
   * the user enters a temperature that is too hot, it will adjust the temp to the max setting. If
   * the user enters a temperature that is too cold, it will adjust the temp to the min setting.
   * Otherwise, if the temperature falls between the minimum and maximum it will return the
   * temperature first entered.
   *
   * @param temperature - temperature to see the entire house too, represented as an Integer
   * @return - Specific temperature
   */
  private Integer checkBedroomTemperature(Integer temperature) {
    if (temperature >= minBedroomTemp && temperature <= maxBedroomTemp) {
      return temperature;
    } else if (temperature < minBedroomTemp) {
      return minBedroomTemp;
    } else {
      return maxBedroomTemp;
    }
  }

  /**
   * Checks if temperature entered falls within the temperature range and adjusts accordingly. If
   * the user enters a temperature that is too hot, it will adjust the temp to the max setting. If
   * the user enters a temperature that is too cold, it will adjust the temp to the min setting.
   * Otherwise, if the temperature falls between the minimum and maximum it will return the
   * temperature first entered.
   *
   * @param temperature - temperature to see the entire house too, represented as an Integer
   * @return - Specific temperature
   */
  private Integer checkBathroomTemperature(Integer temperature) {
    if (temperature >= minBathroomTemp && temperature <= maxBathroomTemp) {
      return temperature;
    } else if (temperature < minBathroomTemp) {
      return minBathroomTemp;
    } else {
      return maxBathroomTemp;
    }
  }

  /**
   * Checks if temperature entered falls within the temperature range and adjusts accordingly. If
   * the user enters a temperature that is too hot, it will adjust the temp to the max setting. If
   * the user enters a temperature that is too cold, it will adjust the temp to the min setting.
   * Otherwise, if the temperature falls between the minimum and maximum it will return the
   * temperature first entered.
   *
   * @param temperature - temperature to see the entire house too, represented as an Integer
   * @return - Specific temperature
   */
  private Integer checkLivingroomTemperature(Integer temperature) {
    if (temperature >= minLivingroomTemp && temperature <= maxLivingroomTemp) {
      return temperature;
    } else if (temperature < minLivingroomTemp) {
      return minLivingroomTemp;
    } else {
      return maxLivingroomTemp;
    }
  }

  /**
   * Returns current bedroom temperature
   *
   * @return - current bedroom temperature, represented as an Integer
   */
  public Integer getBedroomTemp() {
    return bedroom.getTemperature();
  }

  /**
   * Returns current bathroom temperature
   *
   * @return - current bathroom temperature, represented as an Integer
   */
  public Integer getBathroomTemp() {
    return bathroom.getTemperature();
  }

  /**
   * Returns current livingRoom temperature
   *
   * @return - current livingRoom temperature, represented as an Integer
   */
  public Integer getLivingroomTemp() {
    return livingRoom.getTemperature();
  }

}
