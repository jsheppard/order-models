package com.sbsolutions.order.models;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class Roll extends Donut implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

}
