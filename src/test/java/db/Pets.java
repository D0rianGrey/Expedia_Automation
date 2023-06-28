package db;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Pets {
    int age;
    String name;
}
