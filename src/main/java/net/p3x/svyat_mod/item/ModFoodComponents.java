package net.p3x.svyat_mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent FINIKI = new FoodComponent.Builder().snack().nutrition(3).saturationModifier(0.25f)
                                                                          .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,   // the effect
                                                                                  200,                    // duration in ticks (40 = 2 seconds)
                                                                                  1,                     // amplifier (0 = Speed I, 1 = Speed II, etc.)
                                                                                  true,                 // ambient
                                                                                  true,                 // show particles
                                                                                  true), 0.25f)
                                                                          .build();
}
