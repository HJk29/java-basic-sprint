package javabasic.example6;

public class example6_1 {
    public static void main(String[] args) {
        //- **`StringUtil`** 클래스를 생성하세요. 이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.
        //- 다음 기능을 수행하는 메서드를 **`StringUtil`** 클래스 내에 작성하세요:
        //    - **`reverse`**: 하나의 **`String`**을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
        //    - **`concat`**: 두 개의 **`String`**을 매개변수로 받아 이를 연결한 결과를 반환합니다.
        //    - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.

        StringUtil method = new StringUtil();
        System.out.printf("reverse 메소드에 \"reverse\"입력: %s\n", method.reverse("reverse"));
        System.out.printf("concat 메소드에 \"con\" \"cat\"입력: %s\n", method.concat("con", "cat"));
        System.out.printf("contains 메소드에 \"contains\", \'a\'입력: %s\n", method.contains("contains", 'a'));


    }

    public static class StringUtil
    {
        public String reverse(String str)
        {
            String reverse= "";
            for(int i = str.length()-1; i >=0; i--)
            {
                reverse+=str.charAt(i);
            }
            return reverse;
        }

        public String concat(String str1, String str2)
        {
            return str1 + str2;
        }

        public boolean contains(String str, char c)
        {
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == c) {
                    return true;
                }
            }
            return false;
        }
    }
}
