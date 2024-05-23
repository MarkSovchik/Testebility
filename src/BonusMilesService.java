public class BonusMilesService {
    public int calculate(int cost, int price) {

        int bonus = 20;
        int miles = cost / bonus;

        if (price < 20){
            miles = 0;
        }

        return miles;
    }
}
