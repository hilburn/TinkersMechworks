package tmechworks.lib.player;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayer;
import tconstruct.library.util.CoordTuple;

public class FakePlayerLogic extends FakePlayer
{
    ChunkCoordinates logicPos;

    public FakePlayerLogic(World world, String name)
    {
        super(world, name);
    }

    public ChunkCoordinates getPlayerCoordinates ()
    {
        return logicPos;
    }

    public void init (TileEntity te)
    {
        logicPos = new ChunkCoordinates(te.xCoord, te.yCoord, te.zCoord);
    }
}
