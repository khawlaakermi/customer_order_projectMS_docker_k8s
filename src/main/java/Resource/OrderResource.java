package Resource;

import Dto.OrderDto;
import Services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static Entity.web.API;

@RequiredArgsConstructor
@RestController
@RequestMapping(API + "/orders")
public class OrderResource {
    private final OrderService orderService;
    @GetMapping
    public List<OrderDto> findAll() {
        return this.orderService.findAll();
    }
    @GetMapping("/customer/{id}")
    public List<OrderDto> findAllByUser(@PathVariable Long id) {
        return this.orderService.findAllByUser(id);
    }
    @GetMapping("/{id}")
    public OrderDto findById(@PathVariable Long id) {
        return this.orderService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.orderService.delete(id);
    }
}
