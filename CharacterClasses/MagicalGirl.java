package CharacterClasses;
public class MagicalGirl extends Character {

        private String special;

        public MagicalGirl(String name,int health, int attack,int defense,int agility,int luck) {
            super(name,health,attack,defense,agility,luck);
            this.special = "Love Reigns Forever!";
        }

        public String getSpecial() {
            return this.special;
        }

        public void special(Character enemy) {
            System.out.println("Magical Girl used special move!");
            //"Heals the enemy and herself by 50%"//
            //"Health cap grows by 100% of enemy's health"//
            this.attack(enemy);
        }
}
