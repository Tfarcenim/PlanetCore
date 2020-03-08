package com.PlanetCore.init;

import com.PlanetCore.items.Gems;
import com.PlanetCore.items.ItemBase;
import com.PlanetCore.items.armor.*;
import com.PlanetCore.items.food.EnchantedFoodEffectBase;
import com.PlanetCore.items.food.EnchantedFoodEffectBase1;
import com.PlanetCore.items.food.FoodEffectBase;
import com.PlanetCore.items.shields.*;
import com.PlanetCore.items.tools.*;
import com.PlanetCore.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//TOOLS MATERIAL	(NAME, HARVEST LVL, MAX USE, EFFICIENCY, DAMAGE, ENCHANTABILITY)
	public static final ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial("material_bronze", 3, 200, 6.0F, 2.0F, 20);
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron", 4, 300, 8.0F, 2.5F, 20);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 5, 400, 10.0F, 3.0F, 18);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 6, 500, 12.0F, 3.6F, 16);
	public static final ToolMaterial MATERIAL_GOLD = EnumHelper.addToolMaterial("material_gold", 7, 1000, 16.0F, 4.3F, 14);
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 8, 1500, 20.0F, 5.0F, 12);
	public static final ToolMaterial MATERIAL_JADE = EnumHelper.addToolMaterial("material_jade", 9, 200, 18.0F, 4.0F, 5);
	public static final ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 10, 100, 4.0F, 4.0F, 6);
	public static final ToolMaterial MATERIAL_ES = EnumHelper.addToolMaterial("material_es", 9, 2000, 30.0F, 9.0F, 6);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 10, 25, 30.0F, 7.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD1 = EnumHelper.addToolMaterial("material_emerald1", 10, 50, 36.0F, 8.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD2 = EnumHelper.addToolMaterial("material_emerald2", 10, 100, 43.0F, 9.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD3 = EnumHelper.addToolMaterial("material_emerald3", 10, 200, 52.0F, 10.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD4 = EnumHelper.addToolMaterial("material_emerald4", 10, 400, 62.0F, 11.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD5 = EnumHelper.addToolMaterial("material_emerald5", 10, 800, 75.0F, 12.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD6 = EnumHelper.addToolMaterial("material_emerald6", 10, 1600, 90.0F, 13.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 11, 30, 45.0F, 12.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE1 = EnumHelper.addToolMaterial("material_sapphire1", 11, 60, 54.0F, 13.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE2 = EnumHelper.addToolMaterial("material_sapphire2", 11, 120, 65.0F, 14.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE3 = EnumHelper.addToolMaterial("material_sapphire3", 11, 240, 78.0F, 15.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE4 = EnumHelper.addToolMaterial("material_sapphire4", 11, 480, 93.0F, 16.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE5 = EnumHelper.addToolMaterial("material_sapphire5", 11, 960, 112.0F, 17.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE6 = EnumHelper.addToolMaterial("material_sapphire6", 11, 1920, 134.0F, 18.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 12, 36, 68.0F, 17.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY1 = EnumHelper.addToolMaterial("material_ruby1", 11, 72, 81.0F, 18.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY2 = EnumHelper.addToolMaterial("material_ruby2", 11, 144, 97.0F, 19.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY3 = EnumHelper.addToolMaterial("material_ruby3", 11, 288, 117.0F, 20.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY4 = EnumHelper.addToolMaterial("material_ruby4", 11, 576, 140.0F, 21.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY5 = EnumHelper.addToolMaterial("material_ruby5", 11, 1152, 168.0F, 22.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY6 = EnumHelper.addToolMaterial("material_ruby6", 11, 2304, 202.0F, 23.0F, 10);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 12, 100, 300.0F, 50.0F, 4);
	public static final ToolMaterial MATERIAL_DIAMOND = EnumHelper.addToolMaterial("material_diamond", 13, 72, 101.0F, 22.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND1 = EnumHelper.addToolMaterial("material_diamond1", 13, 144, 122.0F, 23.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND2 = EnumHelper.addToolMaterial("material_diamond2", 13, 288, 146.0F, 24.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND3 = EnumHelper.addToolMaterial("material_diamond3", 13, 576, 175.0F, 25.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND4 = EnumHelper.addToolMaterial("material_diamond4", 13, 1152, 210.0F, 26.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND5 = EnumHelper.addToolMaterial("material_diamond5", 13, 2304, 252.0F, 27.0F, 6);
	static final ToolMaterial MATERIAL_DIAMOND6 = EnumHelper.addToolMaterial("material_diamond6", 13, 4608, 302.0F, 28.0F, 6);
	public static final ToolMaterial MATERIAL_AMAZONITE = EnumHelper.addToolMaterial("material_amazonite", 14, 100, 200.0F, 27.0F, 5);
	public static final ToolMaterial MATERIAL_DEMON = EnumHelper.addToolMaterial("material_demon", 10, 1000, 25.0F, 15F, 5);
	public static final ToolMaterial MATERIAL_CORE = EnumHelper.addToolMaterial("material_core", 12, 0, 1000.0F, 500F, 5);
	public static final ToolMaterial MATERIAL_ONYX = EnumHelper.addToolMaterial("material_onyx", 15, 100, 300.0F, 32.0F, 4);
	public static final ToolMaterial MATERIAL_AZURITE = EnumHelper.addToolMaterial("material_azurite", 15, 100, 1000.0F, 100.0F, 4);
	
	
	//ARMOR MATERIAL (name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_BRONZE= EnumHelper.addArmorMaterial("armor_material_bronze", Reference.MOD_ID + ":bronze", 8,
			new int[] {2, 4, 3, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_IRON = EnumHelper.addArmorMaterial("armor_material_iron", Reference.MOD_ID + ":iron", 15,
			new int[] {3, 5, 4, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 30,
			new int[] {4, 6, 5, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MOD_ID + ":silver", 12,
			new int[] {4, 7, 6, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_GOLD = EnumHelper.addArmorMaterial("armor_material_gold", Reference.MOD_ID + ":gold", 45,
			new int[] {4, 7, 6, 4}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MOD_ID + ":platinum", 56,
			new int[] {5, 7, 6, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 5,
			new int[] {5, 8, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD1 = EnumHelper.addArmorMaterial("armor_material_emerald1", Reference.MOD_ID + ":emerald1", 10,
			new int[] {5, 8, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD2 = EnumHelper.addArmorMaterial("armor_material_emerald2", Reference.MOD_ID + ":emerald2", 20,
			new int[] {5, 9, 8, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD3 = EnumHelper.addArmorMaterial("armor_material_emerald3", Reference.MOD_ID + ":emerald3", 40,
			new int[] {6, 9, 8, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD4 = EnumHelper.addArmorMaterial("armor_material_emerald4", Reference.MOD_ID + ":emerald4", 80,
			new int[] {6, 9, 8, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD5 = EnumHelper.addArmorMaterial("armor_material_emerald5", Reference.MOD_ID + ":emerald5", 160,
			new int[] {6, 10, 8, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD6 = EnumHelper.addArmorMaterial("armor_material_emerald6", Reference.MOD_ID + ":emerald6", 320,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 6,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE1 = EnumHelper.addArmorMaterial("armor_material_sapphire1", Reference.MOD_ID + ":sapphire1", 12,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE2 = EnumHelper.addArmorMaterial("armor_material_sapphire2", Reference.MOD_ID + ":sapphire2", 24,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE3 = EnumHelper.addArmorMaterial("armor_material_sapphire3", Reference.MOD_ID + ":sapphire3", 48,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE4 = EnumHelper.addArmorMaterial("armor_material_sapphire4", Reference.MOD_ID + ":sapphire4", 96,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE5 = EnumHelper.addArmorMaterial("armor_material_sapphire5", Reference.MOD_ID + ":sapphire5", 192,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE6 = EnumHelper.addArmorMaterial("armor_material_sapphire6", Reference.MOD_ID + ":sapphire6", 384,
			new int[] {6, 10, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 9.5F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 7,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY1 = EnumHelper.addArmorMaterial("armor_material_ruby1", Reference.MOD_ID + ":ruby1", 14,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY2 = EnumHelper.addArmorMaterial("armor_material_ruby2", Reference.MOD_ID + ":ruby2", 28,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 11.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY3 = EnumHelper.addArmorMaterial("armor_material_ruby3", Reference.MOD_ID + ":ruby3", 56,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 11.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY4 = EnumHelper.addArmorMaterial("armor_material_ruby4", Reference.MOD_ID + ":ruby4", 112,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 12.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY5 = EnumHelper.addArmorMaterial("armor_material_ruby5", Reference.MOD_ID + ":ruby5", 224,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 12.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY6 = EnumHelper.addArmorMaterial("armor_material_ruby6", Reference.MOD_ID + ":ruby6", 448,
			new int[] {7, 12, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 13.5F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND = EnumHelper.addArmorMaterial("armor_material_diamond", Reference.MOD_ID + ":diamond", 14,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 13.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND1 = EnumHelper.addArmorMaterial("armor_material_diamond1", Reference.MOD_ID + ":diamond", 28,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 14.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND2 = EnumHelper.addArmorMaterial("armor_material_diamond2", Reference.MOD_ID + ":diamond", 56,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 14.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND3 = EnumHelper.addArmorMaterial("armor_material_diamond3", Reference.MOD_ID + ":diamond", 112,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND4 = EnumHelper.addArmorMaterial("armor_material_diamond4", Reference.MOD_ID + ":diamond", 224,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15.5F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND5 = EnumHelper.addArmorMaterial("armor_material_diamond5", Reference.MOD_ID + ":diamond", 448,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 16.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND6 = EnumHelper.addArmorMaterial("armor_material_diamond6", Reference.MOD_ID + ":diamond", 896,
			new int[] {8, 14, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 17.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_AMAZONITE = EnumHelper.addArmorMaterial("armor_material_amazonite", Reference.MOD_ID + ":amazonite", 250,
			new int[] {6, 12, 9, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_ONYX = EnumHelper.addArmorMaterial("armor_material_onyx", Reference.MOD_ID + ":onyx", 312,
			new int[] {7, 14, 10, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	
	
	
//TOOLS

	//BRONZE//
	public static final ItemSword BRONZE_SWORD = new ToolSword("bronze_sword", MATERIAL_BRONZE);
	public static final ItemSpade BRONZE_SHOVEL = new ToolSpade("bronze_shovel", MATERIAL_BRONZE);
	public static final ItemPickaxe BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", MATERIAL_BRONZE);
	public static final ItemAxe BRONZE_AXE = new ToolAxe("bronze_axe", MATERIAL_BRONZE);
	public static final ItemHoe BRONZE_HOE = new ToolHoe("bronze_hoe", MATERIAL_BRONZE);

	public static final Item BRONZE_HELMET = new ArmorBase("bronze_helmet", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmorBase("bronze_chestplate", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmorBase("bronze_leggings", ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmorBase("bronze_boots", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET);

	//IRON//
	public static final ItemSword IRON_SWORD = new ToolSword("iron_sword", MATERIAL_IRON);
	public static final ItemSpade IRON_SHOVEL = new ToolSpade("iron_shovel", MATERIAL_IRON);
	public static final ItemPickaxe IRON_PICKAXE = new ToolPickaxe("iron_pickaxe", MATERIAL_IRON);
	public static final ItemAxe IRON_AXE = new ToolAxe("iron_axe", MATERIAL_IRON);
	public static final ItemHoe IRON_HOE = new ToolHoe("iron_hoe", MATERIAL_IRON);
	
	public static final Item IRON_HELMET = new ArmorBase("iron_helmet", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item IRON_CHESTPLATE = new ArmorBase("iron_chestplate", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item IRON_LEGGINGS = new ArmorBase("iron_leggings", ARMOR_MATERIAL_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item IRON_BOOTS = new ArmorBase("iron_boots", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.FEET);
	
	//STEEL//

	
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	//SILVER//

	
	public static final ItemSword SILVER_SWORD = new ToolSword("silver_sword", MATERIAL_SILVER);
	public static final ItemSpade SILVER_SHOVEL = new ToolSpade("silver_shovel", MATERIAL_SILVER);
	public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
	public static final ItemAxe SILVER_AXE = new ToolAxe("silver_axe", MATERIAL_SILVER);
	public static final ItemHoe SILVER_HOE = new ToolHoe("silver_hoe", MATERIAL_SILVER);
	
	public static final Item SILVER_HELMET = new SilverHelmet("silver_helmet", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new SilverBody("silver_chestplate", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new SilverLegs("silver_leggings", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new SilverBoots("silver_boots", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	
	//GOLD//

	
	public static final ItemSword GOLD_SWORD = new ToolSword("gold_sword", MATERIAL_GOLD);
	public static final ItemSpade GOLD_SHOVEL = new ToolSpade("gold_shovel", MATERIAL_GOLD);
	public static final ItemPickaxe GOLD_PICKAXE = new ToolPickaxe("gold_pickaxe", MATERIAL_GOLD);
	public static final ItemAxe GOLD_AXE = new ToolAxe("gold_axe", MATERIAL_GOLD);
	public static final ItemHoe GOLD_HOE = new ToolHoe("gold_hoe", MATERIAL_GOLD);
	
	public static final Item GOLD_HELMET = new GoldHelmet("gold_helmet", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.HEAD);
	public static final Item GOLD_CHESTPLATE = new GoldBody("gold_chestplate", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.CHEST);
	public static final Item GOLD_LEGGINGS = new GoldLegs("gold_leggings", ARMOR_MATERIAL_GOLD, 2, EntityEquipmentSlot.LEGS);
	public static final Item GOLD_BOOTS = new GoldBoots("gold_boots", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.FEET);
	
	//PLATINUM//

	
	public static final ItemSword PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	public static final ItemSpade PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
	public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
	public static final ItemAxe PLATINUM_AXE = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
	public static final ItemHoe PLATINUM_HOE = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
	
	public static final Item PLATINUM_HELMET = new PlatinumHelmet("platinum_helmet", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new PlatinumBody("platinum_chestplate", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGGINGS = new PlatinumLegs("platinum_leggings", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new PlatinumBoots("platinum_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
	//EMERALD//

	
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);



	
	public static final Item EMERALD_HELMET = new EmeraldHelmet("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new EmeraldBody("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new EmeraldLegs("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new EmeraldBoots("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);

	//EMERALD+1//

	public static final ItemSword EMERALD_SWORD1 = new ToolSword("emerald_sword1", MATERIAL_EMERALD1);
	public static final ItemSpade EMERALD_SHOVEL1 = new ToolSpade("emerald_shovel1", MATERIAL_EMERALD1);
	public static final ItemPickaxe EMERALD_PICKAXE1 = new ToolPickaxe("emerald_pickaxe1", MATERIAL_EMERALD1);
	public static final ItemAxe EMERALD_AXE1 = new ToolAxe("emerald_axe1", MATERIAL_EMERALD1);


	public static final Item EMERALD_HELMET1 = new EmeraldHelmet1("emerald_helmet1", ARMOR_MATERIAL_EMERALD1, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE1 = new EmeraldBody1("emerald_chestplate1", ARMOR_MATERIAL_EMERALD1, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS1 = new EmeraldLegs1("emerald_leggings1", ARMOR_MATERIAL_EMERALD1, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS1 = new EmeraldBoots1("emerald_boots1", ARMOR_MATERIAL_EMERALD1, 1, EntityEquipmentSlot.FEET);

	//EMERALD+2//

	public static final ItemSword EMERALD_SWORD2 = new ToolSword("emerald_sword2", MATERIAL_EMERALD2);
	public static final ItemSpade EMERALD_SHOVEL2 = new ToolSpade("emerald_shovel2", MATERIAL_EMERALD2);
	public static final ItemPickaxe EMERALD_PICKAXE2 = new ToolPickaxe("emerald_pickaxe2", MATERIAL_EMERALD2);
	public static final ItemAxe EMERALD_AXE2 = new ToolAxe("emerald_axe2", MATERIAL_EMERALD2);


	public static final Item EMERALD_HELMET2 = new EmeraldHelmet2("emerald_helmet2", ARMOR_MATERIAL_EMERALD2, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE2 = new EmeraldBody2("emerald_chestplate2", ARMOR_MATERIAL_EMERALD2, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS2 = new EmeraldLegs2("emerald_leggings2", ARMOR_MATERIAL_EMERALD2, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS2 = new EmeraldBoots2("emerald_boots2", ARMOR_MATERIAL_EMERALD2, 1, EntityEquipmentSlot.FEET);

	//EMERALD+3//

	public static final ItemSword EMERALD_SWORD3 = new ToolSword("emerald_sword3", MATERIAL_EMERALD3);
	public static final ItemSpade EMERALD_SHOVEL3 = new ToolSpade("emerald_shovel3", MATERIAL_EMERALD3);
	public static final ItemPickaxe EMERALD_PICKAXE3 = new ToolPickaxe("emerald_pickaxe3", MATERIAL_EMERALD3);
	public static final ItemAxe EMERALD_AXE3 = new ToolAxe("emerald_axe3", MATERIAL_EMERALD3);


	public static final Item EMERALD_HELMET3 = new EmeraldHelmet3("emerald_helmet3", ARMOR_MATERIAL_EMERALD3, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE3 = new EmeraldBody3("emerald_chestplate3", ARMOR_MATERIAL_EMERALD3, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS3 = new EmeraldLegs3("emerald_leggings3", ARMOR_MATERIAL_EMERALD3, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS3 = new EmeraldBoots3("emerald_boots3", ARMOR_MATERIAL_EMERALD3, 1, EntityEquipmentSlot.FEET);

	//EMERALD+4//

	public static final ItemSword EMERALD_SWORD4 = new ToolSword("emerald_sword4", MATERIAL_EMERALD4);
	public static final ItemSpade EMERALD_SHOVEL4 = new ToolSpade("emerald_shovel4", MATERIAL_EMERALD4);
	public static final ItemPickaxe EMERALD_PICKAXE4 = new ToolPickaxe("emerald_pickaxe4", MATERIAL_EMERALD4);
	public static final ItemAxe EMERALD_AXE4 = new ToolAxe("emerald_axe4", MATERIAL_EMERALD4);


	public static final Item EMERALD_HELMET4 = new EmeraldHelmet4("emerald_helmet4", ARMOR_MATERIAL_EMERALD4, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE4 = new EmeraldBody4("emerald_chestplate4", ARMOR_MATERIAL_EMERALD4, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS4 = new EmeraldLegs4("emerald_leggings4", ARMOR_MATERIAL_EMERALD4, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS4 = new EmeraldBoots4("emerald_boots4", ARMOR_MATERIAL_EMERALD4, 1, EntityEquipmentSlot.FEET);

	//EMERALD+5//

	public static final ItemSword EMERALD_SWORD5 = new ToolSword("emerald_sword5", MATERIAL_EMERALD5);
	public static final ItemSpade EMERALD_SHOVEL5 = new ToolSpade("emerald_shovel5", MATERIAL_EMERALD5);
	public static final ItemPickaxe EMERALD_PICKAXE5 = new ToolPickaxe("emerald_pickaxe5", MATERIAL_EMERALD5);
	public static final ItemAxe EMERALD_AXE5 = new ToolAxe("emerald_axe5", MATERIAL_EMERALD5);


	public static final Item EMERALD_HELMET5 = new EmeraldHelmet5("emerald_helmet5", ARMOR_MATERIAL_EMERALD5, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE5 = new EmeraldBody5("emerald_chestplate5", ARMOR_MATERIAL_EMERALD5, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS5 = new EmeraldLegs5("emerald_leggings5", ARMOR_MATERIAL_EMERALD5, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS5 = new EmeraldBoots5("emerald_boots5", ARMOR_MATERIAL_EMERALD5, 1, EntityEquipmentSlot.FEET);

	//ULTIMATE EMERALD//

	public static final ItemSword EMERALD_SWORD6 = new ToolSword("emerald_sword6", MATERIAL_EMERALD6);
	public static final ItemSpade EMERALD_SHOVEL6 = new ToolSpade("emerald_shovel6", MATERIAL_EMERALD6);
	public static final ItemPickaxe EMERALD_PICKAXE6 = new ToolPickaxe("emerald_pickaxe6", MATERIAL_EMERALD6);
	public static final ItemAxe EMERALD_AXE6 = new ToolAxe("emerald_axe6", MATERIAL_EMERALD6);


	public static final Item EMERALD_HELMET6 = new EmeraldHelmet6("emerald_helmet6", ARMOR_MATERIAL_EMERALD6, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE6 = new EmeraldBody6("emerald_chestplate6", ARMOR_MATERIAL_EMERALD6, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS6 = new EmeraldLegs6("emerald_leggings6", ARMOR_MATERIAL_EMERALD6, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS6 = new EmeraldBoots6("emerald_boots6", ARMOR_MATERIAL_EMERALD6, 1, EntityEquipmentSlot.FEET);

	//SAPPHIRE//


	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);

	public static final Item SAPPHIRE_HELMET = new SapphirHelmet("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new SapphirBody("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new SapphirLegs("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new SapphirBoots("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD1 = new ToolSword("sapphire_sword1", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL1 = new ToolSpade("sapphire_shovel1", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE1 = new ToolPickaxe("sapphire_pickaxe1", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE1 = new ToolAxe("sapphire_axe1", MATERIAL_SAPPHIRE);

	public static final Item SAPPHIRE_HELMET1 = new SapphirHelmet1("sapphire_helmet1", ARMOR_MATERIAL_SAPPHIRE1, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE1 = new SapphirBody1("sapphire_chestplate1", ARMOR_MATERIAL_SAPPHIRE1, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS1 = new SapphirLegs1("sapphire_leggings1", ARMOR_MATERIAL_SAPPHIRE1, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS1 = new SapphirBoots1("sapphire_boots1", ARMOR_MATERIAL_SAPPHIRE1, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD2 = new ToolSword("sapphire_sword2", MATERIAL_SAPPHIRE2);
	public static final ItemSpade SAPPHIRE_SHOVEL2 = new ToolSpade("sapphire_shovel2", MATERIAL_SAPPHIRE2);
	public static final ItemPickaxe SAPPHIRE_PICKAXE2 = new ToolPickaxe("sapphire_pickaxe2", MATERIAL_SAPPHIRE2);
	public static final ItemAxe SAPPHIRE_AXE2 = new ToolAxe("sapphire_axe2", MATERIAL_SAPPHIRE2);

	public static final Item SAPPHIRE_HELMET2 = new SapphirHelmet2("sapphire_helmet2", ARMOR_MATERIAL_SAPPHIRE2, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE2 = new SapphirBody2("sapphire_chestplate2", ARMOR_MATERIAL_SAPPHIRE2, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS2 = new SapphirLegs2("sapphire_leggings2", ARMOR_MATERIAL_SAPPHIRE2, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS2 = new SapphirBoots2("sapphire_boots2", ARMOR_MATERIAL_SAPPHIRE2, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD3 = new ToolSword("sapphire_sword3", MATERIAL_SAPPHIRE3);
	public static final ItemSpade SAPPHIRE_SHOVEL3 = new ToolSpade("sapphire_shovel3", MATERIAL_SAPPHIRE3);
	public static final ItemPickaxe SAPPHIRE_PICKAXE3 = new ToolPickaxe("sapphire_pickaxe3", MATERIAL_SAPPHIRE3);
	public static final ItemAxe SAPPHIRE_AXE3 = new ToolAxe("sapphire_axe3", MATERIAL_SAPPHIRE3);

	public static final Item SAPPHIRE_HELMET3 = new SapphirHelmet3("sapphire_helmet3", ARMOR_MATERIAL_SAPPHIRE3, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE3 = new SapphirBody3("sapphire_chestplate3", ARMOR_MATERIAL_SAPPHIRE3, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS3 = new SapphirLegs3("sapphire_leggings3", ARMOR_MATERIAL_SAPPHIRE3, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS3 = new SapphirBoots3("sapphire_boots3", ARMOR_MATERIAL_SAPPHIRE3, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD4 = new ToolSword("sapphire_sword4", MATERIAL_SAPPHIRE4);
	public static final ItemSpade SAPPHIRE_SHOVEL4 = new ToolSpade("sapphire_shovel4", MATERIAL_SAPPHIRE4);
	public static final ItemPickaxe SAPPHIRE_PICKAXE4 = new ToolPickaxe("sapphire_pickaxe4", MATERIAL_SAPPHIRE4);
	public static final ItemAxe SAPPHIRE_AXE4 = new ToolAxe("sapphire_axe4", MATERIAL_SAPPHIRE4);

	public static final Item SAPPHIRE_HELMET4 = new SapphirHelmet4("sapphire_helmet4", ARMOR_MATERIAL_SAPPHIRE4, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE4 = new SapphirBody4("sapphire_chestplate4", ARMOR_MATERIAL_SAPPHIRE4, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS4 = new SapphirLegs4("sapphire_leggings4", ARMOR_MATERIAL_SAPPHIRE4, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS4 = new SapphirBoots4("sapphire_boots4", ARMOR_MATERIAL_SAPPHIRE4, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD5 = new ToolSword("sapphire_sword5", MATERIAL_SAPPHIRE5);
	public static final ItemSpade SAPPHIRE_SHOVEL5 = new ToolSpade("sapphire_shovel5", MATERIAL_SAPPHIRE5);
	public static final ItemPickaxe SAPPHIRE_PICKAXE5 = new ToolPickaxe("sapphire_pickaxe5", MATERIAL_SAPPHIRE5);
	public static final ItemAxe SAPPHIRE_AXE5 = new ToolAxe("sapphire_axe5", MATERIAL_SAPPHIRE5);

	public static final Item SAPPHIRE_HELMET5 = new SapphirHelmet5("sapphire_helmet5", ARMOR_MATERIAL_SAPPHIRE5, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE5 = new SapphirBody5("sapphire_chestplate5", ARMOR_MATERIAL_SAPPHIRE5, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS5 = new SapphirLegs5("sapphire_leggings5", ARMOR_MATERIAL_SAPPHIRE5, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS5 = new SapphirBoots5("sapphire_boots5", ARMOR_MATERIAL_SAPPHIRE5, 1, EntityEquipmentSlot.FEET);

	public static final ItemSword SAPPHIRE_SWORD6 = new ToolSword("sapphire_sword6", MATERIAL_SAPPHIRE6);
	public static final ItemSpade SAPPHIRE_SHOVEL6 = new ToolSpade("sapphire_shovel6", MATERIAL_SAPPHIRE6);
	public static final ItemPickaxe SAPPHIRE_PICKAXE6 = new ToolPickaxe("sapphire_pickaxe6", MATERIAL_SAPPHIRE6);
	public static final ItemAxe SAPPHIRE_AXE6 = new ToolAxe("sapphire_axe6", MATERIAL_SAPPHIRE6);

	public static final Item SAPPHIRE_HELMET6 = new SapphirHelmet6("sapphire_helmet6", ARMOR_MATERIAL_SAPPHIRE6, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE6 = new SapphirBody6("sapphire_chestplate6", ARMOR_MATERIAL_SAPPHIRE6, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS6 = new SapphirLegs6("sapphire_leggings6", ARMOR_MATERIAL_SAPPHIRE6, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS6 = new SapphirBoots6("sapphire_boots6", ARMOR_MATERIAL_SAPPHIRE6, 1, EntityEquipmentSlot.FEET);
	//RUBY//

	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final Item RUBY_HELMET = new RubyHelmet("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new RubyBody("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new RubyLegs("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new RubyBoots("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	//TOPAZ//
	
	
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SHOVEL = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	
	//DIAMOND//

	
	public static final ItemSword DIAMOND_SWORD = new ToolSword("diamond_sword", MATERIAL_DIAMOND);
	public static final ItemSpade DIAMOND_SHOVEL = new ToolSpade("diamond_shovel", MATERIAL_DIAMOND);
	public static final ItemPickaxe DIAMOND_PICKAXE = new ToolPickaxe("diamond_pickaxe", MATERIAL_DIAMOND);
	public static final ItemAxe DIAMOND_AXE = new ToolAxe("diamond_axe", MATERIAL_DIAMOND);
	public static final ItemHoe DIAMOND_HOE = new ToolHoe("diamond_hoe", MATERIAL_DIAMOND);
	
	public static final Item DIAMOND_HELMET = new DiamondHelmet("diamond_helmet", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item DIAMOND_CHESTPLATE = new DiamondBody("diamond_chestplate", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item DIAMOND_LEGGINGS = new DiamondLegs("diamond_leggings", ARMOR_MATERIAL_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item DIAMOND_BOOTS = new DiamondBoots("diamond_boots", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.FEET);
	
	//JADE//
	
	
	public static final ItemSword JADE_SWORD = new ToolSword("jade_sword", MATERIAL_JADE);
	public static final ItemSpade JADE_SHOVEL = new ToolSpade("jade_shovel", MATERIAL_JADE);
	public static final ItemPickaxe JADE_PICKAXE = new ToolPickaxe("jade_pickaxe", MATERIAL_JADE);
	public static final ItemAxe JADE_AXE = new ToolAxe("jade_axe", MATERIAL_JADE);
	public static final ItemHoe JADE_HOE = new ToolHoe("jade_hoe", MATERIAL_JADE);
	
	//AMAZONITE//

	
	public static final ItemSword AMAZONITE_SWORD = new ToolSword("amazonite_sword", MATERIAL_AMAZONITE);
	public static final ItemSpade AMAZONITE_SHOVEL = new ToolSpade("amazonite_shovel", MATERIAL_AMAZONITE);
	public static final ItemPickaxe AMAZONITE_PICKAXE = new ToolPickaxe("amazonite_pickaxe", MATERIAL_AMAZONITE);
	public static final ItemAxe AMAZONITE_AXE = new ToolAxe("amazonite_axe", MATERIAL_AMAZONITE);
	public static final ItemHoe AMAZONITE_HOE = new ToolHoe("amazonite_hoe", MATERIAL_AMAZONITE);
	
	public static final Item AMAZONITE_HELMET = new AmazoniteHelmet("amazonite_helmet", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMAZONITE_CHESTPLATE = new AmazoniteBody("amazonite_chestplate", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMAZONITE_LEGGINGS = new AmazoniteLegs("amazonite_leggings", ARMOR_MATERIAL_AMAZONITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMAZONITE_BOOTS = new AmazoniteBoots("amazonite_boots", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.FEET);


	//AMETHYST//
	
	
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);

	
	//ONYX//

	public static final ItemSword ONYX_SWORD = new ToolSword("onyx_sword", MATERIAL_ONYX);
	public static final ItemSpade ONYX_SHOVEL = new ToolSpade("onyx_shovel", MATERIAL_ONYX);
	public static final ItemPickaxe ONYX_PICKAXE = new ToolPickaxe("onyx_pickaxe", MATERIAL_ONYX);
	public static final ItemAxe ONYX_AXE = new ToolAxe("onyx_axe", MATERIAL_ONYX);
 	public static final ItemHoe ONYX_HOE = new ToolHoe("onyx_hoe", MATERIAL_ONYX);

	public static final Item ONYX_HELMET = new OnyxHelmet("onyx_helmet", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.HEAD);
	public static final Item ONYX_CHESTPLATE = new OnyxBody("onyx_chestplate", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.CHEST);
	public static final Item ONYX_LEGGINGS = new OnyxLegs("onyx_leggings", ARMOR_MATERIAL_ONYX, 2, EntityEquipmentSlot.LEGS);
	public static final Item ONYX_BOOTS = new OnyxBoots("onyx_boots", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.FEET);

	
	//AZURITE//
	
	public static final ItemSword AZURITE_SWORD = new ToolSword("azurite_sword", MATERIAL_AZURITE);
	public static final ItemSpade AZURITE_SHOVEL = new ToolSpade("azurite_shovel", MATERIAL_AZURITE);
	public static final ItemPickaxe AZURITE_PICKAXE = new ToolPickaxe("azurite_pickaxe", MATERIAL_AZURITE);
	public static final ItemAxe AZURITE_AXE = new ToolAxe("azurite_axe", MATERIAL_AZURITE);
 	public static final ItemHoe AZURITE_HOE = new ToolHoe("azurite_hoe", MATERIAL_AZURITE);
	
	
	//DEMON//CORE//
	
	public static final ItemSword DEMON_SWORD = new ToolSword("demon_sword", MATERIAL_DEMON);
	public static final ItemSword CORE_SWORD = new ToolSword("core_sword", MATERIAL_CORE);
	
	

	//GEMS//
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item DIAMOND = new ItemBase("diamond");
	public static final Item JADE = new ItemBase("jade");
	public static final Item AMAZONITE = new Gems("amazonite");
	public static final Item AMETHYST = new Gems("amethyst");
	public static final Item ONYX = new Gems("onyx");
	public static final Item AZURITE = new Gems("azurite");
	
	//ROD//
	public static final Item EMERALD_ROD = new ItemBase("emerald_rod");
	public static final Item SAPPHIRE_ROD = new ItemBase("sapphire_rod");
	public static final Item RUBY_ROD = new ItemBase("ruby_rod");
	public static final Item TOPAZ_ROD = new ItemBase("topaz_rod");
	public static final Item DIAMOND_ROD = new ItemBase("diamond_rod");
	public static final Item JADE_ROD = new ItemBase("jade_rod");
	public static final Item AMAZONITE_ROD = new Gems("amazonite_rod");
	public static final Item AMETHYST_ROD = new Gems("amethyst_rod");
	public static final Item ONYX_ROD = new Gems("onyx_rod");
	public static final Item AZURITE_ROD = new Gems("azurite_rod");
	
	//Ingot//
	public static final Item IRON_INGOT = new ItemBase("iron_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item GOLD_INGOT = new ItemBase("gold_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");

	public static final Item IRON_COAL = new ItemBase("iron_coal");
	public static final Item SULFUR = new ItemBase("sulfur");
	
	public static final Item IRON_NUGGET = new ItemBase("iron_nugget");
	public static final Item STEEL_NUGGET = new ItemBase("steel_nugget");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item GOLD_NUGGET = new ItemBase("gold_nugget");
	public static final Item PLATINUM_NUGGET = new ItemBase("platinum_nugget");
	
	public static final Item DEMON_STAR = new ItemBase("demon_star");
	public static final Item DEMON_STAR_CHARGED = new Gems("demon_star_charged");
	public static final Item CORE_STAR = new ItemBase("core_star");
	public static final Item ENHANCING_GEM = new ItemBase("enhancing_gem");

	public static final Item PLATINUM_APPLE = new FoodEffectBase("platinum_apple", 10, 3.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 6000,4, false, false),
			new PotionEffect(MobEffects.REGENERATION, 400,2, false, false),
			new PotionEffect(MobEffects.STRENGTH, 3000,0, false, false));

	public static final Item ENCHANTED_PLATINUM_APPLE = new EnchantedFoodEffectBase("enchanted_platinum_apple", 10, 3.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 6000,4, false, false),
			new PotionEffect(MobEffects.REGENERATION, 800,2, false, false),
			new PotionEffect(MobEffects.STRENGTH, 3000,1, false, false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000,1, false, false),
			new PotionEffect(MobEffects.RESISTANCE, 6000,1, false, false),
			new PotionEffect(MobEffects.GLOWING, 3000,0, false, false));

	public static final Item SAPPHIRE_APPLE = new EnchantedFoodEffectBase("sapphire_apple", 15, 6.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 12000,8, false, false),
			new PotionEffect(MobEffects.REGENERATION, 1200,3, false, false),
			new PotionEffect(MobEffects.STRENGTH, 6000,1, false, false),
			new PotionEffect(MobEffects.SPEED, 6000,0, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 6000,0, false, false),
			new PotionEffect(MobEffects.GLOWING, 3000,0, false, false));


	public static final Item ENCHANTED_SAPPHIRE_APPLE = new EnchantedFoodEffectBase1("enchanted_sapphire_apple", 15, 6.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 12000,8, false, false),
			new PotionEffect(MobEffects.REGENERATION, 1200,3, false, false),
			new PotionEffect(MobEffects.STRENGTH, 6000,2, false, false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000,2, false, false),
			new PotionEffect(MobEffects.RESISTANCE, 6000,2, false, false),
			new PotionEffect(MobEffects.SPEED, 6000,1, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 6000,1, false, false),
			new PotionEffect(MobEffects.GLOWING, 6000,0, false, false));

	public static final Item RUBY_APPLE = new EnchantedFoodEffectBase("ruby_apple", 20, 12.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 12000,12, false, false),
			new PotionEffect(MobEffects.REGENERATION, 3000,4, false, false),
			new PotionEffect(MobEffects.STRENGTH, 6000,2, false, false),
			new PotionEffect(MobEffects.SPEED, 6000,1, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 6000,1, false, false),
			new PotionEffect(MobEffects.GLOWING, 6000,0, false, false));


	public static final Item ENCHANTED_RUBY_APPLE = new EnchantedFoodEffectBase1("enchanted_ruby_apple", 20, 12.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 12000,12, false, false),
			new PotionEffect(MobEffects.REGENERATION, 3000,4, false, false),
			new PotionEffect(MobEffects.STRENGTH, 6000,3, false, false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000,2, false, false),
			new PotionEffect(MobEffects.RESISTANCE, 6000,2, false, false),
			new PotionEffect(MobEffects.SPEED, 6000,2, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 6000,2, false, false),
			new PotionEffect(MobEffects.GLOWING, 6000,0, false, false));

	public static final Item DIAMOND_APPLE = new EnchantedFoodEffectBase("diamond_apple", 20, 24.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 24000,16, false, false),
			new PotionEffect(MobEffects.REGENERATION, 6000,4, false, false),
			new PotionEffect(MobEffects.SPEED, 6000,2, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 6000,2, false, false),
			new PotionEffect(MobEffects.STRENGTH, 6000,4, false, false),
			new PotionEffect(MobEffects.GLOWING, 6000,0, false, false));

	public static final Item ENCHANTED_DIAMOND_APPLE = new EnchantedFoodEffectBase1("enchanted_diamond_apple", 20, 24.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 24000,16, false, false),
			new PotionEffect(MobEffects.REGENERATION, 12000,4, false, false),
			new PotionEffect(MobEffects.STRENGTH, 12000,5, false, false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 12000,2, false, false),
			new PotionEffect(MobEffects.RESISTANCE, 12000,2, false, false),
			new PotionEffect(MobEffects.SPEED, 12000,3, false, false),
			new PotionEffect(MobEffects.JUMP_BOOST, 12000,3, false, false),
			new PotionEffect(MobEffects.GLOWING, 12000,0, false, false));

//SHIELDS
	public static final Item IRON_SHIELD = new IronShield("iron_shield");
	public static final Item STEEL_SHIELD = new SteelShield("steel_shield");
	public static final Item SILVER_SHIELD = new SilverShield("silver_shield");
	public static final Item GOLD_SHIELD = new GoldShield("gold_shield");
	public static final Item PLATINUM_SHIELD = new PlatinumShield("platinum_shield");
	public static final Item SAPPHIRE_SHIELD = new SapphireShield("sapphire_shield");
	public static final Item RUBY_SHIELD = new RubyShield("ruby_shield");
	public static final Item DIAMOND_SHIELD = new DiamondShield("diamond_shield");
	public static final Item AMAZONITE_SHIELD = new AmazoniteShield("amazonite_shield");
	public static final Item ONYX_SHIELD = new OnyxShield("onyx_shield");



}