package com.sbsolutions.order.models;


import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Status implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  private String id;
  private OrderPlacementStatus status;
  private LocalTime startTime;
  private LocalTime endTime;
  private String approvedMessage;
  private String declinedMessage;
}
