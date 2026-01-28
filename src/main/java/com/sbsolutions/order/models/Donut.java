package com.sbsolutions.order.models;

import jakarta.validation.constraints.NotBlank;
import java.io.Serial;
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

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  protected String id;
  @NotBlank
  protected String description;
  @NotBlank
  protected BigDecimal price;
  protected String url;
}
