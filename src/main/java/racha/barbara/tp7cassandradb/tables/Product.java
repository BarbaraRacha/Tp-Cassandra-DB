package racha.barbara.tp7cassandradb.tables;

import jdk.jshell.Snippet;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.Data;

@Data
@Table("products")
@Builder
public class Product {

    @Id
    @PrimaryKey
    private String id;
    private String name;
    private int quantity;
    private double price;
}