package problem2;

/**
 * A class representing an address */
public class Address {
  private String address;

  /**
   * Constructs a new address for our gift card holder
   * @param address - an address represented as a String
   */
  public Address(String address) {
    this.address = address;
  }

  /**
   * Returns the gift card holders address
   * @return - the gift card holders address, represented as a String
   */
  public String getAddress() {
    return this.address;
  }

}
