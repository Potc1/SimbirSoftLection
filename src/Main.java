public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Check("A123_", 1);
        System.out.println(CheckPassAndLogin("Potc1_1231242414213213213213", "123D_", "1234"));
    }
    public static  boolean CheckPassAndLogin(String login, String password, String confirm){
        boolean res = true;
        try{
            Check(login, 1);
            Check(password, 2);
            if (password != confirm){
                throw new WrongPasswordException("password and confirmPassword does not equal");
            }
        } catch (WrongLoginException e){
            res = false;
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e1){
            res = false;
            System.out.println(e1.getMessage());
        } finally {
            return res;
        }
        //return true;
    }
    public static void Check(String word, int numberOp) throws WrongPasswordException, WrongLoginException{
        if (word.length() >= 20){
            throw new WrongLoginException("login or pass len is wrong");
        }
        int counterABC = 0;
        int counter123 = 0;
        int counter_ = 0;
        String lowWord = word.toLowerCase();
        switch (numberOp) {
            case 1:
                for (char letter : lowWord.toCharArray()) {
                    if (!((int) letter >= 97 && (int) letter <= 122) && !((int) letter >= 48 && (int) letter <= 57) && (int) letter != 95) {
                        throw new WrongLoginException("login is wrong");
                    }
                    counter_ = (int) letter == 95 ? counter_ + 1 : counter_ + 0;
                    counterABC = (((int) letter >= 97 && (int) letter <= 122) ? (counterABC + 1) : counterABC + 0);
                    counter123 = (int) letter >= 48 && (int) letter <= 57 ? (counter123 + 1) : counter123 + 0;
                }

                if (counterABC == 0 || counter123 == 0 || counter_ == 0) throw new WrongLoginException("login is wrong");
                break;
            case 2:
                for (char letter : lowWord.toCharArray()) {
                    if (!((int) letter >= 97 && (int) letter <= 122) && !((int) letter >= 48 && (int) letter <= 57) && (int) letter != 95) {
                        throw new WrongPasswordException("password is wrong");
                    }
                    counter_ = (int) letter == 95 ? counter_ + 1 : counter_ + 0;
                    counterABC = (((int) letter >= 97 && (int) letter <= 122) ? (counterABC + 1) : counterABC + 0);
                    counter123 = (int) letter >= 48 && (int) letter <= 57 ? (counter123 + 1) : counter123 + 0;
                }

                if (counterABC == 0 || counter123 == 0 || counter_ == 0) throw new WrongPasswordException("password is wrongIF");
                break;
            default:

        }
    }
}