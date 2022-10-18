package org.example.model;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderV1 {

    private String customerName;
    private String product;
    private int quality;

}
