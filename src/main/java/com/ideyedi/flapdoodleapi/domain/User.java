package com.ideyedi.flapdoodleapi.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "user")
public class User {
    String name;
    String email;
}
