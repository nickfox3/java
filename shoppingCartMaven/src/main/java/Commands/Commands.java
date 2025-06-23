package Commands;

import Service.CartService;

public interface Commands {
    void execute(CartService cartService);
}
