package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TransactionGroupCode
 */
public enum TransactionGroupCode {
  
  DR("DR"),
  
  CR("CR"),
  
  CU("CU"),
  
  BS("BS"),
  
  DV("DV"),
  
  AU("AU");

  private String value;

  TransactionGroupCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionGroupCode fromValue(String text) {
    for (TransactionGroupCode b : TransactionGroupCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

