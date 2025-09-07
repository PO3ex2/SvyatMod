package net.p3x.svyat_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.p3x.svyat_mod.block.ModBlocks;

public class SvyatModClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FAT_BLOCK, RenderLayer.getTranslucent());
    }
}
