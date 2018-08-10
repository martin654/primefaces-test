/**
 * 
 */
package org.primefaces.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  (JD42744)
 *
 */
public class Car {

  private String name;

  private Map<String, String> attributesMap = new HashMap<>();

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the attributesMap
   */
  public Map<String, String> getAttributesMap() {
    return attributesMap;
  }

  /**
   * @param attributesMap the attributesMap to set
   */
  public void setAttributesMap(Map<String, String> attributesMap) {
    this.attributesMap = attributesMap;
  }


}
