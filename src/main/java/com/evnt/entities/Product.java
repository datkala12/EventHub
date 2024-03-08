package com.evnt.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "product")
public class Product {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int product_id;
	@Column(nullable = false, length = 255, unique = true)
	private String name;
	@Column(nullable = false, length = 255)
	private String description;
	@Column(nullable = false, precision = 10)
	private int status;
	@Column(nullable = false, precision = 10)
	private float price;
	@Column(nullable = false, precision = 10)
	private int rental_duration;
	@Column(nullable = false, precision = 10)
	private String type;
	@Column(nullable = false, precision = 10)
	private String acc_user;
	@Column(nullable = false, precision = 10)
	private String acc_pass;
	@Column(nullable = false, precision = 10)
	private String date_create;
}
