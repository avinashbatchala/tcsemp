package com.tcsemp.entities;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private boolean isCurrent;

}
