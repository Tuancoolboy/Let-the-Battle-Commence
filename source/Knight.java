public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp,wp);

    }

    @Override
    public double getCombatScore() {
        int baseHp = this.getBaseHp();
        int wp = this.getWp();
        if (Utility.isSquare(Battle.GROUND)){
            if (baseHp*2>999){
                return 999;
            }
            return baseHp*2;
        }
        else if (wp==1){
            if (baseHp>999){
                return 999;
            }
return baseHp;
        }
        else{
            if (baseHp/10>999){
                return 999;
            }
            return baseHp/10;
        }
            
    }
}
