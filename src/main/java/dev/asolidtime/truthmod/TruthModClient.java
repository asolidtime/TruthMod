package dev.asolidtime.truthmod;

import dev.asolidtime.truthmod.entity.TruthTotemEntityModel;
import dev.asolidtime.truthmod.entity.TruthTotemEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;


@Environment(EnvType.CLIENT)
public class TruthModClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_TRUTH_TOTEM_LAYER = new EntityModelLayer(new Identifier("truthmod", "truthtotem"), "main");
    @Override
    public void onInitializeClient() {
        /*
         * Registers our Totem Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(TruthMod.TRUTH_TOTEM_ENTITY, (context) -> {
            return new TruthTotemEntityRenderer(context);
        });
        // In 1.17, use EntityRendererRegistry.register (seen below) instead of EntityRendererRegistry.INSTANCE.register (seen above)
//        EntityRendererRegistry.register(TruthMod.TRUTH_TOTEM_ENTITY, (context) -> {
//            return new TruthTotemEntityRenderer(context);
//        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_TRUTH_TOTEM_LAYER, TruthTotemEntityModel::getTexturedModelData);
    }
}