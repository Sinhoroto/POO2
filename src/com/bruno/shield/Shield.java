package com.bruno.shield;

public abstract class Shield {
    private Shield nextShield;

    public Shield getNextShield() {
        return nextShield;
    }

    public void setNextShield(Shield nextShield) {
        this.nextShield = nextShield;
    }

    public abstract int absorbDamageAndReturnRemainDamage(int attackDamage);
    public abstract int getShield();
    public abstract int countShieldAbsorb(int absorb);
    public abstract void addShield(int shield);
}
