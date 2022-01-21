package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:208</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordOAuth2Token extends Structure {
	/** C type : char[128] */
	public byte[] access_token = new byte[128];
	/** C type : char[1024] */
	public byte[] scopes = new byte[1024];
	/** C type : DiscordTimestamp */
	public long expires;
	public DiscordOAuth2Token() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("access_token", "scopes", "expires");
	}
	/**
	 * @param access_token C type : char[128]<br>
	 * @param scopes C type : char[1024]<br>
	 * @param expires C type : DiscordTimestamp
	 */
	public DiscordOAuth2Token(byte access_token[], byte scopes[], long expires) {
		super();
		if ((access_token.length != this.access_token.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.access_token = access_token;
		if ((scopes.length != this.scopes.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.scopes = scopes;
		this.expires = expires;
	}
	public DiscordOAuth2Token(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DiscordOAuth2Token implements Structure.ByReference {
		
	};
	public static class ByValue extends DiscordOAuth2Token implements Structure.ByValue {
		
	};
}
