package model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private String name;
    private String description;
    private String price;
}
