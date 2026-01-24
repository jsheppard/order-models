package com.sbsolutions.order.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Item {

  @Id
  String id;
  Integer orderId;
  Integer itemId;
  ItemType itemType;
  Integer qty;
}
