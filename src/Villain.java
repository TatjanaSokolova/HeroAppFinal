public class Villain extends Person{
    //     Fields - different values for different objects

    private String nickname;
    private int heroID;
    private HeroType heroType;
    private int crimeTime;

    //non-argument constructor
    public Villain() {
    }

    public static int countVillains;

    public Villain(String name, String surname, String nickname, int heroID, HeroType heroType, int crimeTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.heroType = heroType;
        this.crimeTime = crimeTime;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name=" + name + ',' +
                "surname=" + surname + ',' +
                "nickname=" + nickname + ',' +
                "heroID=" + heroID +',' +
                "heroType=" + heroType +',' +
                "crimeTime=" + crimeTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }

    public static int getCountVillains() {
        return countVillains;
    }

    public static void setCountVillains(int countVillains) {
        Villain.countVillains = countVillains;
    }

    enum HeroType {
        Hero,
        Villain
    }
}
