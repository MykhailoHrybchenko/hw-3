public class ATM {

    public static void main(String[] args) {
        ATM cum = new ATM();
        System.out.println(cum.countBanknotes(578));
    }

    public int countBanknotes(int sum)
    {
        int[] denominators = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int counter = 0;
        while (sum > 0)
        {
            result += sum / denominators[counter];
            sum -= (sum / denominators[counter]) * denominators[counter];
            counter++;
        }
        return result;
    }
}
