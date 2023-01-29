package javaSe.oop.polymorphic;

public class Master {
    public void cure(Pet pet){
        if(pet.Health<60){
            System.out.println("宠物需要看病");
            pet.toHealth();
            pet.Health=100;
            System.out.println("看病之后宠物的健康值为："+pet.Health);
        }
        else{
            System.out.println("宠物不需要看病");
        }
    }
}
