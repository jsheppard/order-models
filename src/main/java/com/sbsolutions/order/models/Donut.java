package com.sbsolutions.order.models;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Donut implements Serializable {
  @Id
  String id;
  @NotBlank
  String description;
  @NotBlank
  BigDecimal price;
  String url;
}
