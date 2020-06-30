package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SmartThermostatTest {

  private SmartThermostat smartTM;
  private SmartThermostat smartTM2;
  private SmartThermostat smartTM3;
  private Bedroom bedroom;

  @Before
  public void setUp() throws Exception {
    bedroom = new Bedroom(63);
    smartTM = new SmartThermostat(60);
    smartTM2 = new SmartThermostat(65);
    smartTM3 = new SmartThermostat(75);

  }

  @Test
  public void setBedroomTemp() {
    Bedroom newBedroom = smartTM.setBedroomTemp(63);
    assertEquals(newBedroom.getTemperature(), Integer.valueOf(63));

    Bedroom newBedroom2 = smartTM.setBedroomTemp(1);
    assertEquals(newBedroom2.getTemperature(), Integer.valueOf(60));
  }

  @Test
  public void setBathroomTemp() {
    Bathroom newBathroom = smartTM.setBathroomTemp(75);
    assertEquals(newBathroom.getTemperature(), Integer.valueOf(70));

    Bathroom newBathroom2 = smartTM.setBathroomTemp(10);
    assertEquals(newBathroom2.getTemperature(), Integer.valueOf(58));
  }

  @Test
  public void setLivingroomTemp() {
    LivingRoom newLivingroom = smartTM.setLivingroomTemp(72);
    assertEquals(newLivingroom.getTemperature(), Integer.valueOf(72));

    LivingRoom newLivingroom2 = smartTM.setLivingroomTemp(5);
    assertEquals(newLivingroom2.getTemperature(), Integer.valueOf(60));
  }

  @Test
  public void setHouseTemp() {
    smartTM.setHouseTemp(65);
    assertEquals(smartTM.getBedroomTemp(), Integer.valueOf(65));

    smartTM2.setHouseTemp(100);
    assertEquals(smartTM2.getLivingroomTemp(), Integer.valueOf(75));

    smartTM3.setHouseTemp(1);
    assertEquals(smartTM3.getBathroomTemp(), Integer.valueOf(60));
  }
}