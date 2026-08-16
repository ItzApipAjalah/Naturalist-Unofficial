package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.common.entity.Alligator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

@Environment(EnvType.CLIENT)
public class AlligatorModel extends GeoModel<Alligator> {

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "entity/alligator");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/alligator/alligator.png");
    }

    @Override
    public Identifier getAnimationResource(Alligator alligator) {
        return Identifier.fromNamespaceAndPath(Naturalist.MOD_ID, "alligator.rp_anim");
    }
}
