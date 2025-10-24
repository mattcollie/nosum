package nosum.patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.entity.mobs.Mob;
import necesse.entity.projectile.bulletProjectile.ReanimationBoltProjectile;
import net.bytebuddy.asm.Advice;

@ModMethodPatch(
    target = ReanimationBoltProjectile.class,
    name = "spawnIfServer",
    arguments = {Mob.class}
)
public class ReanimationBoltProjectilePatch {
    @Advice.OnMethodEnter
    public static boolean onEnter(@Advice.Argument(0) Mob mob) {
        return false;
    }
}
