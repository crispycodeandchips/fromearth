package com.keyrhyme.fromearth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDetailDto {

    private String productId;
    private String productName;
    private String thumbnail;
    private int price;

}
