package com.tcsemp.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Role {

    @MongoId
    private String id;

    private String name;
}
