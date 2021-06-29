package org.sid.cinema.dao;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Ville {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double longitude,latidude,altitude;
	private int nombreSalles;
	@OneToMany(mappedBy = "cinema")
	private Collection<Cinema> cinemas;
	

}
