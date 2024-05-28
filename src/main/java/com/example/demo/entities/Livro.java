package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Livro")
public class Livro {

	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
private Integer id;

@Column(name = "titulo", nullable = false, length = 100)
private String titulo;

@Column(name = "ano", nullable = false, length = 100)
private String ano;

@ManyToOne (fetch = FetchType.LAZY) 
@JoinColumn (name = "id_autor", nullable = false)
private Autor autor;

@ManyToOne (fetch = FetchType.LAZY) 
@JoinColumn (name = "id_categoria", nullable = false)
private Categoria categoria;
}