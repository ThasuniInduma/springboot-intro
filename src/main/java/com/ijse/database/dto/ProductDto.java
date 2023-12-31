package com.ijse.database.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;
    private Double price;
    private Integer qty;
    private Long categoryId;
}
