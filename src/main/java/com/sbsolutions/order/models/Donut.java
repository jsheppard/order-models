package com.sbsolutions.order.models;

import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "donuts")
public class Donut {

  @Id
  String id;
  @NotBlank
  String description;
  @NotBlank
  BigDecimal price;
  String unit = "USD";
  String currency;
  String url;
}
