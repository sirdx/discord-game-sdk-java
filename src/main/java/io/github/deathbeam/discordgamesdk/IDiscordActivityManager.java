package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:379</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordActivityManager extends Structure {
	/** C type : register_command_callback* */
	public IDiscordActivityManager.register_command_callback register_command;
	/** C type : register_steam_callback* */
	public IDiscordActivityManager.register_steam_callback register_steam;
	/** C type : update_activity_callback* */
	public IDiscordActivityManager.update_activity_callback update_activity;
	/** C type : clear_activity_callback* */
	public IDiscordActivityManager.clear_activity_callback clear_activity;
	/** C type : send_request_reply_callback* */
	public IDiscordActivityManager.send_request_reply_callback send_request_reply;
	/** C type : send_invite_callback* */
	public IDiscordActivityManager.send_invite_callback send_invite;
	/** C type : accept_invite_callback* */
	public IDiscordActivityManager.accept_invite_callback accept_invite;
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface register_command_callback extends Callback {
		int apply(IDiscordActivityManager manager, Pointer command);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface register_steam_callback extends Callback {
		int apply(IDiscordActivityManager manager, int steam_id);
	};
	/** <i>native declaration : discord_game_sdk.h:382</i> */
	public interface update_activity_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface update_activity_callback extends Callback {
		void apply(IDiscordActivityManager manager, DiscordActivity activity, Pointer callback_data, IDiscordActivityManager.update_activity_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h:383</i> */
	public interface clear_activity_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface clear_activity_callback extends Callback {
		void apply(IDiscordActivityManager manager, Pointer callback_data, IDiscordActivityManager.clear_activity_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h:384</i> */
	public interface send_request_reply_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface send_request_reply_callback extends Callback {
		void apply(IDiscordActivityManager manager, long user_id, int reply, Pointer callback_data, IDiscordActivityManager.send_request_reply_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h:385</i> */
	public interface send_invite_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface send_invite_callback extends Callback {
		void apply(IDiscordActivityManager manager, long user_id, int type, Pointer content, Pointer callback_data, IDiscordActivityManager.send_invite_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h:386</i> */
	public interface accept_invite_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface accept_invite_callback extends Callback {
		void apply(IDiscordActivityManager manager, long user_id, Pointer callback_data, IDiscordActivityManager.accept_invite_callback_callback_callback callback);
	};
	public IDiscordActivityManager() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("register_command", "register_steam", "update_activity", "clear_activity", "send_request_reply", "send_invite", "accept_invite");
	}
	/**
	 * @param register_command C type : register_command_callback*<br>
	 * @param register_steam C type : register_steam_callback*<br>
	 * @param update_activity C type : update_activity_callback*<br>
	 * @param clear_activity C type : clear_activity_callback*<br>
	 * @param send_request_reply C type : send_request_reply_callback*<br>
	 * @param send_invite C type : send_invite_callback*<br>
	 * @param accept_invite C type : accept_invite_callback*
	 */
	public IDiscordActivityManager(IDiscordActivityManager.register_command_callback register_command, IDiscordActivityManager.register_steam_callback register_steam, IDiscordActivityManager.update_activity_callback update_activity, IDiscordActivityManager.clear_activity_callback clear_activity, IDiscordActivityManager.send_request_reply_callback send_request_reply, IDiscordActivityManager.send_invite_callback send_invite, IDiscordActivityManager.accept_invite_callback accept_invite) {
		super();
		this.register_command = register_command;
		this.register_steam = register_steam;
		this.update_activity = update_activity;
		this.clear_activity = clear_activity;
		this.send_request_reply = send_request_reply;
		this.send_invite = send_invite;
		this.accept_invite = accept_invite;
	}
	public IDiscordActivityManager(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordActivityManager implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordActivityManager implements Structure.ByValue {
		
	};
}
