package Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "order_item")
public class OrderItem  extends AbstractEntity{
    @NotNull
    @Column(name = "quantity", nullable = false)
    private Long quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;
}
