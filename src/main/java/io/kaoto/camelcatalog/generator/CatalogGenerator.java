package io.kaoto.camelcatalog.generator;

import io.kaoto.camelcatalog.model.CatalogDefinition;

@FunctionalInterface
public interface CatalogGenerator {

    CatalogDefinition generate();
}
