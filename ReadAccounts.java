package Assessment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class ReadAccounts {
	public final String url;	

	public ReadAccounts(String url) throws FileNotFoundException{
		// TODO Auto-generated constructor stub
		this.url = url;
	}
	
    public LinkedList<String> getFirstNames() {
        LinkedList<String> firstNames = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                firstNames.add(data[0]); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstNames;
    }
	
    public LinkedList<String> getLastNames() {
        LinkedList<String> lastNames = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                lastNames.add(data[1]); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lastNames;
    }
    
    public LinkedList<Integer> getAccounts() {
        LinkedList<Integer> accountList = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                accountList.add(Integer.parseInt(data[2])); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accountList;
    }

    public LinkedList<Integer> getBalances() {
        LinkedList<Integer> balanceList = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                balanceList.add(Integer.parseInt(data[3])); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return balanceList;
    }
    
   
}