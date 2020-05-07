package labelState;

public class labelStateQuery {
    public static void main(String[] args) {
        String searchString = "Bob the builder";
        String queryString = "Bob th";
        boolean found = false;
        lookForQuery:
        for (int i = 0; i < searchString.length() - (queryString.length() - 1); i++){
            String looking = searchString.substring(i, i + queryString.length());
            if (looking.equals(queryString)) {
                found = true;
//                System.out.println("the loop has stopped");
                break;
            }
        }
        System.out.println("Is the string '" + queryString + "' inside of '"+searchString +"'? " + found);
    }
}
