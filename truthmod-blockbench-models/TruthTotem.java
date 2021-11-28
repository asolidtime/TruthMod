// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class TruthTotem extends EntityModel<Entity> {
    private final ModelPart bb_main;

    public TruthTotem() {
        int textureWidth = 64;
        int textureHeight = 64;
        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 0).addCuboid(-11.0F, -25.0F, -6.0F, 11.0F, 25.0F, 11.0F, 0.0F, false);
    }

    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}