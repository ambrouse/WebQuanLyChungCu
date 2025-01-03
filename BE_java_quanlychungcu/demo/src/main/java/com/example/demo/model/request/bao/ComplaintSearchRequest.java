package com.example.demo.model.request.bao;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ComplaintSearchRequest {
    String nameUser_;
    String status_;
}
