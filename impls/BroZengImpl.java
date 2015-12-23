/**
 * Created by chengkangyang on 15/12/23.
 */
public class BroZengImpl implements IBroZeng {

    @Override
    public void lol() {
        System.out.print("你们都是垃圾！");
    }

    @Override
    public void readPaper() {
        System.out.print("毕不了业哎……");
    }

    @Override
    public void writePaper() {
        System.out.print("毕不了业哎……");
    }

    @Override
    public boolean graduate() {
        return false;
    }

    @Override
    public void delayGraduate(int year) {
        System.out.print("毕不了业哎……薛超儿子都" + (year + 2) + "岁了……");
    }

    @Override
    public void loseHair(int hairCount) {
        System.out.print("毕不了业哎……头发就剩" + getHairCount() + "根了……");
    }

    @Override
    public int getHairCount() {
        return 0;
    }

    @Override
    public boolean canFindGirlFriend() {
        return false;
    }

    @Override
    public boolean isXiangQinSuccess(IGirl girl) {
        return !girl.isWhite() &&
                girl.isBig() &&
                girl.isTall() &&
                girl.isBeautiful() &&
                girl.isHas5house() &&
                girl.isLoveLol() &&
                girl.isSexy() &&
                girl.isBoshi();
    }
}
