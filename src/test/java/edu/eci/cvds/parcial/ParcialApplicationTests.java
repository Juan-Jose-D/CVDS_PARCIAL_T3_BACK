package edu.eci.cvds.parcial;

import edu.eci.cvds.parcial.model.Product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ParcialApplicationTests {
	private Product product;

    @BeforeEach
    void setUp() {
        product = new Product( "Laptop", 1500);
    }

    @Test
    void testConstructorAndGetters() {
        assertThat(product.getName()).isEqualTo("Laptop");
        assertThat(product.getPrice()).isEqualTo(1500);
    }

    @Test
    void testSetters() {
        product.setId("2");
        product.setName("Mouse");
        product.setPrice(50);

        assertThat(product.getId()).isEqualTo("2");
        assertThat(product.getName()).isEqualTo("Mouse");
        assertThat(product.getPrice()).isEqualTo(50);
    }
}

