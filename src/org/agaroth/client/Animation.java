package org.agaroth.client;

public final class Animation {

	public static void unpackConfig(Archive streamLoader)
	{
		ByteBuffer stream = new ByteBuffer(streamLoader.get("seq.dat"));
		int length = stream.getUnsignedShort();
		if(cache == null)
			cache = new Animation[length];
		for(int j = 0; j < length; j++)
		{
			if(cache[j] == null)
				cache[j] = new Animation();
			cache[j].readValues(stream);
			if (j == 4495) {//cerberus death anim
				cache[j].frameCount = 14;
				cache[j].frameIDs = new int[] {117309441, 117309557, 117309612, 117309536, 117309603, 117309563, 117309609, 117309567, 117309502, 117309607, 117309516, 117309626, 117309463, 117309514};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int[] {5, 5, 5, 5, 5, 5, 3, 3, 5, 5, 3, 3, 4, 4};
				cache[j].loopDelay = 1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 10;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				}
			if (j == 7195) {
			cache[j].frameCount = 14;
			cache[j].frameIDs = new int[] {120193037, 120193029, 120193052, 120193080, 120193048, 120193117, 120193047, 120193040, 120193112, 120193025, 120193090, 120193098, 120193071, 120193067};
			cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[j].delays = new int[] {4, 4, 5, 5, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4};
			cache[j].loopDelay = -1;
			cache[j].animationFlowControl = null;
			cache[j].oneSquareAnimation = false;
			cache[j].forcedPriority = 5;
			cache[j].leftHandItem = -1;
			cache[j].rightHandItem = -1;
			cache[j].frameStep = 99;
			cache[j].resetWhenWalk = 0;
			cache[j].priority = 0;
			cache[j].delayType = 1;
			}
			if (j == 7191) {
			cache[j].frameCount = 12;
			cache[j].frameIDs = new int[] {120193116, 120193084, 120193032, 120193046, 120193045, 120193102, 120193068, 120193109, 120193058, 120193086, 120193038, 120193093};
			cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[j].delays = new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
			cache[j].loopDelay = -1;
			cache[j].animationFlowControl = null;
			cache[j].oneSquareAnimation = false;
			cache[j].forcedPriority = 5;
			cache[j].leftHandItem = -1;
			cache[j].rightHandItem = -1;
			cache[j].frameStep = 99;
			cache[j].resetWhenWalk = 0;
			cache[j].priority = 0;
			cache[j].delayType = 1;
			}
		if (j == 7192) { //jump
			cache[ 7192].frameCount = 15;
			cache[ 7192].frameIDs = new int[] {120193089, 120193074, 120193105, 120193063, 120193078, 120193049, 120193104, 120193043, 120193062, 120193054, 120193099, 120193101, 120193085, 120193030, 120193072};
			cache[ 7192].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[ 7192].delays = new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
			cache[ 7192].loopDelay = -1;
			cache[ 7192].animationFlowControl = null;
			cache[ 7192].oneSquareAnimation = false;
			cache[ 7192].forcedPriority = 6;
			cache[ 7192].leftHandItem = -1;
			cache[ 7192].rightHandItem = -1;
			cache[ 7192].frameStep = 99;
			cache[ 7192].resetWhenWalk = 0;
			cache[ 7192].priority = 0;
			cache[ 7192].delayType = 1;
			}
		if (j == 7193) { //poison
			cache[ 7193].frameCount = 24;
			cache[ 7193].frameIDs = new int[] {120193060, 120193057, 120193113, 120193024, 120193087, 120193031, 120193070, 120193094, 120193066, 120193083, 120193075, 120193026, 120193061, 120193044, 120193108, 120193036, 120193096, 120193107, 120193056, 120193065, 120193103, 120193027, 120193035, 120193053};
			cache[ 7193].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[ 7193].delays = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 11, 3, 3, 3};
			cache[ 7193].loopDelay = -1;
			cache[ 7193].animationFlowControl = null;
			cache[ 7193].oneSquareAnimation = false;
			cache[ 7193].forcedPriority = 6;
			cache[ 7193].leftHandItem = -1;
			cache[ 7193].rightHandItem = -1;
			cache[ 7193].frameStep = 99;
			cache[ 7193].resetWhenWalk = 0;
			cache[ 7193].priority = 0;
			cache[ 7193].delayType = 1;
			}
		if (j == 4533) { //sire
			cache[j].frameCount = 20;
			cache[j].frameIDs = new int[] {119406846, 119407068, 119407215, 119406592, 119407105, 119407099, 119406975, 119407198, 119407023, 119406677, 119407267, 119407258, 119407023, 119406798, 119406975, 119407218, 119407105, 119406977, 119407215, 119406756};
			cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[j].delays = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
			cache[j].loopDelay = -1;
			cache[j].animationFlowControl = null;
			cache[j].oneSquareAnimation = false;
			cache[j].forcedPriority = 5;
			cache[j].leftHandItem = -1;
			cache[j].rightHandItem = -1;
			cache[j].frameStep = 99;
			cache[j].resetWhenWalk = 0;
			cache[j].priority = 0;
			cache[j].delayType = 2;
			}
			if (j == 4534) {
			cache[j].frameCount = 19;
			cache[j].frameIDs = new int[] {119406741, 119406935, 119406823, 119407208, 119406647, 119406777, 119406623, 119406805, 119407264, 119407008, 119406898, 119406743, 119407040, 119407253, 119406899, 119407138, 119406901, 119406719, 119406852};
			cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
			cache[j].delays = new int[] {3, 3, 4, 4, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3};
			cache[j].loopDelay = -1;
			cache[j].animationFlowControl = null;
			cache[j].oneSquareAnimation = false;
			cache[j].forcedPriority = 5;
			cache[j].leftHandItem = -1;
			cache[j].rightHandItem = -1;
			cache[j].frameStep = 99;
			cache[j].resetWhenWalk = 0;
			cache[j].priority = 0;
			cache[j].delayType = 2;
			} //end sire
			if (j == 1828) { //thermonuclear
				cache[j].frameCount = 16;
				cache[j].frameIDs = new int[] {118095921, 118095916, 118096259, 118096320, 118096299, 118096329, 118096036, 118095925, 118096180, 118096105, 118096311, 118095880, 118096084, 118096269, 118095905, 118096227};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int [] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
				cache[j].loopDelay = -1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				}

				if (j == 1829) {
				cache[j].frameCount = 16;
				cache[j].frameIDs = new int[] {118096000, 118096073, 118095928, 118095889, 118095894, 118096223, 118096337, 118095979, 118096087, 118095980, 118096314, 118096202, 118095950, 118096110, 118096328, 118096221};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int [] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
				cache[j].loopDelay = -1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				} // end of thermo
			if (j == 4484) {//cerberus stand
				cache[j].frameCount = 14;
				cache[j].frameIDs = new int[] {117309461, 117309547, 117309462, 117309623, 117309548, 117309621, 117309454, 117309599, 117309473, 117309488, 117309559, 117309541, 117309588, 117309622};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int [] {3, 5, 7, 7, 11, 7, 7, 5, 7, 5, 6, 9, 8, 4};
				cache[j].loopDelay = -1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				}
			if (j == 4488) { // cerberus walk
				cache[j].frameCount = 15;
				cache[j].frameIDs = new int[] {117309535, 117309468, 117309534, 117309569, 117309581, 117309507, 117309443, 117309598, 117309444, 117309466, 117309576, 117309551, 117309464, 117309543, 117309446};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
				cache[j].loopDelay = -1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				}
			if (j == 4492) { // cerberus attack
				cache[j].frameCount = 18;
				cache[j].frameIDs = new int[] {117309553, 117309490, 117309485, 117309530, 117309592, 117309531, 117309594, 117309583, 117309458, 117309614, 117309538, 117309524, 117309521, 117309537, 117309562, 117309513, 117309484, 117309616};
				cache[j].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
				cache[j].delays = new int[] {7, 6, 6, 7, 9, 9, 9, 6, 6, 6, 7, 6, 6, 6, 6, 6, 6, 6};
				cache[j].loopDelay = -1;
				cache[j].animationFlowControl = null;
				cache[j].oneSquareAnimation = false;
				cache[j].forcedPriority = 6;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				} //end of cerberus
			/*
			 * Glacor cache
			 */
			 /*if(j == 10867) {
        		cache[j].frameCount = 19;
        		cache[j].loopDelay = 19;
        		cache[j].delays = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        		cache[j].frameIDs = new int[]{244252686, 244252714, 244252760, 244252736, 244252678, 244252780, 244252817, 244252756, 244252700, 244252774, 244252834, 244252715, 244252732, 244252836, 244252776, 244252701, 244252751, 244252743, 244252685};
        	}
        	if(j == 10901) {
        		cache[j].frameCount = 19;
        		cache[j].loopDelay = 19;
        		cache[j].delays = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        		cache[j].frameIDs = new int[]{244252826, 244252833, 244252674, 244252724, 244252793, 244252696, 244252787, 244252753, 244252703, 244252800, 244252752, 244252744, 244252680, 244252815, 244252829, 244252769, 244252699, 244252757, 244252695};
        	}*/
			if (j == 9677) {
				//System.out.println(cache[9677]);
			}
			if (j == 5036) {
				cache[j] = new Animation();
				cache[j].frameCount = 9;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] {86704129,86704138,86704139,86704140,86704141,86704142,86704143,86704144,86704145,86704130,86704131,86704132,86704133,86704134,86704135,86704136};
				cache[j].delays = new int[] { 3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
			}
			if (j == 5325) {
				cache[j] = new Animation();
				cache[j].frameCount = 10;
				cache[j].loopDelay = 10;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] {91095230,91095232,91095233,91095234,
											   91095235,91095236,91095237,91095238,91095239,91095231};
				cache[j].delays = new int[] { 2,2,2,2,2,2,2,2,2,2,};
			}
			if (j == 5327) {
				cache[j] = new Animation();
				cache[j].frameCount = 12;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = true;
				cache[j].frameIDs = new int[] {91095040,91095057,91095058,91095059,91095060,
												91095061,91095062,
												91095063,91095064,91095054,91095055,91095056,};
				cache[j].delays = new int[] { 4,4,4,4,4,3,3,3,3,3,4,4};
			}
			if (j == 5070) {
				cache[j] = new Animation();
				cache[j].frameCount = 9;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 5;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 11927608, 11927625, 11927598, 11927678, 11927582, 11927600, 11927669,
						11927597, 11927678 };
				cache[j].delays = new int[] { 5, 4, 4, 4, 5, 5, 5, 4, 4 };
			}
			if (j == 5061) {
				cache[j].frameCount = 13;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].animationFlowControl = new int[] {1,2,9,11,13,15,17,19,37,39,41,43,45,164,166,168,170,172,174,176,178,180,182,183,185,191,192,9999999};
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 1;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 19267601,19267602,19267603,19267604,19267605,19267606,19267607,19267606,19267605,
						19267604,19267603,19267602,19267601};
				cache[j].delays = new int[] { 4,3,3,4,10,10,15,10,10,4,3,3,4};
			}
			if (j == 1720) {
				cache[j].frameCount = 16;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].animationFlowControl = new int[] {1,2,9,11,13,15,17,19,37,39,41,43,45,164,166,168,170,172,174,176,178,180,182,183,185,191,192,9999999};
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 18087977,18087978,18087979,18087980,18087981,18087969,18087970,18087971,
												18087972,18087973,18087979,18087978,18087977,18087976,18087975,18087974};
				cache[j].delays = new int[] { 3,2,3,6,2,2,5,5,5,5,3,2,3,3,4,4,};
			}
			if (j == 7083) {
				cache[j].frameCount = 16;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].animationFlowControl = new int[] {1,2,9,11,13,15,17,19,37,39,41,43,45,164,166,168,170,172,174,176,178,180,182,183,185,191,192,9999999,};
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = -1;
				cache[j].priority = -1;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 18087977,18087978,18087979,18087980,18087981,18087969,18087970,18087971,18087972,
						 						18087973,18087979,18087978,18087977,18087976,18087975,18087974};
				cache[j].delays = new int[] { 3,2,3,6,2,2,5,5,5,5,3,2,3,3,4,4,};
			}
			if (j == 5069) {
				cache[j].frameCount = 15;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 1;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 11927613, 11927599, 11927574, 11927659, 11927676, 11927562, 11927626,
						11927628, 11927684, 11927647, 11927602, 11927576, 11927586, 11927653, 11927616 };
				cache[j].delays = new int[] { 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
			}
			if (j == 5072) {
				cache[j].frameCount = 21;
				cache[j].loopDelay = 1;
				cache[j].forcedPriority = 8;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 11927623, 11927595, 11927685, 11927636, 11927670, 11927579, 11927664,
						11927666, 11927661, 11927673, 11927633, 11927624, 11927555, 11927588, 11927692, 11927667, 11927556,
						11927630, 11927695, 11927643, 11927640 };
				cache[j].delays = new int[] { 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
			}
			if (j == 5073) {
				cache[j].frameCount = 21;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 9;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = false;
				cache[j].frameIDs = new int[] { 11927640, 11927643, 11927695, 11927630, 11927556, 11927667, 11927692,
						11927588, 11927555, 11927624, 11927633, 11927673, 11927661, 11927666, 11927664, 11927579, 11927670,
						11927636, 11927685, 11927595, 11927623 };
				cache[j].delays = new int[] { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2 };
			}
			if (j == 5806) {
				cache[j].frameCount = 55;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = true;
				cache[j].frameIDs = new int[] { 11927612, 11927677, 11927615, 11927573, 11927618, 11927567, 11927564,
						11927606, 11927675, 11927657, 11927690, 11927583, 11927672, 11927552, 11927563, 11927683, 11927639,
						11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656, 11927660, 11927629,
						11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656, 11927660, 11927635,
						11927668, 11927614, 11927560, 11927687, 11927577, 11927569, 11927557, 11927569, 11927577, 11927687,
						11927560, 11927651, 11927611, 11927680, 11927622, 11927691, 11927571, 11927601 };
				cache[j].delays = new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
						4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 3 };
			}
			if (j == 5807) {
				cache[j].frameCount = 53;
				cache[j].loopDelay = -1;
				cache[j].forcedPriority = 6;
				cache[j].leftHandItem = -1;
				cache[j].rightHandItem = -1;
				cache[j].frameStep = 99;
				cache[j].resetWhenWalk = 0;
				cache[j].priority = 0;
				cache[j].delayType = 2;
				cache[j].oneSquareAnimation = true;
				cache[j].frameIDs = new int[] { 11927612, 11927677, 11927615, 11927573, 11927618, 11927567, 11927564,
						11927606, 11927675, 11927657, 11927690, 11927583, 11927672, 11927552, 11927563, 11927683, 11927639,
						11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656, 11927660, 11927629,
						11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656, 11927604, 11927637,
						11927688, 11927696, 11927681, 11927605, 11927681, 11927696, 11927688, 11927637, 11927604, 11927656,
						11927611, 11927680, 11927622, 11927691, 11927571, 11927601 };
				cache[j].delays = new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
						4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 3 };
			}
		}
	}

	public int getFrameLength(int i)
	{
		if(i > delays.length)
			return 1;
		int j = delays[i];
		if(j == 0)
		{
			FrameReader reader = FrameReader.forId(frameIDs[i]);
			if(reader != null)
				j = delays[i] = reader.displayLength;
		}
		if(j == 0)
			j = 1;
		return j;
	}

	public void readValues(ByteBuffer stream)
	{
		do {
			int i = stream.getUnsignedByte();
			if(i == 0)
				break;
			if(i == 1) {
				frameCount = stream.getUnsignedShort();
				frameIDs = new int[frameCount];
				frameIDs2 = new int[frameCount];
				delays = new int[frameCount];
				for(int i_ = 0; i_ < frameCount; i_++){
					frameIDs[i_] = stream.getIntLittleEndian();
					frameIDs2[i_] = -1;
				}
				for(int i_ = 0; i_ < frameCount; i_++)
					delays[i_] = stream.getUnsignedByte();
			}
			else if(i == 2)
				loopDelay = stream.getUnsignedShort();
			else if(i == 3) {
				int k = stream.getUnsignedByte();
				animationFlowControl = new int[k + 1];
				for(int l = 0; l < k; l++)
					animationFlowControl[l] = stream.getUnsignedByte();
				animationFlowControl[k] = 0x98967f;
			}
			else if(i == 4)
				oneSquareAnimation = true;
			else if(i == 5)
				forcedPriority = stream.getUnsignedByte();
			else if(i == 6)
				leftHandItem = stream.getUnsignedShort();
			else if(i == 7)
				rightHandItem = stream.getUnsignedShort();
			else if(i == 8)
				frameStep = stream.getUnsignedByte();
			else if(i == 9)
				resetWhenWalk = stream.getUnsignedByte();
			else if(i == 10)
				priority = stream.getUnsignedByte();
			else if(i == 11)
				delayType = stream.getUnsignedByte();
			else
				System.out.println("Unrecognized seq.dat config code: "+i);
		} while(true);
		if(frameCount == 0)
		{
			frameCount = 1;
			frameIDs = new int[1];
			frameIDs[0] = -1;
			frameIDs2 = new int[1];
			frameIDs2[0] = -1;
			delays = new int[1];
			delays[0] = -1;
		}
		if(resetWhenWalk == -1)
			if(animationFlowControl != null)
				resetWhenWalk = 2;
			else
				resetWhenWalk = 0;
		if(priority == -1)
		{
			if(animationFlowControl != null)
			{
				priority = 2;
				return;
			}
			priority = 0;
		}
	}

	private Animation()
	{
		loopDelay = -1;
		oneSquareAnimation = false;
		forcedPriority = 5;
		leftHandItem = -1;
		rightHandItem = -1;
		frameStep = 99;
		resetWhenWalk = -1;
		priority = -1;
		delayType = 2;
	}
	public static Animation cache[];
	public int frameCount;
	public int frameIDs[];
	public int frameIDs2[];
	public int[] delays;
	public int loopDelay;
	public int animationFlowControl[];
	public boolean oneSquareAnimation;
	public int forcedPriority;
	public int leftHandItem;
	public int rightHandItem;
	public int frameStep;
	public int resetWhenWalk;
	public int priority;
	public int delayType;
	public static int anInt367;
}