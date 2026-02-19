package io.kaoto.camelcatalog.generator.citrus;

import java.io.File;

import io.kaoto.camelcatalog.generator.CatalogGenerator;
import io.kaoto.camelcatalog.generator.CatalogGeneratorBuilder;

public class CitrusCatalogGeneratorBuilder implements CatalogGeneratorBuilder {

    private String catalogVersion;
    private File outputDirectory;
    private boolean verbose = false;

    public CitrusCatalogGeneratorBuilder withCatalogVersion(String catalogVersion) {
        this.catalogVersion = catalogVersion;
        return this;
    }

    public CitrusCatalogGeneratorBuilder withOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
        return this;
    }

    public CitrusCatalogGeneratorBuilder withVerbose(boolean verbose) {
        this.verbose = verbose;
        return this;
    }

    @Override
    public CatalogGenerator build() {
        return new CitrusCatalogGenerator(catalogVersion, outputDirectory, verbose);
    }
}
