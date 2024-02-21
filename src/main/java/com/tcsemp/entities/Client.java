package com.tcsemp.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Client {

    @MongoId
    private String id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private boolean current;
}
