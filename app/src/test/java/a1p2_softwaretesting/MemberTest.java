package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test
public void testMemberInitialization_shouldSetAttributesCorrectly() {
    Member member = new Member("John Doe", "M001");
    assertEquals("John Doe", member.getName());
    assertEquals("M001", member.getId());
}

}
