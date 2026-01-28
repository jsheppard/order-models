package com.sbsolutions.order.models;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Customer implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  String id;
  String firstName;
  String middleName;
  String lastName;
  String address1;
  String address2;
  String city;
  String state;
  String zip;
  String phone;
  String email;
}
