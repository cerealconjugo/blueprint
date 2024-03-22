package core.data.server;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import core.BlueprintTest;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public final class TestBlockTagsProvider extends BlockTagsProvider {

	public TestBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper) {
		super(packOutput, lookupProvider, BlueprintTest.MOD_ID, fileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BlueprintBlockTags.NOTE_BLOCK_TOP_INSTRUMENTS).add(Blocks.FLOWER_POT);
	}

}
