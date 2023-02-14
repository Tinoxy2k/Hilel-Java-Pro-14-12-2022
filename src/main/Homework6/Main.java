package main.Homework6;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static List<Product> getBooksPrice(List<Product> products, int price){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(s -> s.getPrice() > price)
                .toList();
    }
    public static List<Product> getDiscountOFBooks(List<Product> products){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(Product::isDiscount)
                .peek(Product::setDiscount)
                .toList();
    }
    public static Product getCheapestBook(List<Product> products){
        Optional<Product> cheapestBook = products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .min(Product::compareTo);
        return  cheapestBook.orElseThrow(() -> new NoSuchElementException("There is no available books"));
    }
    public static List<Product> getThreeLastProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .toList();
    }
    public static double getSum(List<Product> products){
        return products.stream()
                .filter(s ->"Book".equals(s.getType()))
                .filter(s -> s.getDateAdded().getYear() == LocalDate.now().getYear())
                .filter(s -> s.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public static Map<String,List<Product>> getGroupedByTypeProducts(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getType,Collectors.toList()
                ));
    }
}

