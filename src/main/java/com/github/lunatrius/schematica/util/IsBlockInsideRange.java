package com.github.lunatrius.schematica.util;

import net.minecraft.util.math.BlockPos;

public class IsBlockInsideRange {
  public boolean CheckIfBlockIsInsideRange(final BlockPos pos, final int range, final BlockPos frompos) {
		int distanceX = pos.getX() - frompos.getX();
		int distanceY = pos.getY() - frompos.getY();
		int distanceZ = pos.getZ() - frompos.getZ();
		distanceX = Math.abs(distanceX);
		distanceY = Math.abs(distanceY);
		distanceZ = Math.abs(distanceZ);
		if (distanceX < range && distanceY < range && distanceZ < range) {
			return true;
		}
		return false;
	}
}
