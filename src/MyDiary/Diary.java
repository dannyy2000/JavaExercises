package MyDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<Entry> entries ;

    public Diary(List<Entry> entries) {
        this.entries = entries;
    }

    public Entry findEntryById(int id){
        for(Entry entry: entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }

  public int numberOfEntries(){
        return entries.size();
  }

 public void inputIntoDiary(String body,String title){
       int  id = numberOfEntries() + 1;

       Entry addEntry = new Entry(title,id,body);
       entries.add(addEntry);

 }

 public void deleteEntryById(int id){
        entries.remove(findEntryById(id));
 }


}
