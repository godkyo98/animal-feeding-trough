package slexom.animal_feeding_trough.platform.common.mixin;

import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.Predicate;

@Mixin(TemptGoal.class)
public interface TemptGoalAccessor {

    @Accessor("mob")
    public PathAwareEntity getMob();

    @Accessor("speed")
    public double getSpeed();

    @Accessor("foodPredicate")
    public Predicate<ItemStack> getFoodPredicate();

}
