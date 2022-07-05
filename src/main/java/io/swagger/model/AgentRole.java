package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Role of the agent in the payment chain. Enum of pre-defined values, new values can be added when needed
 */
public enum AgentRole {
  
  INTERMEDIARYAGENT1("IntermediaryAgent1"),
  
  INTERMEDIARYAGENT2("IntermediaryAgent2"),
  
  INTERMEDIARYAGENT3("IntermediaryAgent3"),
  
  INSTRUCTINGAGENT("InstructingAgent");

  private String value;

  AgentRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AgentRole fromValue(String text) {
    for (AgentRole b : AgentRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

