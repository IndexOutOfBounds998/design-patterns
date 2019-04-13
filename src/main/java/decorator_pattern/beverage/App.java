package decorator_pattern.beverage;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.*;

/**
 * Created by yang on 2019/4/14.
 */
public class App {

    public static void main(String[] args) {
//        //来一杯浓咖啡
//        Beverage espresso = new Espresso();
//        //给浓咖啡加上抹茶调料
//        CondimentDecorator decorator = new Moka(espresso);
//        //再给浓咖啡加点糖
//        decorator = new Sugar(decorator);
//        System.out.println(decorator.getDesc());
//        System.out.println(decorator.cost());


        //#2 方式2

        HouseBlend houseBlend = new HouseBlend();

        CondimentDecorator condimentDecorator = new Moka(new Sugar(houseBlend));
        System.out.println(condimentDecorator.getDesc());
        System.out.println(condimentDecorator.cost());
        //# jdk 里的装饰者模式
        // InputStream 是被装饰者  FilterInputStream 是装饰者
        // 了解了 基本的装饰者模式 妈妈再也不担心我的学习啦
        try {
            FilterInputStream filterIs = new LineInputStream(new BufferedInputStream(new FileInputStream(new File("D:\\tools\\code.txt"))));
            int i = 0;
            while ((i = filterIs.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
