package com.sbsolutions.order.models;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Item implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  String id;
  Integer orderId;
  Integer itemId;
  ItemType itemType;
  Integer qty;
}
