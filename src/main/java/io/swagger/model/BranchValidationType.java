package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * optional validation to apply to the branch
 */
public enum BranchValidationType {
  
  CARD("card"),
  
  MANDATORY_REFERENCE("mandatory_reference"),
  
  ACCOUNT_MOD_CHECK("account_mod_check"),
  
  NONE("none");

  private String value;

  BranchValidationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BranchValidationType fromValue(String text) {
    for (BranchValidationType b : BranchValidationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

