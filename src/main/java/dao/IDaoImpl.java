package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class IDaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Database version");
        double temp = 25;
        return temp;
    }
}
