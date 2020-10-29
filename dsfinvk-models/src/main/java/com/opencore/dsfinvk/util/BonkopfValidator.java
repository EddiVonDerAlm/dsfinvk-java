package com.opencore.dsfinvk.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.opencore.dsfinvk.models.einzelaufzeichnung.bonkopf.Bonkopf;

public class BonkopfValidator implements ConstraintValidator<ValidBonkopf, Bonkopf> {

    @Override
    public boolean isValid(Bonkopf value, ConstraintValidatorContext context) {
        return ValidUtil.isOneValueSet(value.getBedienerId(), value.getBedienerName());
    }



}
