package Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Cart extends AbstractEntity {
    private static final long serialVersionUID = 1L;
    @OneToOne
    @JoinColumn(unique = true)
    private Order order;
    @ManyToOne
    private Customer customer;
    @NotNull
    @Enumerated(EnumType.STRING)
    private CartStatus status;
    public Cart(Customer customer) {
        this.customer = customer;
        this.status = CartStatus.NEW;
    }
}