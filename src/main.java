//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstFriday = 2;
        int i = 1;
        for (; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница " + firstFriday + "-e число.Необходимо подготовить отчет!");
                firstFriday += 7;
            }
        }
        System.out.println("задача 2.1");
        int race = 0;
        int fullRace = 42195;
        int metr = 500;
        do {
            System.out.println("Держитесь! Осталось " + fullRace + " метров");
            fullRace = fullRace - metr;
            ;
        } while (fullRace <= 42195 && fullRace >= 0);

        System.out.println("Задача 2.2");
        int all = 42195;
        for (; all <= 42195 && all > 0; ) {
            int step = 500;
            all = all - metr;
            System.out.println("Держитесь! Осталось " + all + " метров ");
            if (all < 500) {
                break;
            }
        }

        System.out.println("Задача 3.1");
        int balance = 100;
        int allBalance = balance;
        int day = 1;
        int daysCount = 0;
        while (true) {
            if (day % 5 == 0) {
                daysCount++;
                day++;
                System.out.println("Каждый пятый день бесплатно");
                continue;
            }
            if (balance >= 100) {
                balance -= 100;
                daysCount++;
                day++;
            } else {
                break;
            }
        }
        System.out.println("На Вашем счете " + allBalance + " рублей.Этого хватит на " + daysCount + " дней");
        ;

        System.out.println("Задача 3.2");
        int money = 100;
        int initialMoney = money;
        if (money < 100) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            int totalDays = 0;
            for (int currentDay = 1; ; currentDay++) {
                if (currentDay % 5 == 0) {
                    totalDays++;
                    continue;
                }
                if (money >= 100) {
                    money -= 100;
                    totalDays++;
                } else {
                    break;
                }
            }
            System.out.println("На вашем счете " + initialMoney + " рублей.Этого хватит на " + totalDays + " дней");
        }
        System.out.println("Задача 4");
        int month = 0;
        double total = 0;
        double everyMonth = 15_000;
        double target = 12_000_000;
        while (true) {
            month++;
            total += everyMonth;
            if (month % 6 == 0) {
                total = total + total * 0.07;
            }
            System.out.printf("Месяц %d. Накоплений %.2f\n", month, total);
            if (total >= target) {
                break;
            }
        }
        System.out.println("Накопление цели достигнуто за " + month + " месяцев");

        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while ((charge <= 100) && (overheats <= 3)) {
            minute++;
            charge += 2;
            if (minute % 10 == 0) {
                minute++;
                overheats++;
                System.out.println("Устройство перегрелось");
                continue;
            }
            if (overheats == 3) {
                {
                    System.out.println("Зарядка устройства прекращена");
                    {
                        break;
                    }

                }

            }
        }
        System.out.println("Зарядка устройства составила " + minute + " минут");

    }
}






























