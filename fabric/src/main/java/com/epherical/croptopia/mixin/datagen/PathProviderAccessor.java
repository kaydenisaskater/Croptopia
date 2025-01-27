package com.epherical.croptopia.mixin.datagen;

import net.minecraft.data.DataGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.nio.file.Path;

@Mixin(DataGenerator.PathProvider.class)
public interface PathProviderAccessor {

    @Accessor("root") @Mutable
    void setRoot(Path root);


}
