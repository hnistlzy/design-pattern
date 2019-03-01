import com.kenton.abstractfactory.noodelsfactory.BeijingNoodlesFactory;
import com.kenton.abstractfactory.product.BeijingNoodles;
import com.kenton.factorymethod.factory.BeijingNoodlesStore;
import com.kenton.factorymethod.factory.WuHanNoodlesStore;
import com.kenton.factorymethod.product.AbstractNoodles;

/**
 * @author KentonLee
 * @date 2019/2/28
 */
public class FactoryMain {
    public static void main(String[] args) {
        AbstractNoodles noodles = new BeijingNoodlesStore().orderNoodles("老北京炸酱面");
        System.out.println("===============================");
        noodles=new WuHanNoodlesStore().orderNoodles("武汉热干面");
        System.out.println("========下面是抽象工厂模式========");
        BeijingNoodles beijingNoodles = new BeijingNoodles(new BeijingNoodlesFactory());
    }
}
