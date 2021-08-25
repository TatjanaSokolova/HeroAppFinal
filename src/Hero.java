public class Hero extends Person{
    //     Fields - different values for different objects

    private String nickname;
    private int heroID;
    private HeroType heroType;
    private int deedTime;

    //non-argument constructor
    public Hero() {
    }

    //constructor with arguments

    public Hero(String name, String surname, String nickname, int heroID, HeroType heroType, int deedTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.heroType = heroType;
        this.deedTime = deedTime;
    }


    // ToString method


    @Override
    public String toString() {
        return  "Hero" +
                "name=" + name + ',' +
                "surname=" + surname + ',' +
                "nickname=" + nickname + ',' +
                "heroID=" + heroID +',' +
                "heroType=" + heroType +',' +
                "deedTime=" + deedTime;
    }

    //Level calculating method
    public int calculatedLevel() {
        if ( deedTime < 20 ) {
            return 1;
        } else if ( deedTime >= 20 && deedTime < 40 ) {
            return 2;
        } else {
            return 3;
        }
    }

    //Getters


    public String getNickname() {
        return nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

    enum HeroType {
        Hero,
        Villain
    }
}
