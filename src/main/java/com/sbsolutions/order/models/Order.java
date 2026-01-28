package com.sbsolutions.order.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Order implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  String id;
  Integer customerId;
  Date orderDate;
  OrderType type = OrderType.DELIVERY;
  Date deliverDate;
  Boolean approved;
  Date approvedDate;
  List<Item> items;
}
