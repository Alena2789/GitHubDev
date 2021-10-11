package com.company;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    ///Приватное свойство для хранения коллекции фруктов
    private List<T> fruits = new ArrayList<>();

    public void AddFruit(T fruit) {
        if (fruit instanceof Apple){
            System.out.println("Добавили яблоко");
        }
        if (fruit instanceof Orange){
            System.out.println("Добавили апельсин");
        }

        fruits.add(fruit);
    }

    public double getWeight() {
        double sum = 0.0;
        for (int i = 0; i < fruits.size(); i++)
        {
            if (fruits.get(i) instanceof Apple ){
                sum+= 1.0f;
            }
            if (fruits.get(i) instanceof Orange ){
                sum+= 1.5f;
            }
        }
        return sum;
    }

    public Box<Fruit> getBoxFruits() {
       /* return (List<Fruit>)fruits;*/
        Box<Fruit> f = new Box<>();
        for (int i = 0; i < this.fruits.size(); i++){
           f.AddFruit((Fruit)this.fruits.get(i));
        }
        return f ;
    }

    public boolean Compare(Box<Fruit> box){
        if (box.getWeight() == this.getWeight() ){
            return true;
        }
        else return false;
    }

    public void Move(Box<T> bAppleEmpty) {
        System.out.println("Перемещаем фрукты из одной корзины в другую ");
         for (int i = 0; i < fruits.size(); i++)
         {
             bAppleEmpty.AddFruit(fruits.get(i));
         }
         fruits.removeAll(fruits);

    }
}
