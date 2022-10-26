package Lessons22;

import java.util.Scanner;

class Pen {
    private Solid solid;

        Pen(Solid solid) {
            this.solid = solid;
        }
        void setSolid(Solid solid) {
            this.solid = solid;
    }

    Solid getSolid() {
        return solid;
    }

    //лучше назвать метод write()
    void setWrite() {
        System.out.println("Hello " + getSolid().getColor());
    }

    void printYorColor() {
        while (true) {
                    for (int i = 0; i <= getSolid().getAmount(); i += 20) {
                        if (i == getSolid().getAmount()) {
                            System.out.println("Недостаточно чернил");
                            break;
                          }
                              setWrite();
                         }
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Выберете новый цвет для замены стержня: ");
                    String color = scn.next();
                    getSolid().setColor(color);
                    //цвет поменяли, а где новый amount? он по прежнему 0?

        }
    }
}


    public class Solid {
        private String color;
        private int amount;

        Solid(String color, int amount) {
            if (amount <= 0||amount>100) {
                System.out.println("Error");
                return;
            }else if (amount%20!=0){
                System.out.println("Число должно быть кратное 20");
                return;
            }else {
                this.amount=amount;
            }
            this.color = color;
        }

        void setColor(String color) {
            this.color = color;
        }

        String getColor() {
            return color;
        }

        void setAmount(int amount) {
                this.amount=amount;
            }


        int getAmount() {
            return amount;
        }
    }

