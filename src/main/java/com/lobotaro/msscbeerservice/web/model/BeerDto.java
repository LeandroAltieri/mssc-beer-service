package com.lobotaro.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private Long id;
    private int version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String name;
    private BeerTypeEnum type;

    private Long upc;

    private BigDecimal price;
    private int quantityOnHand;
}
