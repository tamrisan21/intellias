package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "orders")
public class Order {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

 @Column(name = "userId")
 private long userId;
 @Column(name = "productId")
 private long productId;

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public long getUserId() {
  return userId;
 }

 public void setUserId(long userId) {
  this.userId = userId;
 }

 public long getProductId() {
  return productId;
 }

 public void setProductId(long productId) {
  this.productId = productId;
 }
}
