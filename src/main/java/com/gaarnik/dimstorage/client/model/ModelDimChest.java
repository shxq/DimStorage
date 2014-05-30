// Date: 30/05/2014 14:09:11

// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.gaarnik.dimstorage.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDimChest extends ModelBase
{
	//fields
	ModelRenderer base;

	public ModelDimChest()
	{
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(-8F, -8F, -8F, 14, 14, 14);
		base.setRotationPoint(1F, 18F, 1F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
