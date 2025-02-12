package ru.betterend.registry;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.betterend.BetterEnd;
import ru.betterend.blocks.AeterniumBlock;
import ru.betterend.blocks.AuroraCrystalBlock;
import ru.betterend.blocks.BlockAmber;
import ru.betterend.blocks.BlockAncientEmeraldIce;
import ru.betterend.blocks.BlockBlueVine;
import ru.betterend.blocks.BlockBlueVineLantern;
import ru.betterend.blocks.BlockBlueVineSeed;
import ru.betterend.blocks.BlockBrimstone;
import ru.betterend.blocks.BlockBubbleCoral;
import ru.betterend.blocks.BlockBulbVine;
import ru.betterend.blocks.BlockBulbVineSeed;
import ru.betterend.blocks.BlockCharnia;
import ru.betterend.blocks.BlockChorusGrass;
import ru.betterend.blocks.BlockDenseEmeraldIce;
import ru.betterend.blocks.BlockDenseSnow;
import ru.betterend.blocks.BlockDragonTreeSapling;
import ru.betterend.blocks.BlockEmeraldIce;
import ru.betterend.blocks.BlockEndLily;
import ru.betterend.blocks.BlockEndLilySeed;
import ru.betterend.blocks.BlockEndLotusFlower;
import ru.betterend.blocks.BlockEndLotusLeaf;
import ru.betterend.blocks.BlockEndLotusSeed;
import ru.betterend.blocks.BlockEndLotusStem;
import ru.betterend.blocks.BlockEndstoneDust;
import ru.betterend.blocks.BlockGlowingMoss;
import ru.betterend.blocks.BlockGlowingPillarLuminophor;
import ru.betterend.blocks.BlockGlowingPillarRoots;
import ru.betterend.blocks.BlockGlowingPillarSeed;
import ru.betterend.blocks.BlockHelixTreeLeaves;
import ru.betterend.blocks.BlockHelixTreeSapling;
import ru.betterend.blocks.BlockHydralux;
import ru.betterend.blocks.BlockHydraluxPetal;
import ru.betterend.blocks.BlockHydraluxPetalColored;
import ru.betterend.blocks.BlockHydraluxSapling;
import ru.betterend.blocks.BlockHydrothermalVent;
import ru.betterend.blocks.BlockJellyshroomCap;
import ru.betterend.blocks.BlockLacugroveSapling;
import ru.betterend.blocks.BlockLanceleaf;
import ru.betterend.blocks.BlockLanceleafSeed;
import ru.betterend.blocks.BlockMengerSponge;
import ru.betterend.blocks.BlockMengerSpongeWet;
import ru.betterend.blocks.BlockMossyGlowshroomCap;
import ru.betterend.blocks.BlockMossyGlowshroomHymenophore;
import ru.betterend.blocks.BlockMossyGlowshroomSapling;
import ru.betterend.blocks.BlockMurkweed;
import ru.betterend.blocks.BlockNeedlegrass;
import ru.betterend.blocks.BlockPath;
import ru.betterend.blocks.BlockPythadendronSapling;
import ru.betterend.blocks.BlockRespawnObelisk;
import ru.betterend.blocks.BlockShadowBerry;
import ru.betterend.blocks.BlockShadowGrass;
import ru.betterend.blocks.BlockSilkMothNest;
import ru.betterend.blocks.BlockSmallJellyshroom;
import ru.betterend.blocks.BlockSulphurCrystal;
import ru.betterend.blocks.BlockTenaneaFlowers;
import ru.betterend.blocks.BlockTenaneaSapling;
import ru.betterend.blocks.BlockTerrain;
import ru.betterend.blocks.BlockTerrainPlant;
import ru.betterend.blocks.BlockTwistedUmbrellaMoss;
import ru.betterend.blocks.BlockTwistedUmbrellaMossTall;
import ru.betterend.blocks.BlockUmbrellaMoss;
import ru.betterend.blocks.BlockUmbrellaMossTall;
import ru.betterend.blocks.BlockUmbrellaTreeCluster;
import ru.betterend.blocks.BlockUmbrellaTreeClusterEmpty;
import ru.betterend.blocks.BlockUmbrellaTreeMembrane;
import ru.betterend.blocks.BlockUmbrellaTreeSapling;
import ru.betterend.blocks.BlockVentBubbleColumn;
import ru.betterend.blocks.EndPortalBlock;
import ru.betterend.blocks.EndStoneSmelter;
import ru.betterend.blocks.EnderBlock;
import ru.betterend.blocks.EternalPedestal;
import ru.betterend.blocks.EternalRunedFlavolite;
import ru.betterend.blocks.InfusionPedestal;
import ru.betterend.blocks.PedestalVanilla;
import ru.betterend.blocks.RunedFlavolite;
import ru.betterend.blocks.TerminiteBlock;
import ru.betterend.blocks.basis.BlockBulbVineLantern;
import ru.betterend.blocks.basis.BlockBulbVineLanternColored;
import ru.betterend.blocks.basis.BlockFur;
import ru.betterend.blocks.basis.BlockLeaves;
import ru.betterend.blocks.basis.BlockOre;
import ru.betterend.blocks.basis.BlockSimpleLeaves;
import ru.betterend.blocks.basis.BlockStoneLantern;
import ru.betterend.blocks.basis.BlockUnderwaterWallPlant;
import ru.betterend.blocks.basis.BlockVine;
import ru.betterend.blocks.basis.BlockWallMushroom;
import ru.betterend.blocks.basis.BlockWallPlant;
import ru.betterend.blocks.complex.ColoredMaterial;
import ru.betterend.blocks.complex.StoneMaterial;
import ru.betterend.blocks.complex.WoodenMaterial;
import ru.betterend.config.Configs;

