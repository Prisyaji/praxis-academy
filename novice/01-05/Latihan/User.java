public class User{
     // Variabbel area
     private String username;
     private String password;
     // Construct area
     public User(String username, String password) {
         this.username = username;
         this.password = password;
     }
     // method area
     public String getPassword() {
         return password;
     }
     public void setPassword(String password) {
         this.password = password;
     }
     public String getUsername() {
         return username;
     }
     public void setUsername(String username) {
         this.username = username;
     }
     public class CurrentUser {
         // variabel area
         private static User activeUser = null;
     }
     // construct area
     // untuk mencegah pembuatan object
     private CurrentUser() {}
 
     //method area
     public static User User() {
         return activUser;
     }
     public static void login(String username, String password){
         activUser = new User(username, password);
     }
     public static void logout() {
         activeUser = null;
     }
     public static boolean isLoggedIn() {
         if(activeUser == null) {
             return false;
         } else {
             return true;
         }
     }
     
    }
 
}
   
