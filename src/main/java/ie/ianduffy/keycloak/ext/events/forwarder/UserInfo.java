package ie.ianduffy.keycloak.ext.events.forwarder;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder(toBuilder = true)
@JsonDeserialize(builder = UserInfo.UserInfoBuilder.class)
public class UserInfo {

	private final String userId;
	private final String realmId;
	private final boolean emailVerified;
	private final boolean enabled;
	private final String username;
	private final String email;
	private final String firstname;
	private final String lastname;
	private final long creationDateTime;
	private final Map<String, List<String>> attributes;

	@JsonPOJOBuilder(withPrefix = "")
	public static class UserInfoBuilder {
	}
}
