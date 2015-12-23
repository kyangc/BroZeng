/**
 * Created by chengkangyang on 15/12/23.
 */
public class BroZeng implements IBroZeng {

    static IMotherZeng mother = new MotherZengImpl();

    public BroZeng() {
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    public static BroZeng getBroZeng() {
        return BroZengHolder.broZeng;
    }

    @Override
    public void lol() {
        getBroZeng().lol();
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    @Override
    public void readPaper() {
        getBroZeng().readPaper();
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    @Override
    public void writePaper() {
        getBroZeng().writePaper();
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    @Override
    public boolean graduate() {
        return getBroZeng().graduate();
    }

    @Override
    public void delayGraduate(int year) {
        getBroZeng().delayGraduate(year);
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    @Override
    public void loseHair(int hairCount) {
        getBroZeng().loseHair(hairCount);
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
    }

    @Override
    public int getHairCount() {
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
        return getBroZeng().getHairCount();
    }

    @Override
    public boolean canFindGirlFriend() {
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
        return getBroZeng().canFindGirlFriend();
    }

    @Override
    public boolean isXiangQinSuccess(IGirl girl) {
        if (mother.willKillZeng(this)) {
            System.out.print("我妈要杀了我啊！");
        }
        return getBroZeng().isXiangQinSuccess(girl) && mother.isLikeZengsGirlFriend(girl);
    }

    private static class BroZengHolder {

        public static final BroZeng broZeng = new BroZeng();
    }
}
