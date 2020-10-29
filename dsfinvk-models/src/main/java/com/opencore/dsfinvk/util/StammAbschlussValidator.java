package com.opencore.dsfinvk.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.opencore.dsfinvk.models.stammdaten.StammAbschluss;

public class StammAbschlussValidator implements ConstraintValidator<ValidStammAbschluss, StammAbschluss> {

  @Override
  public boolean isValid(StammAbschluss value, ConstraintValidatorContext context) {
    // TODO: The specs say "either ... or" but I've implemented "or". Needs clarification.
    return ValidUtil.isOneValueSet(value.getStnr(), value.getUstid());
  }
}
