import java.util.ArrayList;
import java.util.List;

class Platformsearch {

    public static Product linearSearch(List<Product> list, int id) {
        for (Product p : list) {
            if (p.productid == id) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(List<Product> list, int id) {
    int low = 0, high = list.size() - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        Product midProduct = list.get(mid);

        if (midProduct.productid == id) return midProduct;
        else if (midProduct.productid < id) low = mid + 1;
        else high = mid - 1;
    }
    return null;
}


    public static void main(String[] args) {
    List<Product> prod = new ArrayList<>();
    prod.add(new Product(104, "Laptop", "Electronics"));
    prod.add(new Product(101, "Shoes", "Fashion"));
    prod.add(new Product(102, "Smartphone", "Electronics"));
    prod.add(new Product(105, "Backpack", "Accessories"));
    prod.add(new Product(106, "Desk Chair", "Furniture"));
    prod.add(new Product(107, "Notebook", "Stationery"));
    prod.add(new Product(108, "Headphones", "Electronics"));
   Product linearResult = linearSearch(prod, 104);
    if (linearResult != null) {
        System.out.println("Linear Search: Product Found");
        System.out.println(linearResult);
    } else {
        System.out.println("Linear Search:Product not found");
    }

    prod.sort((a, b) -> Integer.compare(a.productid, b.productid));

    Product binaryResult = binarySearch(prod, 111);
    if (binaryResult != null) {
        System.out.println("Binary Search: Product Found");
        System.out.println(binaryResult);
    } else {
        System.out.println("Binary Search: Product not found");
    }

}
}

class Product {
    int productid;
    String productName;
    String category;

    Product(int productid, String productName, String category) {
        this.productid = productid;
        this.productName = productName;
        this.category = category;
    }

    @Override
public String toString() {
    return "ID: " + productid + ", Name: " + productName + ", Category: " + category;
}

}
