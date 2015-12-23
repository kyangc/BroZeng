package com.duitang.main.activity.publish;

/**
 * Created by chengkangyang on 15/12/23.
 */
public class MotherZengImpl implements IMotherZeng {

    @Override
    public boolean willKillZeng(IBroZeng broZeng) {
        return true;
    }

    @Override
    public boolean isLikeZengsGirlFriend(IGirl girl) {
        return false;
    }
}
