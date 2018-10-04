package com.mtp.app.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfileBean implements EnvBasedConfig {

	@Override
	public void setup() {
		System.out.println("Prod config is setup....");
	}
}
