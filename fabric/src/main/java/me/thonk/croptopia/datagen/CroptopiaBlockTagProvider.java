package me.thonk.croptopia.datagen;

import me.thonk.croptopia.registry.Content;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

public class CroptopiaBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public CroptopiaBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        generateSaplings();
    }

    protected void generateSaplings() {
        FabricTagBuilder<Block> saplings = getOrCreateTagBuilder(BlockTags.SAPLINGS);
        for (Content.Tree crop : Content.Tree.values()) {
            saplings.add(crop.getSaplingBlock());
        }
        for (Content.Bark crop : Content.Bark.values()) {
            saplings.add(crop.getSaplingBlock());
        }
    }

}
