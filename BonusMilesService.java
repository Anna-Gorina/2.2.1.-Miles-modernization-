public class BonusMilesService {
    public int calculate (int cost) {
        int costOfOneMile = 20;
        int miles = cost / costOfOneMile;
        return miles;
    }
}
