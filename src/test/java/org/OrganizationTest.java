package org;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrganizationTest {
    Organization organization;

    @BeforeAll
    void setUp() {
        organization = Organization.getInstance();
    }

    @Test
    public void shouldReturnOrganizationName() {
        organization.setName("Alguma Organização");
        assertEquals(organization.getName(), "Alguma Organização");
    }

    @Test
    public void shouldReturnOrganizationLogoPath() {
        organization.setLogoPath("/alguma/pasta/qualquer/logo.png");
        assertEquals(organization.getLogoPath(), "/alguma/pasta/qualquer/logo.png");
    }
}
