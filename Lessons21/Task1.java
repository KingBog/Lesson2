package Lessons21;

import java.util.Scanner;

class Pistol {
    Bullet bullet;

    Pistol(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    int shot() {
        int damage = (int) (bullet.getSpeed() * bullet.getWeight());
        return damage;
    }

    void printInfo() {
        boolean answer = true;
        while (answer) {
            System.out.println("1 Узнать урон пули\n" + "2.Изменить скорось пули\n" + "3. Изменить вес пули\n" + "4. Виход");
            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();

            if (input == 1) {
                System.out.println(shot());
            } else if (input == 2) {
                System.out.println("Введите желаемую скорось пули");
                int newSpeed = scn.nextInt();
                getBullet().setSpeed(newSpeed);
            } else if (input == 3) {
                System.out.println("Введите желаемый вес пули");
                int weight = scn.nextInt();
                getBullet().setWeight(weight);
            } else if (input == 4) {
                System.out.println("Хорошего вам дня!!");
                answer = false;
            }
        }
    }
}


class Bullet {
    private int speed;
    private int weight;

    Bullet(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
