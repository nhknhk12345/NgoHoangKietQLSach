package com.example.NgoHoangKietQLSach.Validator;
import com.example.NgoHoangKietQLSach.entity.Category;
import com.example.NgoHoangKietQLSach.Validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}