package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Box<Apple> bApple2 = new Box<>();
        Box<Apple> bAppleFull = new Box<>();
//Добавляем яблоки
        bAppleFull.AddFruit(new Apple());
        bAppleFull.AddFruit(new Apple());
//Пытаемся добавить апельсин к корзине, содержащей яблоки, должен выдать ошибку
        //Выдаст ошибку компиляции, что верно. bAppleFull.AddFruit(new Orange());

        //Выводим вес корзины с яюлоками
        System.out.println("Вес корзины 1 с яблоками:" + bAppleFull.getWeight());

        bAppleFull.Move(bApple2);

        System.out.println("Вес корзины 1 с яблоками:" + bAppleFull.getWeight());
        System.out.println("Вес корзины 2 с яблоками:" + bApple2.getWeight());

        Box<Orange> bOrangeEmpty = new Box<>();
        Box<Orange> bOrangeFull = new Box<>();

        bOrangeFull.AddFruit(new Orange());
        bOrangeFull.AddFruit(new Orange());
        System.out.println("Вес корзины 1 с апельсинами:" + bOrangeFull.getWeight());

        boolean isEquals = bOrangeFull.Compare(bApple2.getBoxFruits());
        System.out.println("Корзина 1 с апельсинами больше чем коризна 2 с яблоками? " + isEquals);

        bApple2.AddFruit(new Apple());
        isEquals = bOrangeFull.Compare(bApple2.getBoxFruits());
        System.out.println("Корзина 1 с апельсинами больше чем коризна 2 с яблоками? " + isEquals);

        //Выдаст ошибку компиляции, что верно, так как по заданию нельзя яблоки высыпать в апельсины bApple2.Move(bOrangeFull);

    }

}


