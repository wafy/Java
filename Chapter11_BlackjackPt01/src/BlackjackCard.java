public class BlackjackCard extends Card {

    //Ace(1, 11)는 11을 리턴.
    //Jack, Queen, King의 경우 모두 10을 리턴
    //이 4개를 제외한 모든 숫자는 그 숫자를 리턴.

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {

        switch (this.rankNumber) {
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return this.rankNumber;
        }
    }


    public boolean isAce() {
        return this.rankNumber == 1;
    }

}