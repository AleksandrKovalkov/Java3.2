public class Main {

    public static void main(String[] args) {

        int balance = 100; // баланс
        int refil = 1500; // сумма пополнения
        int bonus = 0; // бонусный счет на данный момент

        if(refil >= 1000) {

            bonus = refil / 100;
            balance = balance + refil + bonus;

            System.out.println("Клиент пополнил счет на " + refil + " рублей - бонус равен " + bonus + " рублям. Итоговая сумма на счету клиента - " + balance + " рублей.");

        } else {

            balance = balance + refil;

            System.out.println("Клиент пополнил счет на " + refil + " рублей - бонусов нет. Итоговая сумма на счету клиента - " + balance + " рублей.");

        }
    }
}
