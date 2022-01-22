package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:566</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordCore extends Structure {
	/** C type : destroy_callback* */
	public IDiscordCore.destroy_callback destroy;
	/** C type : run_callbacks_callback* */
	public IDiscordCore.run_callbacks_callback run_callbacks;
	/** C type : set_log_hook_callback* */
	public IDiscordCore.set_log_hook_callback set_log_hook;
	/** C type : get_application_manager_callback* */
	public IDiscordCore.get_application_manager_callback get_application_manager;
	/** C type : get_user_manager_callback* */
	public IDiscordCore.get_user_manager_callback get_user_manager;
	/** C type : get_image_manager_callback* */
	public IDiscordCore.get_image_manager_callback get_image_manager;
	/** C type : get_activity_manager_callback* */
	public IDiscordCore.get_activity_manager_callback get_activity_manager;
	/** C type : get_relationship_manager_callback* */
	public IDiscordCore.get_relationship_manager_callback get_relationship_manager;
	/** C type : get_lobby_manager_callback* */
	public IDiscordCore.get_lobby_manager_callback get_lobby_manager;
	/** C type : get_network_manager_callback* */
	public IDiscordCore.get_network_manager_callback get_network_manager;
	/** C type : get_overlay_manager_callback* */
	public IDiscordCore.get_overlay_manager_callback get_overlay_manager;
	/** C type : get_storage_manager_callback* */
	public IDiscordCore.get_storage_manager_callback get_storage_manager;
	/** C type : get_store_manager_callback* */
	public IDiscordCore.get_store_manager_callback get_store_manager;
	/** C type : get_voice_manager_callback* */
	public IDiscordCore.get_voice_manager_callback get_voice_manager;
	/** C type : get_achievement_manager_callback* */
	public IDiscordCore.get_achievement_manager_callback get_achievement_manager;
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface destroy_callback extends Callback {
		void apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface run_callbacks_callback extends Callback {
		int apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h:569</i> */
	public interface set_log_hook_callback_hook_callback extends Callback {
		void apply(Pointer hook_data, int level, Pointer message);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_log_hook_callback extends Callback {
		void apply(IDiscordCore core, int min_level, Pointer hook_data, IDiscordCore.set_log_hook_callback_hook_callback hook);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_application_manager_callback extends Callback {
		IDiscordApplicationManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_user_manager_callback extends Callback {
		IDiscordUserManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_image_manager_callback extends Callback {
		IDiscordImageManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_activity_manager_callback extends Callback {
		IDiscordActivityManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_relationship_manager_callback extends Callback {
		IDiscordRelationshipManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_lobby_manager_callback extends Callback {
		IDiscordLobbyManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_network_manager_callback extends Callback {
		IDiscordNetworkManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_overlay_manager_callback extends Callback {
		IDiscordOverlayManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_storage_manager_callback extends Callback {
		IDiscordStorageManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_store_manager_callback extends Callback {
		IDiscordStoreManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_voice_manager_callback extends Callback {
		IDiscordVoiceManager apply(IDiscordCore core);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_achievement_manager_callback extends Callback {
		IDiscordAchievementManager apply(IDiscordCore core);
	};
	public IDiscordCore() {
		super();
	}
	protected List<String > getFieldOrder() {
		return Arrays.asList("destroy", "run_callbacks", "set_log_hook", "get_application_manager", "get_user_manager", "get_image_manager", "get_activity_manager", "get_relationship_manager", "get_lobby_manager", "get_network_manager", "get_overlay_manager", "get_storage_manager", "get_store_manager", "get_voice_manager", "get_achievement_manager");
	}
	public IDiscordCore(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordCore implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordCore implements Structure.ByValue {
		
	};
}
