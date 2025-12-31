package net.GayFurryTeam.FastMath.mixin;

import net.GayFurryTeam.FastMath.FastMath;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MathHelper.class)
public class MixinMathHelper {
    /**
     * @author GayFurryTeam
     * @reason Replace with fast lookup table implementation
     */
    @Overwrite
    public static float sin(double d) {
        return FastMath.sin((float) d);
    }

    /**
     * @author GayFurryTeam
     * @reason Replace with fast lookup table implementation
     */
    @Overwrite
    public static float cos(double d) {
        return FastMath.cos((float) d);
    }
}
