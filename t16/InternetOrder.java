package t16;

import java.util.ArrayList;
import java.util.Collection;

public class InternetOrder {
    Collection<Item> order;

    InternetOrder(Collection<Item>order)
    {
        this.order = order;
    }

    InternetOrder()
    {
        this.order = new ArrayList<>();
    }


}
