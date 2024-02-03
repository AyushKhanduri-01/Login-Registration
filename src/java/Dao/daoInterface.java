
package Dao;


public interface daoInterface {
    public int isValid(String email, String password);
    
    public int addUser(pojoUser user);
}
