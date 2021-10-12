package com.keyrhyme.fromearth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailPageResponseDto {

private String productName;
private String productId;
private int price;
private String thumbnail;
private String seller;
private String desc;

}
