// Date: 09/05/2014 12:20:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.bioxx.tfc.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.bioxx.tfc.Core.TFC_Time;

public class ModelBass extends ModelBase
{
  //fields
	private ModelRenderer head;
	private ModelRenderer mouth;
	private ModelRenderer gils;
	private ModelRenderer neck;
	private ModelRenderer body;
	private ModelRenderer back;
	private ModelRenderer rear;
	private ModelRenderer tail;
	private ModelRenderer tailEnd;
	private ModelRenderer tailFin;
	private ModelRenderer dorsalFin;
	private ModelRenderer analFin;
	private ModelRenderer pelvicFinBox;
	private ModelRenderer pectoralFinBox;
    
	private long n;
	private float rotateMouth;
	private float rotateSwim;
  
  public ModelBass()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2.5F, 0F, 0F, 5, 5, 4);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0.5235988F, 0F, 0F);
      mouth = new ModelRenderer(this, 24, 0);
      mouth.addBox(-2F, -1F, -5F, 4, 1, 6);
      mouth.setRotationPoint(0F, 4F, 4F);
      mouth.setTextureSize(128, 64);
      mouth.mirror = true;
      setRotation(mouth, -0.2617994F, 0F, 0F);
      gils = new ModelRenderer(this, 64, 0);
      gils.addBox(-3F, 2F, 2F, 6, 4, 5);
      gils.setRotationPoint(0F, 0F, 0F);
      gils.setTextureSize(128, 64);
      gils.mirror = true;
      setRotation(gils, 0.5235988F, 0F, 0F);
      neck = new ModelRenderer(this, 44, 0);
      neck.addBox(-2F, -1.2F, 3.5F, 4, 2, 6);
      neck.setRotationPoint(0F, 0F, 0F);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, 0.1745329F, 0F, 0F);
      body = new ModelRenderer(this, 0, 17);
      body.addBox(-2.5F, -1.5F, 5F, 5, 6, 10);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      back = new ModelRenderer(this, 30, 17);
      back.addBox(-2F, -3.3F, 9F, 4, 3, 7);
      back.setRotationPoint(0F, 0F, 0F);
      back.setTextureSize(128, 64);
      back.mirror = true;
      setRotation(back, -0.0523599F, 0F, 0F);
      rear = new ModelRenderer(this, 0, 33);
      rear.addBox(-2F, 5.4F, 12.9F, 4, 3, 4);
      rear.setRotationPoint(0F, 0F, 0F);
      rear.setTextureSize(128, 64);
      rear.mirror = true;
      setRotation(rear, 0.2792527F, 0F, 0F);
      tail = new ModelRenderer(this, 16, 33);
      tail.addBox(-1.5F, -11F, 12.3F, 3, 4, 5);
      tail.setRotationPoint(0F, 1F, 0F);
      tail.setTextureSize(128, 64);
      tail.mirror = true;
      setRotation(tail, -0.5235988F, 0F, 0F);
      tailEnd = new ModelRenderer(this, 32, 33);
      tailEnd.addBox(-1F, -0.5F, 0F, 2, 3, 5);
      tailEnd.setRotationPoint(0F, 0F, 19F);
      tailEnd.setTextureSize(128, 64);
      tailEnd.mirror = true;
      setRotation(tailEnd, 0F, 0F, 0F);
      tailFin = new ModelRenderer(this, 0, 51);
      tailFin.addBox(0F, -2.5F, 0F, 0, 7, 6);
      tailFin.setRotationPoint(0F, 0F, 4F);
      tailFin.setTextureSize(128, 64);
      tailFin.mirror = true;
      setRotation(tailFin, 0F, 0F, 0F);
      tailEnd.addChild(tailFin);
      dorsalFin = new ModelRenderer(this, 12, 47);
      dorsalFin.addBox(0F, -8.5F, 8F, 0, 5, 12);
      dorsalFin.setRotationPoint(0F, 0F, 0F);
      dorsalFin.setTextureSize(128, 64);
      dorsalFin.mirror = true;
      setRotation(dorsalFin, -0.0872665F, 0F, 0F);
      analFin = new ModelRenderer(this, 36, 55);
      analFin.addBox(0F, 10F, 12F, 0, 4, 5);
      analFin.setRotationPoint(0F, 0F, 0F);
      analFin.setTextureSize(128, 64);
      analFin.mirror = true;
      setRotation(analFin, 0.4363323F, 0F, 0F);
      pelvicFinBox = new ModelRenderer(this, 53, 33);
      pelvicFinBox.addBox(-1.5F, -1F, 8F, 3, 2, 4);
      pelvicFinBox.setRotationPoint(0F, 0F, 0F);
      pelvicFinBox.setTextureSize(128, 64);
      pelvicFinBox.mirror = true;
      setRotation(pelvicFinBox, -0.5235988F, 0F, 0F);
      pectoralFinBox = new ModelRenderer(this, 67, 33);
      pectoralFinBox.addBox(-3F, 4.4F, 6.7F, 6, 2, 4);
      pectoralFinBox.setRotationPoint(0F, 0F, 0F);
      pectoralFinBox.setTextureSize(128, 64);
      pectoralFinBox.mirror = true;
      setRotation(pectoralFinBox, 0.2617994F, 0F, 0F);
  }
  
  @Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    head.render(f5);
    mouth.render(f5);
    gils.render(f5);
    neck.render(f5);
    body.render(f5);
    back.render(f5);
    rear.render(f5);
    tail.render(f5);
    tailEnd.render(f5);
    //TailFin.render(f5);
    dorsalFin.render(f5);
    analFin.render(f5);
    pelvicFinBox.render(f5);
    pectoralFinBox.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		n = TFC_Time.getTotalTicks() % 30;
		rotateMouth = (n) * (n - 30) * (0.0044f * 0.5f);
		rotateSwim = (n) * (n - 30) * ( -0.0044f);

		setRotation(mouth, -0.2617994F + -0.2617994F * rotateMouth, 0F, 0F);

		if (entity.isInWater() || entity.isAirBorne)
		{
			setRotation(tailEnd, 0F, -0.2617994F + 0.2617994F * rotateSwim * (entity.isAirBorne ? 4 : 2), 0F);
			setRotation(tailFin, 0F, -0.2617994F + 0.2617994F * rotateSwim * (entity.isAirBorne ? 4 : 2), 0F);
		}
		else
		{
			setRotation(tailEnd, 0F, 0F, 0F);
			setRotation(tailFin, 0F, 0F, 0F);
		}
  }

}
