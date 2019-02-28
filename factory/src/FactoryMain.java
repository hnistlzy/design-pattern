
import com.kenton.factorymethod.factory.BeijingNoodlesStore;
import com.kenton.factorymethod.factory.WuHanNoodlesStore;
import com.kenton.factorymethod.product.AbstractNoodles;
import com.kenton.factorymethod.product.WuHanNoodles;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class FactoryMain {
    public static void main(String[] args) {
        AbstractNoodles noodles = new BeijingNoodlesStore().orderNoodles("老北京炸酱面");
        System.out.println("===============================");
        noodles=new WuHanNoodlesStore().orderNoodles("武汉热干面");


    }
}
