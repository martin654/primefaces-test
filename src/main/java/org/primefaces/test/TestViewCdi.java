package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {

  private String testString;

  private List<String> testList = new ArrayList<>();

  private List<String> testListSelected = new ArrayList<>();

  @PostConstruct
  public void init() {
    testString = "Welcome to PrimeFaces (from CDI!) !!!";

    for (int i = 0; i < 50; i++) {
      getTestList().add("Foooo " + i);
    }
  }

  public void fooAction() {
    System.out.println("FOOO");
  }

  public String getTestString() {
    return testString;
  }

  public void setTestString(String testString) {
    this.testString = testString;
  }

  /**
   * @return the testListSelected
   */
  public List<String> getTestListSelected() {
    return testListSelected;
  }

  /**
   * @param testListSelected the testListSelected to set
   */
  public void setTestListSelected(List<String> testListSelected) {
    this.testListSelected = testListSelected;
  }

  /**
   * @return the testList
   */
  public List<String> getTestList() {
    return testList;
  }

  /**
   * @param testList the testList to set
   */
  public void setTestList(List<String> testList) {
    this.testList = testList;
  }
}
