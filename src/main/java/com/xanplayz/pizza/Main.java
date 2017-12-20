package com.xanplayz.pizza;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
	

    @SidedProxy(clientSide = Main.CLIENT, serverSide = Main.COMMON)
    public static CommonProxy proxy;
    
	public static final String MODID = "pizza";
	public static final String NAME = "Pizza Mod";
	public static final String VERSION = "1.0";
	public static final String CLIENT = "com.xanplayz.pizza.ClientProxy";
	public static final String COMMON = "com.xanplayz.pizza.CommonProxy";


}
