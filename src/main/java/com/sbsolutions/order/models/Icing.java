package com.sbsolutions.order.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Icing implements Serializable {

  @Id
  String id;
  String description;
  String url;

}
