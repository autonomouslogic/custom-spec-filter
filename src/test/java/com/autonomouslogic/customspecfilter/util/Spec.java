package com.autonomouslogic.customspecfilter.util;

import io.swagger.v3.oas.models.OpenAPI;
import java.io.File;
import lombok.SneakyThrows;

public class Spec {
	private static OpenAPI spec;

	@SneakyThrows
	public static OpenAPI get() {
		if (spec == null) {
			return ObjectMappers.objectMapper().readValue(new File("build/api.json"), OpenAPI.class);
		}
		return spec;
	}
}
