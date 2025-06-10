package oops;

import java.util.Date;

public class EncapsulationClass {
  private String email;
  private String username;
  private long mobile;
  private Date age;
  private char gender;
  private boolean graduate;
  //setter
  public void setEmail(String email) {
	  this.email = email;
	  
  }
  public void setUsername(String username) {
	  this.username = username;
  }
  public void setMobile(long mobile) {
	  this.mobile = mobile;
  }
  public void setAge(Date age) {
	  this.age = age;
  }
  public void setGender(char gender) {
	  this.gender = gender;
  }
  public void setGraduate(boolean graduate) {
	  this.graduate = graduate;
  }
  //getter
  public String getEmail() {
	  return email;
  }
	public String getUsername() {
		return username;
	}
	public Long getMobile() {
		return mobile;
	}
	public Date getAge() {
		return age;
	}
	public char getaGender() {
		return gender;
	}
	public boolean getGraduate() {
		return graduate;
	}
  }

