package ie.ianduffy.keycloak.ext.events.forwarder;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RoleInfo {
	
	private final String owner;
	private final String type;
	private final String name;
}
