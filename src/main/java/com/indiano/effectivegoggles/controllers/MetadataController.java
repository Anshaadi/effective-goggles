package com.indiano.effectivegoggles.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indiano.effectivegoggles.entities.Metadata;

@RestController
public class MetadataController {

	Metadata metadataObj;

	@GetMapping("/metadata")
	public Metadata getMetadata() {

		metadataObj = new Metadata();
		return metadataObj;

	}
}
