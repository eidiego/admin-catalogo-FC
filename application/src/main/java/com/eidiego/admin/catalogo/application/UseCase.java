package com.eidiego.admin.catalogo.application;


import com.eidiego.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category execute() {
        return new Category();
    }

}