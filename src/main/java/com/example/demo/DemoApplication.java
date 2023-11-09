package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entidades.Acceso;
import com.example.demo.entidades.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hola");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Acceso ac1 = new Acceso();
		ac1.setCodigo_acceso("Admin");
		ac1.setDescripcion_acceso("Usuario Administrador");
		em.persist(ac1);
		
		Usuario usu1 = new Usuario();
		usu1.setNombre_usuario("Alejandro");
		usu1.setDni_usuario("123123123A");
		usu1.setClave_usuario("Contraseña");
		usu1.setAcceso(ac1);
		
		em.persist(usu1);
		
		em.getTransaction().commit();
		em.close();
		
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
