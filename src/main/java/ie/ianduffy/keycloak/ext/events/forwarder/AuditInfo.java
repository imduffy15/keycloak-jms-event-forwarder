package ie.ianduffy.keycloak.ext.events.forwarder;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Audit information about the initiator of the {@link KeycloakEvent Event}.
 */
@Data
@Builder
@RequiredArgsConstructor
public class AuditInfo {

	private final String realmId;
	private final String clientId;
	private final String ipAddress;
	private final String userId;
	private final String username;
}
