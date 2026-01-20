package com.base.base.repository;

import com.base.base.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbc;

    public ProductRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public void addProduct(Product product){
        String sql =
                "INSERT INTO products (name, price) VALUES(?, ?)";
        jdbc.update(sql,
                product.getName(),
                product.getPrice());
    }
    public List<Product> getProducts(){
        String sql =
                "SELECT * FROM products";

        RowMapper<Product> rowMapper = (rs, rowNum) -> {
            Product rowObject = new Product();

            rowObject.setId(rs.getInt("id"));
            rowObject.setName(rs.getString("name"));
            rowObject.setPrice(rs.getBigDecimal("price"));

            return rowObject;
        };
        return jdbc.query(sql, rowMapper);
    }
    public void updateProduct(int id, Product product){
        String sql =
                "UPDATE products set name = ?, price = ? WHERE id = ?";
        jdbc.update(sql,
                product.getName(),
                product.getPrice(),
                id);
    }
    public void deleteProduct(int id){
        String sql =
                "DELETE FROM products WHERE id = ?";
        jdbc.update(sql, id);
    }
}
