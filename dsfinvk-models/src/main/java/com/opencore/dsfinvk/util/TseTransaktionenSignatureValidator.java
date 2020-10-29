package com.opencore.dsfinvk.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.opencore.dsfinvk.models.einzelaufzeichnung.bonkopf.TseTransaktionen;

public class TseTransaktionenSignatureValidator implements ConstraintValidator<ValidTseTransaktionen, TseTransaktionen> {

    @Override
    public boolean isValid(TseTransaktionen value, ConstraintValidatorContext context) {
        if ((value.getTseTaSig() != null) && (! value.getTseTaSig().isBlank()) &&
                (value.getTseTaSigz() != null) && (value.getTseTaSigz() > 0))
            return true; //Signature and counter set

        //If no tse signature exists -> we need an errordescription
        return (value.getTseTaFehler() != null) && (! value.getTseTaFehler().isBlank());
    }

}
