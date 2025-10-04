package ie.atu.week3cicd1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank
    @Size(min = 3, message = "Product name must be at least 3 characters long")
    private String productName;

    @Positive
    private double price;
}
