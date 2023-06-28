package db.myTables;

import java.util.List;

interface CustomerInfoRepository {
    List<CustomerInfo> getAll();

    CustomerInfo getById(int id);

}
