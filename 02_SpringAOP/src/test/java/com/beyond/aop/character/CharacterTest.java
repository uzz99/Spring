package com.beyond.aop.character;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.beyond.aop.config.RootConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)
class CharacterTest {
	@Autowired
	private Character character;
	
	@Test
	void test() {
	}
	
	@Test
	void create() {
		System.out.println(character);
		
		assertThat(character).isNotNull();
		assertThat(character.getWeapon()).isNotNull();
	}

	@Test
	void questTest() {
		
		assertThat(character.quest("도토리 줍기")).isNotNull().contains("도토리");
	}

	@Test
	void attackTest() {
		assertThat(character.getWeapon()).isNotNull();
		assertThat(character.getWeapon().attack()).isNotNull();
	}
}
