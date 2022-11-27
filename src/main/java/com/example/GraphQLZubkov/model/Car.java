package com.example.GraphQLZubkov.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String brand;
    private String model;
    private String date;

    public Car(String brand, String model, String date)
    {
        this.brand = brand;
        this.model = model;
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
