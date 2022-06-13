package com.bruno.shield;

public class ConcreteShield extends Shield {
    private int shield;

    public ConcreteShield(int shield) {
        this.shield = shield;
        this.setNextShield(null);
    }

    @Override
    public int absorbDamageAndReturnRemainDamage(int attackDamage) {
        int pastShield = this.shield;
        int remainDamage = attackDamage;

        //Se tenho proximo shield, passo para ele resolver;
        if (this.getNextShield() != null) {
           remainDamage = this.getNextShield().absorbDamageAndReturnRemainDamage(attackDamage);
        }

        //Se nao consigo resolver com os proximos shields, tento resolver com o atual;
        this.shield = Math.max(this.shield - remainDamage, 0);
        return Math.max(attackDamage - pastShield, 0);                              //Retorno o dano remanescente
    }


    public int getShield() {
        return shield;
    }

    @Override
    public int countShieldAbsorb(int previousAccumulatedShield) {

        int countAcchumulatedShield = this.shield;

        if (getNextShield() != null)
            countAcchumulatedShield += this.getNextShield().countShieldAbsorb(this.shield + previousAccumulatedShield);

        return countAcchumulatedShield;
    }

    @Override
    public void addShield(int shield) {
        if (this.getNextShield() == null) {
            this.setNextShield(new ConcreteShield(shield));
        } else {
            this.getNextShield().addShield(shield);
        }
    }
}