public class EndBlocks {
	// Terrain //
	public static final Block ENDSTONE_DUST = registerBlock("endstone_dust", new BlockEndstoneDust());
	public static final Block END_MYCELIUM = registerBlock("end_mycelium", new BlockTerrain(MaterialColor.LIGHT_BLUE));
	public static final Block END_MOSS = registerBlock("end_moss", new BlockTerrain(MaterialColor.CYAN));
	public static final Block CHORUS_NYLIUM = registerBlock("chorus_nylium", new BlockTerrain(MaterialColor.MAGENTA));
	public static final Block CAVE_MOSS = registerBlock("cave_moss", new BlockTerrain(MaterialColor.PURPLE));
	public static final Block CRYSTAL_MOSS = registerBlock("crystal_moss", new BlockTerrain(MaterialColor.PINK));
	public static final Block SHADOW_GRASS = registerBlock("shadow_grass", new BlockShadowGrass());
	public static final Block PINK_MOSS = registerBlock("pink_moss", new BlockTerrain(MaterialColor.PINK));
	public static final Block AMBER_MOSS = registerBlock("amber_moss", new BlockTerrain(MaterialColor.ORANGE));
	public static final Block JUNGLE_MOSS = registerBlock("jungle_moss", new BlockTerrain(MaterialColor.ORANGE));
	
	// Roads //
	public static final Block END_MYCELIUM_PATH = registerBlock("end_mycelium_path", new BlockPath(END_MYCELIUM));
	public static final Block END_MOSS_PATH = registerBlock("end_moss_path", new BlockPath(END_MOSS));
	public static final Block CHORUS_NYLIUM_PATH = registerBlock("chorus_nylium_path", new BlockPath(CHORUS_NYLIUM));
	public static final Block CAVE_MOSS_PATH = registerBlock("cave_moss_path", new BlockPath(CAVE_MOSS));
	public static final Block CRYSTAL_MOSS_PATH = registerBlock("crystal_moss_path", new BlockPath(CRYSTAL_MOSS));
	public static final Block SHADOW_GRASS_PATH = registerBlock("shadow_grass_path", new BlockPath(SHADOW_GRASS));
	public static final Block PINK_MOSS_PATH = registerBlock("pink_moss_path", new BlockPath(PINK_MOSS));
	public static final Block AMBER_MOSS_PATH = registerBlock("amber_moss_path", new BlockPath(AMBER_MOSS));
	public static final Block JUNGLE_MOSS_PATH = registerBlock("jungle_moss_path", new BlockPath(JUNGLE_MOSS));
	
	// Rocks //
	public static final StoneMaterial FLAVOLITE = new StoneMaterial("flavolite", MaterialColor.SAND);
	public static final StoneMaterial VIOLECITE = new StoneMaterial("violecite", MaterialColor.PURPLE);
	public static final StoneMaterial SULPHURIC_ROCK = new StoneMaterial("sulphuric_rock", MaterialColor.BROWN);
	public static final Block BRIMSTONE = registerBlock("brimstone", new BlockBrimstone());
	public static final Block SULPHUR_CRYSTAL = registerBlock("sulphur_crystal", new BlockSulphurCrystal());
	
