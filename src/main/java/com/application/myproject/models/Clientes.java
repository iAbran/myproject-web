package com.application.myproject.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Table
@Entity
public class Clientes {
    @Id
    @SequenceGenerator(
        name = "sequence_clientes",
        sequenceName = "sequence_clientes",
        allocationSize = 1    
    )
    @GeneratedValue(
        strategy = GenerationType.AUTO,
        generator = "sequence_clientes"
    )
    private Long id;
    private String name;
    private String lastName;
    private Integer edad;
    private LocalDate fechaNacimiento;
    private String email;
    private String ciudad;
    private String direccion;

    public Clientes(){}

    public Clientes(
        Long id,
        String name,
        String lastName,
        Integer edad,
        LocalDate fechaNacimiento,
        String email,
        String ciudad,
        String direccion){
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;
            this.email = email;
            this.ciudad = ciudad;
            this.direccion = direccion;
        }

        public Clientes(
        String name,
        String lastName,
        Integer edad,
        LocalDate fechaNacimiento,
        String email,
        String ciudad,
        String direccion){
            this.name = name;
            this.lastName = lastName;
            this.edad = edad;            
            this.fechaNacimiento = fechaNacimiento;
            this.email = email;
            this.ciudad = ciudad;
            this.direccion = direccion;
        }

        public Long getId(){ return id;}

        public String getName(){ return name;}

        public  String getLastName(){ return lastName;}

        public Integer getEdad(){ return edad;}

        public LocalDate getFechaNacimiento(){ return fechaNacimiento;}

        public String getEmail(){ return email;}

        public String getCiudad(){ return ciudad;}

        public String getDireccion(){ return direccion;}

    

        public void setId(Long id){
            this.id = id;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setEdad(Integer edad){
            this.edad = edad;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public void setCiudad(String ciudad){
            this.ciudad = ciudad;
        }

        public void setDireccion(String direccion){
            this.direccion = direccion;
        }

        @Override
        public String toString(){
            return "Service{" + 
                   ", id=" + id +
                   ", name=" + name +
                   ", lastName=" + lastName +
                   ", edad=" + edad +
                   ", fechaNacimiento=" + fechaNacimiento +
                   ", emaii=" + email +
                   ", ciudad=" + ciudad +
                   ", direccion=" + direccion +
                   "}";
        }

}
