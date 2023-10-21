package com.thomasjayconsulting.sblovin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceItem {
    private String productNumber;
    private String productName;
    private Double price;

}
