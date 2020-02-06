public class Class {

    private String className;
    private int maxHp;
    private int hp;
    private String hitDie;
    private String[] proficiencies;
    private String[] savingThrows;

    public Class (String className) {
        this.className = className;
        setClass();
    }

    private void setClass() {
        if (this.className.equals("barbarian")) {
            setMaxHp(12);
            setHitDie("1d12");
        }

        else if (this.className.equals("rogue")) {
            setMaxHp(8);
            setHitDie("1d8");
            String[] proficiencies = new String[] {
                    "light armor",
                    "simple weapons",
                    "hand crossbow",
                    "long swords",
                    "rapiers",
                    "short swords",
                    "thieves tools"
            };
            setProficiencies(proficiencies);
            String [] savingThrows = new String[] {
                    "dexterity",
                    "intelligence"
            };
            setSavingThrows((savingThrows));
        }

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    public String[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String[] getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(String[] savingThrows) {
        this.savingThrows = savingThrows;
    }
}
//classes = {
//        'barbarian': {
//        'hit_die': 'd12',
//        'hp': 12
//        },
//        'bard': {
//        'hit_die': 'd8',
//        'hp': 8
//        },
//        'cleric': {
//        'hit_die': 'd8',
//        'hp': 8
//        },
//        'druid': {
//        'hit_die': 'd8',
//        'hp': 8
//        },
//        'fighter': {
//        'hit_die': 'd10',
//        'hp': 10
//        },
//        'monk': {
//        'hit_die': 'd8',
//        'hp': 8
//        },
//        'paladin': {
//        'hit_die': 'd10',
//        'hp': 10
//        },
//        'ranger': {
//        'hit_die': 'd10',
//        'hp': 10
//        },
//        'rogue': {
//        'hit_die': 'd8',
//        'hp': 8,
//        'proficiencies': [
//        'light armor',
//        'simple weapons',
//        'hand crossbows',
//        'longswords',
//        'rapiers',
//        'shortswords',
//        'thieves tools'
//        ],
//        'saving throws': [
//        'dexterity',
//        'intelligence'
//        ]
//        },
//        'sorcerer': {
//        'hit_die': 'd6',
//        'hp': 6
//        },
//        'warlock': {
//        'hit_die': 'd8',
//        'hp': 8
//        },
//        'wizard': {
//        'hit_die': 'd6',
//        'hp': 6
//        }
//        }