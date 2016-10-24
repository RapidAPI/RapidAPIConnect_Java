package com.rapidapi.core.utils;

import java.util.HashMap;
import java.util.Map;

public class Argument {

  private String type;
  private String value;

  public Argument(String type, String value) {
    this.type = type;
    this.value = value;
  }

  public final String getType(){
    return type;
  }

  public final String getValue(){
    return value;
  }

}