	public static final Block FLAVOLITE_RUNED = registerBlock("flavolite_runed", new RunedFlavolite());
	public static final Block FLAVOLITE_RUNED_ETERNAL = registerBlock("flavolite_runed_eternal", new EternalRunedFlavolite());
	
	public static final Block ANDESITE_PEDESTAL = registerBlock("andesite_pedestal", new PedestalVanilla(Blocks.ANDESITE));
	public static final Block DIORITE_PEDESTAL = registerBlock("diorite_pedestal", new PedestalVanilla(Blocks.DIORITE));
	public static final Block GRANITE_PEDESTAL = registerBlock("granite_pedestal", new PedestalVanilla(Blocks.GRANITE));
	public static final Block QUARTZ_PEDESTAL = registerBlock("quartz_pedestal", new PedestalVanilla(Blocks.QUARTZ_BLOCK));
	public static final Block PURPUR_PEDESTAL = registerBlock("purpur_pedestal", new PedestalVanilla(Blocks.PURPUR_BLOCK));
	
	public static final Block HYDROTHERMAL_VENT = registerBlock("hydrothermal_vent", new BlockHydrothermalVent());
	public static final Block VENT_BUBBLE_COLUMN = registerBlockNI("vent_bubble_column", new BlockVentBubbleColumn());
	
	public static final Block DENSE_SNOW = registerBlock("dense_snow", new BlockDenseSnow());
	public static final Block EMERALD_ICE = registerBlock("emerald_ice", new BlockEmeraldIce());
	public static final Block DENSE_EMERALD_ICE = registerBlock("dense_emerald_ice", new BlockDenseEmeraldIce());
	public static final Block ANCIENT_EMERALD_ICE = registerBlock("ancient_emerald_ice", new BlockAncientEmeraldIce());
	
	// Wooden Materials And Trees //
	public static final Block MOSSY_GLOWSHROOM_SAPLING = registerBlock("mossy_glowshroom_sapling", new BlockMossyGlowshroomSapling());
	public static final Block MOSSY_GLOWSHROOM_CAP = registerBlock("mossy_glowshroom_cap", new BlockMossyGlowshroomCap());
	public static final Block MOSSY_GLOWSHROOM_HYMENOPHORE = registerBlock("mossy_glowshroom_hymenophore", new BlockMossyGlowshroomHymenophore());
	public static final Block MOSSY_GLOWSHROOM_FUR = registerBlock("mossy_glowshroom_fur", new BlockFur(MOSSY_GLOWSHROOM_SAPLING, 15, 16));
	public static final WoodenMaterial MOSSY_GLOWSHROOM = new WoodenMaterial("mossy_glowshroom", MaterialColor.GRAY, MaterialColor.WOOD);
	
	public static final Block PYTHADENDRON_SAPLING = registerBlock("pythadendron_sapling", new BlockPythadendronSapling());
	public static final Block PYTHADENDRON_LEAVES = registerBlock("pythadendron_leaves", new BlockLeaves(PYTHADENDRON_SAPLING, MaterialColor.MAGENTA));
	public static final WoodenMaterial PYTHADENDRON = new WoodenMaterial("pythadendron", MaterialColor.MAGENTA, MaterialColor.PURPLE);
	
	public static final Block END_LOTUS_SEED = registerBlock("end_lotus_seed", new BlockEndLotusSeed());
	public static final Block END_LOTUS_STEM = registerBlock("end_lotus_stem", new BlockEndLotusStem());
	public static final Block END_LOTUS_LEAF = registerBlockNI("end_lotus_leaf", new BlockEndLotusLeaf());
	public static final Block END_LOTUS_FLOWER = registerBlockNI("end_lotus_flower", new BlockEndLotusFlower());
	public static final WoodenMaterial END_LOTUS = new WoodenMaterial("end_lotus", MaterialColor.LIGHT_BLUE, MaterialColor.CYAN);
	
	public static final Block LACUGROVE_SAPLING = registerBlock("lacugrove_sapling", new BlockLacugroveSapling());
	public static final Block LACUGROVE_LEAVES = registerBlock("lacugrove_leaves", new BlockLeaves(LACUGROVE_SAPLING, MaterialColor.CYAN));
	public static final WoodenMaterial LACUGROVE = new WoodenMaterial("lacugrove", MaterialColor.BROWN, MaterialColor.YELLOW);
	
