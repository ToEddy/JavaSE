package javaSe.oop.polymorphic;

public class Cat extends Pet{
    @Override
    public void toHealth() {
        System.out.println("恢复健康的方式是吃鱼");
        System.out.println("结果为猫咪恢复健康");
    }
}
