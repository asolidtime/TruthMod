package dev.asolidtime.truthmod.entity;

import dev.asolidtime.truthmod.TruthModClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TruthTotemEntityRenderer extends MobEntityRenderer<TruthTotemEntity, TruthTotemEntityModel> {

    public TruthTotemEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new TruthTotemEntityModel(context.getPart(TruthModClient.MODEL_TRUTH_TOTEM_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(TruthTotemEntity entity) {
        return new Identifier("truthmod", "textures/entity/truthtotem/truthtotem.png");
    }
}