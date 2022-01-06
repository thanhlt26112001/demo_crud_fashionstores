package rikkeisoft.com.demo.dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDTO {
    private int id;
    private String name;
    private long number_of_products;
    private double avg_price;
}