	public static final Block DRAGON_TREE_SAPLING = registerBlock("dragon_tree_sapling", new BlockDragonTreeSapling());
	public static final Block DRAGON_TREE_LEAVES = registerBlock("dragon_tree_leaves", new BlockLeaves(DRAGON_TREE_SAPLING, MaterialColor.MAGENTA));
	public static final WoodenMaterial DRAGON_TREE = new WoodenMaterial("dragon_tree", MaterialColor.BLACK, MaterialColor.MAGENTA);
	
	public static final Block TENANEA_SAPLING = registerBlock("tenanea_sapling", new BlockTenaneaSapling());
	public static final Block TENANEA_LEAVES = registerBlock("tenanea_leaves", new BlockLeaves(TENANEA_SAPLING, MaterialColor.PINK));
	public static final Block TENANEA_FLOWERS = registerBlock("tenanea_flowers", new BlockTenaneaFlowers());
	public static final Block TENANEA_OUTER_LEAVES = registerBlock("tenanea_outer_leaves", new BlockFur(TENANEA_SAPLING, 32));
	public static final WoodenMaterial TENANEA = new WoodenMaterial("tenanea", MaterialColor.BROWN, MaterialColor.PINK);
	
	public static final Block HELIX_TREE_SAPLING = registerBlock("helix_tree_sapling", new BlockHelixTreeSapling());
	public static final Block HELIX_TREE_LEAVES = registerBlock("helix_tree_leaves", new BlockHelixTreeLeaves());
	public static final WoodenMaterial HELIX_TREE = new WoodenMaterial("helix_tree", MaterialColor.GRAY, MaterialColor.ORANGE);
	
	public static final Block UMBRELLA_TREE_SAPLING = registerBlock("umbrella_tree_sapling", new BlockUmbrellaTreeSapling());
	public static final Block UMBRELLA_TREE_MEMBRANE = registerBlock("umbrella_tree_membrane", new BlockUmbrellaTreeMembrane());
	public static final Block UMBRELLA_TREE_CLUSTER = registerBlock("umbrella_tree_cluster", new BlockUmbrellaTreeCluster());
	public static final Block UMBRELLA_TREE_CLUSTER_EMPTY = registerBlock("umbrella_tree_cluster_empty", new BlockUmbrellaTreeClusterEmpty());
	public static final WoodenMaterial UMBRELLA_TREE = new WoodenMaterial("umbrella_tree", MaterialColor.BLUE, MaterialColor.GREEN);
	
	public static final Block JELLYSHROOM_CAP_PURPLE = registerBlock("jellyshroom_cap_purple", new BlockJellyshroomCap(217, 142, 255, 164, 0, 255));
	public static final WoodenMaterial JELLYSHROOM = new WoodenMaterial("jellyshroom", MaterialColor.PURPLE, MaterialColor.LIGHT_BLUE);
	
	// Small Plants //
	public static final Block UMBRELLA_MOSS = registerBlock("umbrella_moss", new BlockUmbrellaMoss());
	public static final Block UMBRELLA_MOSS_TALL = registerBlock("umbrella_moss_tall", new BlockUmbrellaMossTall());
	public static final Block CREEPING_MOSS = registerBlock("creeping_moss", new BlockGlowingMoss(11));
	public static final Block CHORUS_GRASS = registerBlock("chorus_grass", new BlockChorusGrass());
	public static final Block CAVE_GRASS = registerBlock("cave_grass", new BlockTerrainPlant(CAVE_MOSS));
	public static final Block CRYSTAL_GRASS = registerBlock("crystal_grass", new BlockTerrainPlant(CRYSTAL_MOSS));
	public static final Block SHADOW_PLANT = registerBlock("shadow_plant", new BlockTerrainPlant(SHADOW_GRASS));
	public static final Block BUSHY_GRASS = registerBlock("bushy_grass", new BlockTerrainPlant(PINK_MOSS));
	public static final Block AMBER_GRASS = registerBlock("amber_grass", new BlockTerrainPlant(AMBER_MOSS));
	public static final Block TWISTED_UMBRELLA_MOSS = registerBlock("twisted_umbrella_moss", new BlockTwistedUmbrellaMoss());
	public static final Block TWISTED_UMBRELLA_MOSS_TALL = registerBlock("twisted_umbrella_moss_tall", new BlockTwistedUmbrellaMossTall());
	public static final Block JUNGLE_GRASS = registerBlock("jungle_grass", new BlockTerrainPlant(JUNGLE_MOSS));
	
