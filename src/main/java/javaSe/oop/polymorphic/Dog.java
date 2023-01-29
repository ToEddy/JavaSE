package javaSe.oop.polymorphic;

public class Dog extends Pet{
    @Override
    public void toHealth() {
        System.out.println("恢复健康的方式是吃骨头");
        System.out.println("结果为狗狗恢复健康");
    }

    public void swimming() {
        System.out.println("狗狗会游泳");
    }
}
