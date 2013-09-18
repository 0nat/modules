package org.motechproject.seuss.ui.domain;

import java.util.Objects;

/**
 * The <code>ObjectDto</code> class contains only basic information about an object like id, name,
 * module and namespace.
 */
public class ObjectDto {
    private String id;
    private String name;
    private String module;
    private String namespace;

    public ObjectDto() {
        this(null, null);
    }

    public ObjectDto(String id, String name) {
        this(id, name, null);
    }

    public ObjectDto(String id, String name, String module) {
        this(id, name, module, null);
    }

    public ObjectDto(String id, String name, String module, String namespace) {
        this.id = id;
        this.name = name;
        this.module = module;
        this.namespace = namespace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, module, namespace);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final ObjectDto other = (ObjectDto) obj;

        return Objects.equals(this.id, other.id)
                && Objects.equals(this.name, other.name)
                && Objects.equals(this.module, other.module)
                && Objects.equals(this.namespace, other.namespace);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format(
                "ObjectDto{id='%s', name='%s', module='%s', namespace='%s'}",
                id, name, module, namespace
        );
    }

}
