package dev.asolidtime.truthmod;

import dev.asolidtime.truthmod.entity.TruthTotemEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TruthMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("truthmod");
	public static final EntityType<TruthTotemEntity> TRUTH_TOTEM_ENTITY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("truthmod", "truthtotem"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TruthTotemEntity::new).dimensions(EntityDimensions.fixed(3f, 3f)).build()
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		FabricDefaultAttributeRegistry.register(TRUTH_TOTEM_ENTITY, TruthTotemEntity.createMobAttributes()); // register truth totem entity
		LOGGER.info("\uD83D\uDDFF\uD83D\uDDFF\uD83D\uDDFF\uD83D\uDDFF\uD83D\uDDFF"); // 🗿🗿🗿🗿🗿



	}
}
