package com.aexp.observability.monitoring.apppromethiusprototype;

import java.util.function.Function;

public class Greeter implements Function<String, String> {

  @Override
  public String apply(String s) {
    return "Hello ,welcome " + s;
  }
}
