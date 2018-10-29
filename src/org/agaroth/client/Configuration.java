package org.agaroth.client;

public class Configuration {
	
	/** LOADS CACHE FROM ./ IF TRUE, OTHERWISE USER.HOME FOLDER**/
	public static final boolean DROPBOX_MODE = true;
	
	/** MAIN CONSTANTS **/
	public final static String CLIENT_NAME = "Sintennial";
	public final static int CLIENT_VERSION = 4;
	public final static String CACHE_DIRECTORY_NAME = "SintennialCacheV2"; //Cache folder name
	
	public final static boolean JAGCACHED_ENABLED = false;
	public final static String JAGCACHED_HOST  = "localhost";
	public final static String SERVER_HOST = "73.198.183.229";
	public final static int SERVER_PORT = 16834;//16834
	public final static boolean DISPLAY_GAMEWORLD_ON_LOGIN = false;
	
	/** UPDATING **/
	public final static int NPC_BITS = 18;
	
	/** FEATURES **/
	public static boolean SAVE_ACCOUNTS = true;
	public static boolean DISPLAY_HP_ABOVE_HEAD = false;
	public static boolean DISPLAY_USERNAMES_ABOVE_HEAD = false;
	public static boolean TWEENING_ENABLED = true;
	
	public static boolean NEW_HITMARKS = false;
	public static boolean CONSTITUTION_ENABLED = true;
	public static boolean NEW_HEALTH_BARS = true;
	
	public static boolean MONEY_POUCH_ENABLED = true;
	public static boolean SMILIES_ENABLED = true;
	public static boolean NOTIFICATIONS_ENABLED = true;
	public static boolean NEW_CURSORS = true;
	public static boolean NEW_FUNCTION_KEYS = true;
	
	public static boolean FOG_ENABLED = true;
	/**
	 * The client will run in high memory with textures rendering
	 */
	public static boolean HIGH_DETAIL = false;
	public static boolean hdTexturing = false;
	public static boolean hdMinimap = false;
	public static boolean hdShading = false;
	
	/**
	 * Roofs should be displayed
	 */
	public static boolean TOGGLE_ROOF_OFF = true;

	/**
	 * Should the new fov be displayed?
	 */
	public static boolean TOGGLE_FOV = true;

}