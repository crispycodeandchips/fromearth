package com.keyrhyme.fromearth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MainStoreResponseDto {

    private List<ProductDetailDto> products;
}
