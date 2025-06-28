package net.factoryman99.tutorialmod.item;

import net.factoryman99.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB;

public class ModCreativeModeTabs {
    private static Object Registies;
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
           DeferredRegister.create(CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TAB.registry(eventBus);
    }
}