	public static final Block BLUE_VINE_SEED = registerBlock("blue_vine_seed", new BlockBlueVineSeed());
	public static final Block BLUE_VINE = registerBlockNI("blue_vine", new BlockBlueVine());
	public static final Block BLUE_VINE_LANTERN = registerBlock("blue_vine_lantern", new BlockBlueVineLantern());
	public static final Block BLUE_VINE_FUR = registerBlock("blue_vine_fur", new BlockFur(BLUE_VINE_SEED, 15, 3));
	
	public static final Block LANCELEAF_SEED = registerBlock("lanceleaf_seed", new BlockLanceleafSeed());
	public static final Block LANCELEAF = registerBlockNI("lanceleaf", new BlockLanceleaf());
	
	public static final Block GLOWING_PILLAR_SEED = registerBlock("glowing_pillar_seed", new BlockGlowingPillarSeed());
	public static final Block GLOWING_PILLAR_ROOTS = registerBlockNI("glowing_pillar_roots", new BlockGlowingPillarRoots());
	public static final Block GLOWING_PILLAR_LUMINOPHOR = registerBlock("glowing_pillar_luminophor", new BlockGlowingPillarLuminophor());
	public static final Block GLOWING_PILLAR_LEAVES = registerBlock("glowing_pillar_leaves", new BlockFur(GLOWING_PILLAR_SEED, 15, 3));
	
	public static final Block SMALL_JELLYSHROOM = registerBlock("small_jellyshroom", new BlockSmallJellyshroom());
	
	// Water plants
	public static final Block BUBBLE_CORAL = registerBlock("bubble_coral", new BlockBubbleCoral());
	public static final Block MENGER_SPONGE = registerBlock("menger_sponge", new BlockMengerSponge());
	public static final Block MENGER_SPONGE_WET = registerBlock("menger_sponge_wet", new BlockMengerSpongeWet());
	public static final Block CHARNIA_RED = registerBlock("charnia_red", new BlockCharnia());
	public static final Block CHARNIA_PURPLE = registerBlock("charnia_purple", new BlockCharnia());
	public static final Block CHARNIA_ORANGE = registerBlock("charnia_orange", new BlockCharnia());
	public static final Block CHARNIA_LIGHT_BLUE = registerBlock("charnia_light_blue", new BlockCharnia());
	public static final Block CHARNIA_CYAN = registerBlock("charnia_cyan", new BlockCharnia());
	public static final Block CHARNIA_GREEN = registerBlock("charnia_green", new BlockCharnia());
	
	public static final Block END_LILY = registerBlockNI("end_lily", new BlockEndLily());
	public static final Block END_LILY_SEED = registerBlock("end_lily_seed", new BlockEndLilySeed());
	
	public static final Block HYDRALUX_SAPLING = registerBlock("hydralux_sapling", new BlockHydraluxSapling());	
	public static final Block HYDRALUX = registerBlockNI("hydralux", new BlockHydralux());
	public static final Block HYDRALUX_PETAL_BLOCK = registerBlock("hydralux_petal_block", new BlockHydraluxPetal());
	public static final ColoredMaterial HYDRALUX_PETAL_BLOCK_COLORED = new ColoredMaterial(BlockHydraluxPetalColored::new, HYDRALUX_PETAL_BLOCK, true);
	
	public static final Block CAVE_BUSH = registerBlock("cave_bush", new BlockSimpleLeaves(MaterialColor.MAGENTA));
	
	public static final Block MURKWEED = registerBlock("murkweed", new BlockMurkweed());
	public static final Block NEEDLEGRASS = registerBlock("needlegrass", new BlockNeedlegrass());
	
	// Wall Plants //
	public static final Block PURPLE_POLYPORE = registerBlock("purple_polypore", new BlockWallMushroom(13));
	public static final Block TAIL_MOSS = registerBlock("tail_moss", new BlockWallPlant());
	public static final Block CYAN_MOSS = registerBlock("cyan_moss", new BlockWallPlant());
	public static final Block TWISTED_MOSS = registerBlock("twisted_moss", new BlockWallPlant());
	public static final Block TUBE_WORM = registerBlock("tube_worm", new BlockUnderwaterWallPlant());
	public static final Block BULB_MOSS = registerBlock("bulb_moss", new BlockWallPlant(12));
	public static final Block JUNGLE_FERN = registerBlock("jungle_fern", new BlockWallPlant());
	
