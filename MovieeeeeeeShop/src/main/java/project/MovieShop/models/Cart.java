package project.MovieShop.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "cart")
    private List<Movie> contents;
    private Double total = 0.0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total += total;
    }

    public void resetTotal() { this.total = 0.0; }
}
