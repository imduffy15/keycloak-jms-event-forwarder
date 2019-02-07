package ie.ianduffy.keycloak.ext.events.forwarder;

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

/**
 * Audit information about the initiator of the {@link KeycloakEvent Event}.
 */
@Data
@Builder(toBuilder = true)
@JsonDeserialize(builder = AuditInfo.AuditInfoBuilder.class)
public class AuditInfo {
	private final String realmId;
	private final String clientId;
	private final String ipAddress;
	private final String userId;
	private final String username;

	@JsonPOJOBuilder(withPrefix = "")
	public static class AuditInfoBuilder {
	}
}
