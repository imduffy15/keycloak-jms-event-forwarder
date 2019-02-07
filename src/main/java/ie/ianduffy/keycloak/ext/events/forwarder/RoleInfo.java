package ie.ianduffy.keycloak.ext.events.forwarder;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder(toBuilder = true)
@JsonDeserialize(builder = RoleInfo.RoleInfoBuilder.class)
public class RoleInfo {
	private final String owner;
	private final String type;
	private final String name;

	@JsonPOJOBuilder(withPrefix = "")
	public static class RoleInfoBuilder {
	}
}
