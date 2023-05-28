package Ensolvers.Test;

import Ensolvers.Test.Model.Note;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class EnsolversTestTests {
	@Test
	void contextLoads() {
		save = new Note();
	}

	@Mock
	private Note save;

	private boolean testMoves(){
		return true;
	}


}