	// Crops //
	public static final Block SHADOW_BERRY = registerBlock("shadow_berry", new BlockShadowBerry());
	
	// Vines //
	public static final Block DENSE_VINE = registerBlock("dense_vine", new BlockVine(15, true));
	public static final Block TWISTED_VINE = registerBlock("twisted_vine", new BlockVine());
	public static final Block BULB_VINE_SEED = registerBlock("bulb_vine_seed", new BlockBulbVineSeed());
	public static final Block BULB_VINE = registerBlock("bulb_vine", new BlockBulbVine());
	public static final Block JUNGLE_VINE = registerBlock("jungle_vine", new BlockVine());
	
	// Mob-Related
	public static final Block SILK_MOTH_NEST = registerBlock("silk_moth_nest", new BlockSilkMothNest()); 
	
	// Ores //
	public static final Block ENDER_ORE = registerBlock("ender_ore", new BlockOre(EndItems.ENDER_SHARD, 1, 3, 5));
	public static final Block AMBER_ORE = registerBlock("amber_ore", new BlockOre(EndItems.RAW_AMBER, 1, 2, 4));
	
	// Materials //
	public static final Block TERMINITE_BLOCK = registerBlock("terminite_block", new TerminiteBlock());
	public static final Block AETERNIUM_BLOCK = registerBlock("aeternium_block", new AeterniumBlock());
	public static final Block ENDER_BLOCK = registerBlock("ender_block", new EnderBlock());
	public static final Block AURORA_CRYSTAL = registerBlock("aurora_crystal", new AuroraCrystalBlock());
	public static final Block AMBER_BLOCK = registerBlock("amber_block", new BlockAmber());
	
	public static final Block RESPAWN_OBELISK = registerBlock("respawn_obelisk", new BlockRespawnObelisk());
	
	// Lanterns
	public static final Block ANDESITE_LANTERN = registerBlock("andesite_lantern", new BlockStoneLantern(Blocks.ANDESITE));
	public static final Block DIORITE_LANTERN = registerBlock("diorite_lantern", new BlockStoneLantern(Blocks.DIORITE));
	public static final Block GRANITE_LANTERN = registerBlock("granite_lantern", new BlockStoneLantern(Blocks.GRANITE));
	public static final Block QUARTZ_LANTERN = registerBlock("quartz_lantern", new BlockStoneLantern(Blocks.QUARTZ_BLOCK));
	public static final Block PURPUR_LANTERN = registerBlock("purpur_lantern", new BlockStoneLantern(Blocks.PURPUR_BLOCK));
	public static final Block END_STONE_LANTERN = registerBlock("end_stone_lantern", new BlockStoneLantern(Blocks.END_STONE));
	public static final Block BLACKSTONE_LANTERN = registerBlock("blackstone_lantern", new BlockStoneLantern(Blocks.BLACKSTONE));
	
	public static final Block BULB_LANTERN = registerBlock("bulb_lantern", new BlockBulbVineLantern());
	public static final ColoredMaterial BULB_LANTERN_COLORED = new ColoredMaterial(BlockBulbVineLanternColored::new, BULB_LANTERN, false);
	
	// Blocks With Entity //
	public static final Block END_STONE_SMELTER = registerBlock("end_stone_smelter", new EndStoneSmelter());
	public static final Block ETERNAL_PEDESTAL = registerBlock("eternal_pedestal", new EternalPedestal());
	public static final Block INFUSION_PEDESTAL = registerBlock("infusion_pedestal", new InfusionPedestal());
	
	// Technical
	public static final Block END_PORTAL_BLOCK = registerBlockNI("end_portal_block", new EndPortalBlock());
	
	public static void register() {}
	
	public static Block registerBlock(Identifier id, Block block) {
		if (!Configs.BLOCK_CONFIG.getBooleanRoot(id.getPath(), true)) {
			return block;
		}
		Registry.register(Registry.BLOCK, id, block);
		EndItems.registerBlockItem(id, new BlockItem(block, EndItems.makeBlockItemSettings()));
		return block;
	}
	
	public static Block registerBlock(String name, Block block) {
		return registerBlock(BetterEnd.makeID(name), block);
	}
	
	public static Block registerBlockNI(String name, Block block) {
		return Registry.register(Registry.BLOCK, BetterEnd.makeID(name), block);
	}
}
