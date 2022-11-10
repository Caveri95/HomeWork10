import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        int[] spendingOnMonth = new int[30];
        for (int i = 0; i < spendingOnMonth.length; i++) {
            spendingOnMonth[i] = ((int)(Math.random() * 100000 + 100000));
        }
        System.out.println(Arrays.toString(spendingOnMonth) + "\n");

        int totalSumOnMonth = 0;
        for (int value : spendingOnMonth) {
            totalSumOnMonth = totalSumOnMonth + value;
        }
        System.out.println("Сумма трат за месяц составила " + totalSumOnMonth + " рублей. \n");

        int minSpend = spendingOnMonth[0];
        int maxSpend = spendingOnMonth[0];
        for (int k : spendingOnMonth) {
            if (k > maxSpend) {
                maxSpend = k;
            }
            if (k < minSpend) {
                minSpend = k;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей." +
                " Максимальная сумма трат за день составила " + maxSpend + " рублей. \n");



        double summ = 0;
        for (int j : spendingOnMonth) {
            summ = summ + j;
        }
        double averageSpend = summ / spendingOnMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей. \n");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        char helpVar;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            helpVar = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
            reverseFullName[i] = helpVar;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
    }


