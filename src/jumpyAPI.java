package net.pms.external.infidel.jumpy;


public interface jumpyAPI {

	// new constants:
	public static final int UNRESOLVED = -2;
	public static final int FOLDER = -1;

	// constants from net.pms.formats.Format:
	//	public static final int ISO = 32;
	//	public static final int PLAYLIST = 16;
	//	public static final int UNKNOWN = 8;
	//	public static final int VIDEO = 4;
	//	public static final int AUDIO = 1;
	//	public static final int IMAGE = 2;

	// new constants (net.pms.formats.Format|FEED)
	public static final int FEED = 4096;
	public static final int VIDEOFEED = 4100; // Format.VIDEO|FEED
	public static final int AUDIOFEED = 4097; // Format.AUDIO|FEED;
	public static final int IMAGEFEED = 4098; // Format.IMAGE|FEED;

	public void addItem(int type, String filename, String uri, String thumb);
	public void addPath(String path);
	public void setEnv(String name, String val);

	public static final String[] apiName = {"",
		"VERSION", "HOME", "PROFILEDIR", "LOGDIR", "PLUGINJAR", "RESTART", "FOLDERNAME",
		"GETPROPERTY", "SETPROPERTY", "SETPMS", "REBOOT"};
	public static final int VERSION = 1;
	public static final int HOME = 2;
	public static final int PROFILEDIR = 3;
	public static final int LOGDIR = 4;
	public static final int PLUGINJAR = 5;
	public static final int RESTART = 6;
	public static final int FOLDERNAME = 7;
	public static final int GETPROPERTY = 8;
	public static final int SETPROPERTY = 9;
	public static final int SETPMS = 10;
	public static final int REBOOT = 11;

	public String util(int action, String arg1, String arg2);
}

