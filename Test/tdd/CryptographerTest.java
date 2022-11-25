package tdd;

import Chapter4.Cryptographer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class CryptographerTest {
    @BeforeEach
    public void setUp(){
    }

    @Test
    public void encrypt(){
        int encryptedCode = Cryptographer.encrypt(4132);
        assertEquals(918,encryptedCode);
    }

    @Test
    public void decrypt(){
        int decryptedCode = Cryptographer.decrypt(918);
        assertEquals(4132,decryptedCode);
    }
}
