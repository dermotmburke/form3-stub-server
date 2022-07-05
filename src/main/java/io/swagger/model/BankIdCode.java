package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of identification provided at `bank_id` attribute. Must be ISO code as listed in the [External Code Sets spreadsheet](https://www.iso20022.org/external_code_list.page)
 */
public enum BankIdCode {
  
  SWBIC("SWBIC"),
  
  GBDSC("GBDSC"),
  
  BE("BE"),
  
  FR("FR"),
  
  DEBLZ("DEBLZ"),
  
  GRBIC("GRBIC"),
  
  ITNCC("ITNCC"),
  
  PLKNR("PLKNR"),
  
  PTNCC("PTNCC"),
  
  ESNCC("ESNCC"),
  
  CHBCC("CHBCC");

  private String value;

  BankIdCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BankIdCode fromValue(String text) {
    for (BankIdCode b : BankIdCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

