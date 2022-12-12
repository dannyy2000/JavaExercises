package tdd.Diary;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;


public class DiaryTest {
    private Diary danielDiary;

    @BeforeEach
    public void setUp() {
        danielDiary = new Diary("Daniel", "correctPassword");
    }

    @Test
    public void diaryExistTest() {
        assertNotNull(danielDiary);
    }

    @Test
    public void newDiaryIsLocked() {
        assertTrue(danielDiary.isLocked());
    }

    @Test
    public void lockedDiaryCanBeUnlockedTest() {
        assertTrue(danielDiary.isLocked());
        danielDiary.unlockWith("correctPassword");
        assertFalse(danielDiary.isLocked());
    }

    @Test
    public void wrongPasswordCannotUnlockDiaryTest() {
        assertTrue(danielDiary.isLocked());
        danielDiary.unlockWith("wrongPassword");
        assertTrue(danielDiary.isLocked());
    }

    @Test
    public void diaryCanBeLockedTest() {
        danielDiary.unlockWith("correctPassword");
        assertFalse(danielDiary.isLocked());

        danielDiary.lock();
        assertTrue(danielDiary.isLocked());
    }

    @Test
    public void EntriesCanBeAddedToTheDiary() {
        danielDiary.unlockWith("correctPassword");
        assertFalse(danielDiary.isLocked());

        danielDiary.write("My break up with my girlfriend",
                "She is crazy");
        assertEquals(1, danielDiary.numberOfEntries());
    }

    @Test
    public void entriesCannotBeAddedWhenDiaryIsLockedTest() {
        assertTrue(danielDiary.isLocked());

        try {
            danielDiary.write("My break up with my girlfriend",
                    "She is crazy");
            assertEquals(0, danielDiary.numberOfEntries());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

      @Test
    public void entriesCanBeFoundByIdTest() {
        danielDiary.unlockWith("correctPassword");
        assertFalse(danielDiary.isLocked());

        danielDiary.write("My break up with my girlfriend",
                "She is crazy");

        assertEquals(1, danielDiary.numberOfEntries());

        Entry foundEntry = danielDiary.findEntryWithId(1);

        assertEquals(1, foundEntry.getId());

        assertEquals("My break up with my girlfriend", foundEntry.getTitle());
        assertEquals("She is crazy", foundEntry.getBody());

    }

    @Test
    public void entriesBodyCanBeUpdatedTest(){
        danielDiary.unlockWith("correctPassword");
        assertFalse(danielDiary.isLocked());
        danielDiary.write("My love life","she is a liar");
        assertEquals(1,danielDiary.numberOfEntries());

        danielDiary.write("My love life","she is a liar");
        assertEquals(2,danielDiary.numberOfEntries());

        danielDiary.write("My love life","she is a liar");
        assertEquals(3,danielDiary.numberOfEntries());

//        danielDiary.deleteEntryWithId(1);
//        danielDiary.updateBodyEntry(1);
        danielDiary.write("I love java so much","it makes me happy");
//        danielDiary.deleteEntryWithId(1);
        assertEquals(3,danielDiary.numberOfEntries());



    }

    @Test
    public void entriesCanBeDeletedByIdTest(){


        danielDiary.unlockWith("correctPassword");

        assertFalse(danielDiary.isLocked());


        danielDiary.write("My love life","she is a liar");

        assertEquals(1,danielDiary.numberOfEntries());
        danielDiary.write("My love life","she is a liar");

        assertEquals(2,danielDiary.numberOfEntries());
//        danielDiary.write("My love life","she is a liar");

//        assertEquals(3,danielDiary.numberOfEntries());
        danielDiary.deleteEntryWithId(2);
        assertEquals(1, danielDiary.numberOfEntries());


//        Entry foundEntry = danielDiary.deleteEntryWithId(1);
//
//        assertEquals(0,foundEntry.getId());




    }
//    @Test
//    public void writingToLockedDiaryThrowsExceptionTest(){
//        assertTrue(danielDiary.isLocked());
//
//        assertThrows(Exception.class,()-> danielDiary.write("My break up with my girlfriend",
//                "She is crazy"));
//    }
}
