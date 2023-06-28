package db.myTables;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerInfo {
    private String courseName;
    private String purchasedDate;
    private int amount;
    private String location;

}
