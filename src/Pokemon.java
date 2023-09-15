public class Pokemon
{
    private double HP, attack, defense, specialAttack, specialDefense, speed, level;

    public Pokemon()
    {

    }

    public Pokemon(double defaultHP, double defaultAttack, double defaultDefense, double defaultSpecialAttack, double defaultSpecialDefense, double defaultSpeed, double defaultLevel)
    {
        HP = defaultHP;
        attack = defaultAttack;
        defense = defaultDefense;
        specialAttack = defaultSpecialAttack;
        specialDefense = defaultSpecialDefense;
        speed = defaultSpeed;
        level = defaultLevel;
    }

    public int getHP()
    {
        return (int) HP;
    }

    public void setHP(double newHP)
    {
        HP = newHP;
    }

    public double getAttack()
    {
        return attack;
    }

    public void setAttack(double newAttack)
    {
        attack = newAttack;
    }

    public String[] getStats()
    {
        System.out.print(this.getClass().getSimpleName() + "'s Stats: ");                                               // better way of doing this?
        return new String[]{
                ("HP: " + (int) HP),
                ("Attack: " + (int) attack),
                ("Defense: " + (int) defense),
                ("Special Attack: " + (int) specialAttack),
                ("Special Defense: " + (int) specialDefense),
                ("Speed: " + (int) speed),
                ("Level: " + (int) level)};
    }

    public void levelUp()
    {
        double multiplier = 0.02;
        HP += (HP * multiplier);
        attack += (attack * multiplier);
        defense += (defense * multiplier);
        specialAttack += (specialAttack * multiplier);
        specialDefense += (specialDefense * multiplier);
        speed += (speed * multiplier);
        level++;
    }

    public void levelUp(int amount)                                                                                     // this is proper overloading?
    {
        for (int i = 0; i < amount; i++)
        {
            levelUp();
        }
    }
}
