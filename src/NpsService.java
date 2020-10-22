public class NpsService {
    public double calculate (int[] votes) {
        int minPointPromoter = 9;
        int maxPointPromoter = 10;
        int totalPromoter = 0;
        int minPointPasivos = 7;
        int maxPointPasivos = 8;
        int totalPasivos = 0;
        int minPointDetractor = 0;
        int maxPointDetractor = 6;
        int totalDetractor = 0;
        for (int i = 0; i < votes.length; i++) {
            int vote = votes[i];
            if (vote >= minPointPromoter && vote <= maxPointPromoter){
                totalPromoter = totalPromoter +1;
            }

        }
        for (int i = 0; i < votes.length; i++) {
            int vote = votes[i];
            if (vote >= minPointPasivos && vote <=maxPointPasivos){
                totalPasivos = totalPasivos +1;
            }
        }
        for (int i = 0; i < votes.length; i++) {
            int vote = votes[i];
            if (vote >= minPointDetractor && vote <=maxPointDetractor){
                totalDetractor = totalDetractor + 1;
            }
        }
        if (totalPromoter == totalDetractor) {
            return 0;
        }
        int total = totalDetractor + totalPasivos + totalPromoter;
        double nps = (totalPromoter - totalDetractor) * 100.0 / total;
        return nps;
    }

}
