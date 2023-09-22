package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    /*
1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
*/
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        for (int i = 9; i > 0; i--) {
            Product p = new Product();
            p.setCost(i);
            p.setTitle("P" + i);
            productList.add(p);
        }
        Shop shop = new Shop();
        shop.setProducts(productList);
        List<Product> testList = new ArrayList<>(productList);
        Collections.sort(testList);
        List<Product> shopSortProduct = shop.sortProductsByPrice();

        assertThat(testList).isEqualTo(shopSortProduct);
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(9);
    }
}
