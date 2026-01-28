package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class StatusTest {

  @Test
  void testStatusCreation() {
    Status status = new Status();
    status.setId("1");
    status.setStatus(OrderPlacementStatus.OPEN);
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(17, 0);
    status.setStartTime(start);
    status.setEndTime(end);
    status.setApprovedMessage("Order Approved");
    status.setDeclinedMessage("Order Declined");

    assertThat(status.getId()).isEqualTo("1");
    assertThat(status.getStatus()).isEqualTo(OrderPlacementStatus.OPEN);
    assertThat(status.getStartTime()).isEqualTo(start);
    assertThat(status.getEndTime()).isEqualTo(end);
    assertThat(status.getApprovedMessage()).isEqualTo("Order Approved");
    assertThat(status.getDeclinedMessage()).isEqualTo("Order Declined");
  }

  @Test
  void testStatusAllArgsConstructor() {
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(17, 0);
    Status status = new Status("1", OrderPlacementStatus.CLOSED, start, end, "Approved", "Declined");

    assertThat(status.getId()).isEqualTo("1");
    assertThat(status.getStatus()).isEqualTo(OrderPlacementStatus.CLOSED);
    assertThat(status.getStartTime()).isEqualTo(start);
    assertThat(status.getEndTime()).isEqualTo(end);
    assertThat(status.getApprovedMessage()).isEqualTo("Approved");
    assertThat(status.getDeclinedMessage()).isEqualTo("Declined");
  }

  @Test
  void testEqualsAndHashCode() {
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(17, 0);
    
    Status status1 = new Status("1", OrderPlacementStatus.OPEN, start, end, "Msg", "Msg");
    Status status2 = new Status("1", OrderPlacementStatus.CLOSED, start, end, "Other", "Other");
    Status status3 = new Status("2", OrderPlacementStatus.OPEN, start, end, "Msg", "Msg");

    assertThat(status1).isEqualTo(status2);
    assertThat(status1).hasSameHashCodeAs(status2);
    assertThat(status1).isNotEqualTo(status3);
  }
}
