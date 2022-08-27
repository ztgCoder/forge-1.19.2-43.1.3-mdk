package net.bip.laser_physics.Item;

import net.bip.laser_physics.LaserPhysics;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, LaserPhysics.MODID);

    public static final RegistryObject <Item> RAWSILVER = ITEMS.register("raw_silver", 
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}