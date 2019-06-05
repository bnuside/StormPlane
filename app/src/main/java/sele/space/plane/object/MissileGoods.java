package sele.space.plane.object;

import android.content.res.Resources;
import android.graphics.BitmapFactory;

import sele.space.plane.game.R;

/**
 * 导弹物品
 */
public class MissileGoods extends GameGoods {
    public MissileGoods(Resources resources) {
        super(resources);
    }

    @Override
    protected void initBitmap() {
        bmp = BitmapFactory.decodeResource(resources, R.drawable.missile_goods);
        object_width = bmp.getWidth();
        object_height = bmp.getHeight();
    }
}
