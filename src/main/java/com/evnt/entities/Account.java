package com.evnt.entities;

import java.io.Serializable;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int acc_id;
	@Column(nullable = false, length = 255, unique = true)
	private String email;
	@Column(nullable = false, length = 255)
	private String password;
	@Column(nullable = false, precision = 10)
	private int status;
	@Column(nullable = false, precision = 10)
	private int wl;
	@OneToMany(mappedBy = "account")
	private Set<Order> order;
}	
