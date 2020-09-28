package pt.jp.springdatarest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "AD")
public class Ad {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "OWNER")
    @NotNull(message = "Owner is required.")
    public String owner;
    @Column(name = "TITLE")
    @NotNull(message = "Title is required.")
    @Size(min = 5, max = 128, message = "Title must have between {min} and {max} characters.")
    public String title;
    @Column(name = "DESCRIPTION")
    @NotNull(message = "Description is required.")
    @Size(min = 5, max = 256, message = "Description must have between {min} and {max} characters.")
    public String description;
    @Column(name = "PRICE")
    @NotNull(message = "Price is required.")
    @Min(message = "Price cannot be negative.", value = 0)
    public BigDecimal price;
}