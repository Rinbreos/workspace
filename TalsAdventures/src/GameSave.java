import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GameSave {

    public static Properties prop = new Properties();

    public void SaveGame(String point){
        try{
            prop.setProperty("Save_Point", point);
            prop.store(new FileOutputStream("config.prop"), null);
        }catch (IOException e){

        }
    }

    public void SaveName(String playerName){
        try{
            prop.setProperty("Save_Name", playerName);
            prop.store(new FileOutputStream("config.prop"), null);
        }catch (IOException e){

        }
    }

    public String LoadGame(){
        String line = "";

        try{
            prop.load(new FileInputStream("config.prop"));
            line = prop.getProperty("Save_Point");
        }catch (IOException e){
            try{
                prop.setProperty("Save_Point", "0");
                prop.store(new FileOutputStream("config.prop"), null);

                try{
                    prop.load(new FileInputStream("config.prop"));
                    line = prop.getProperty("Save_Point");
                }catch (IOException exe){

                }
            }catch (IOException ex){

            }
        }
        return line;
    }

    public String LoadName(){
        String name = "";
        try{
            prop.load(new FileInputStream("config.prop"));
            name = prop.getProperty("Save_Name");
        }catch (IOException e){
            try{
                prop.setProperty("Save_Name", "");
                prop.store(new FileOutputStream("config.prop"), null);

                try{
                    prop.load(new FileInputStream("config.prop"));
                    name = prop.getProperty("Save_Name");
                }catch (IOException exe){

                }
            }catch (IOException ex){

            }
        }
        return name;
    }

}