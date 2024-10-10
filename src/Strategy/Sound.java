package Strategy;

public class Sound {
    private Animal animal;

    public void setSound(Animal animal){
        this.animal = animal;
    }

    public void bark(){
        if(animal == null){
            System.out.println("맨손 공격");
        }
        else{
            animal.bark();
        }
    }
}
