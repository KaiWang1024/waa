package edu.mum.formatter;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    @Autowired
    private CategoryService categoryService;

    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        System.out.println("parse category id:" + s);
        Category category = null;
        try {
            category = categoryService.getCategory(Integer.valueOf(s));
        } catch (Exception e) {
            System.out.println("Bad Category ID");
        }
        System.out.println("formatt category id: " + category.getId() + " name: " + category.getName());
        return category;
    }

    @Override
    public String print(Category category, Locale locale) {
        return category.getName();
    }
}
