package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class IDaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web service version");
        double t = 77;
        return t;
    }
}
