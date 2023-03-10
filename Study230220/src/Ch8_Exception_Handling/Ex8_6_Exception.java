package Ch8_Exception_Handling;

public class Ex8_6_Exception {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
            // throw new Exception("고의로 발생시켰음");
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        } // end of try catch
        System.out.println("프로그램이 정상 종료 되었습니다.");

    } // end of main

} // end of class