package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.common.entity.Rhino;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

@Environment(EnvType.CLIENT)
public class RhinoModel extends GeoModel<Rhino> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "entity/rhino");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/rhino.png");
    }

    @Override
    public Identifier getAnimationResource(Rhino rhino) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "rhino.rp_anim");
    }
}
