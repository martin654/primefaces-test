package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

  private String testString;

  private List<Car> cars;

  private List<String> columnKeys;

  @PostConstruct
  public void init() {
    testString = "Welcome to PrimeFaces!!!";
    initCars();
  }

  private void initCars() {
    cars = new ArrayList<>();
    columnKeys = new ArrayList<>();

    for (int j = 0; j < 5; j++) {
      columnKeys.add("ColumnId" + j);
    }

    for (int i = 0; i < 3; i++) {
      Car car = new Car();
      cars.add(car);
      car.setName("Cool car name " + i);

      int j = 0;
      for (String key : columnKeys) {

        car.getAttributesMap().put(key, "");
      }
    }
  }

  public String getTestString() {
    return testString;
  }

  public void setTestString(String testString) {
    this.testString = testString;
  }

  /**
   * @return the cars
   */
  public List<Car> getCars() {
    return cars;
  }

  /**
   * @param cars the cars to set
   */
  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  /**
   * @return the columnKeys
   */
  public List<String> getColumnKeys() {
    return columnKeys;
  }

  /**
   * @param columnKeys the columnKeys to set
   */
  public void setColumnKeys(List<String> columnKeys) {
    this.columnKeys = columnKeys;
  }
}
