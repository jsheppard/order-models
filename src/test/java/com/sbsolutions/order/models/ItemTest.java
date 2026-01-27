package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ItemTest {

  @Test
  void testItemCreation() {
    Item item = new Item();
    item.setId("1");
    item.setOrderId(100);
    item.setItemId(200);
    item.setItemType(ItemType.DONUT);
    item.setQty(5);

    assertThat(item.getId()).isEqualTo("1");
    assertThat(item.getOrderId()).isEqualTo(100);
    assertThat(item.getItemId()).isEqualTo(200);
    assertThat(item.getItemType()).isEqualTo(ItemType.DONUT);
    assertThat(item.getQty()).isEqualTo(5);
  }

  @Test
  void testItemAllArgsConstructor() {
    Item item = new Item("1", 100, 200, ItemType.DONUT, 5);

    assertThat(item.getId()).isEqualTo("1");
    assertThat(item.getOrderId()).isEqualTo(100);
    assertThat(item.getItemId()).isEqualTo(200);
    assertThat(item.getItemType()).isEqualTo(ItemType.DONUT);
    assertThat(item.getQty()).isEqualTo(5);
  }
}
