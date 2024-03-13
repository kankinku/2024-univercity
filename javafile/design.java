package javafile;
public class OnlineShoppingUser {
  private String userId;
  private String password;
  private String fullName;
  private String phoneNumber;
  private String address;

  // Getters and setters
  public String getUserId() {
      return userId;
  }
  
  public void setUserId(String userId) {
      this.userId = userId;
  }

  public String getPassword() {
      return password;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public String getFullName() {
      return fullName;
  }

  public void setFullName(String fullName) {
      this.fullName = fullName;
  }

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }
}