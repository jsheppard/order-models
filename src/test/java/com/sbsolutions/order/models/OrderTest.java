package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.Date;
import org.junit.jupiter.api.Test;

class OrderTest {

  @Test
  void testOrderCreation() {
    Order order = new Order();
    order.setId("1");
    order.setCustomerId(100);
    Date now = new Date();
    order.setOrderDate(now);
    order.setType(OrderType.PICKUP);
    order.setDeliverDate(now);
    order.setApproved(true);
    order.setApprovedDate(now);
    order.setItems(Collections.emptyList());

    assertThat(order.getId()).isEqualTo("1");
    assertThat(order.getCustomerId()).isEqualTo(100);
    assertThat(order.getOrderDate()).isEqualTo(now);
    assertThat(order.getType()).isEqualTo(OrderType.PICKUP);
    assertThat(order.getDeliverDate()).isEqualTo(now);
    assertThat(order.getApproved()).isTrue();
    assertThat(order.getApprovedDate()).isEqualTo(now);
    assertThat(order.getItems()).isEmpty();
  }

  @Test
  void testOrderAllArgsConstructor() {
    Date now = new Date();
    Order order = new Order("1", 100, now, OrderType.PICKUP, now, true, now, Collections.emptyList());

    assertThat(order.getId()).isEqualTo("1");
    assertThat(order.getCustomerId()).isEqualTo(100);
    assertThat(order.getOrderDate()).isEqualTo(now);
    assertThat(order.getType()).isEqualTo(OrderType.PICKUP);
    assertThat(order.getDeliverDate()).isEqualTo(now);
    assertThat(order.getApproved()).isTrue();
    assertThat(order.getApprovedDate()).isEqualTo(now);
    assertThat(order.getItems()).isEmpty();
  }

  @Test
  void testDefaultOrderType() {
    Order order = new Order();
    assertThat(order.getType()).isEqualTo(OrderType.DELIVERY);
  }

  @Test
  void testEqualsAndHashCode() {
    Date now = new Date();
    Order order1 = new Order("1", 100, now, OrderType.PICKUP, now, true, now, Collections.emptyList());
    Order order2 = new Order("1", 101, now, OrderType.DELIVERY, now, false, now, Collections.emptyList()); // Different data, same ID
    Order order3 = new Order("2", 100, now, OrderType.PICKUP, now, true, now, Collections.emptyList());

    assertThat(order1).isEqualTo(order2);
    assertThat(order1).hasSameHashCodeAs(order2);
    assertThat(order1).isNotEqualTo(order3);
  }
}
