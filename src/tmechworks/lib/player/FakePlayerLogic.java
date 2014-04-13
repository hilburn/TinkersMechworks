package tmechworks.lib.player;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayer;
import tconstruct.library.util.CoordTuple;

public class FakePlayerLogic extends FakePlayer
{
    ChunkCoordinates logicPos;

    public FakePlayerLogic(String name, TileEntity te)
    {
        super(te.worldObj, name);
        logicPos = new ChunkCoordinates(te.xCoord, te.yCoord, te.zCoord);
    }

    public ChunkCoordinates getPlayerCoordinates ()
    {
        return logicPos;
    }
}
