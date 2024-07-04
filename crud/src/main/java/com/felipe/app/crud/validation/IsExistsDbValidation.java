package com.felipe.app.crud.validation;

import com.felipe.app.crud.services.ProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb, String> {
    @Autowired
    private ProductService productService;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !productService.existsBySku(value);
    }
}
