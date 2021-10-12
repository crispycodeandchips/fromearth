package com.keyrhyme.fromearth.controller;

import com.keyrhyme.fromearth.dto.ProductDetailDto;
import com.keyrhyme.fromearth.mapper.ProductOrderMapper;
import com.keyrhyme.fromearth.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/store")
public class StoreController {
    private final ProductOrderMapper productOrderMapper;


    @GetMapping()
    public ResponseEntity<ProductDetailDto> getAllProducts() {

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/test")
    public ResponseEntity<Order> getOrder(){
        return new ResponseEntity<Order>( productOrderMapper.selectOrderById(), HttpStatus.OK);
    }

}
