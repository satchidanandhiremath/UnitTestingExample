package mes.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class findMaxtest {
    @Test
    void contextloads(){

}
@Test
void assertfindMaxtest(){
    findMax obj=new findMax();
    int ans=obj.findMaxtest(1)
    assertEquals(1,3,4,2.ans);   
}

}