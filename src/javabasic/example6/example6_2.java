package javabasic.example6;

public class example6_2 {
    public static void main(String[] args) {
        //- **`concat`** 메서드를 오버로딩하여, 세 개의 **`String`**을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 버전을 추가하세요.
        //- **`contains`** 메서드를 오버로딩하여, 두 개의 **`String`**을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 버전을 추가하세요.

        StringUtil method = new StringUtil();



        System.out.printf("concat 메소드에 \"con\" \"cat\"입력: %s\n", method.concat("con", "cat"));
        System.out.printf("concat 메소드에 \"con\" \"cat\" \"cook\" 입력: %s\n", method.concat("con", "cat", "cook"));
        System.out.printf("contains 메소드에 \"contains\", \'a\'입력: %s\n", method.contains("contains", 'a'));
        System.out.printf("contains 메소드에 \"contains\", \"ont\"입력: %s\n", method.contains("contains", "ont"));


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
            String concat = "";
            concat = str1 + str2;

            return concat;
        }
        public String concat(String str1, String str2, String str3)
        {
            String concat = "";
            concat = str1 + str2+ str3;

            return concat;
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

        public boolean contains(String str_1, String str_2)
        {
            //
                for(int i=0; i<str_1.length(); i++) { // "contains", "nta"

                    if (str_1.charAt(i) == str_2.charAt(0)) {
                        int h = 0;
                        int alpha_cnt = 0;

                        // 내 풀이
//                        for (int j = i; j < i + str_2.length(); j++) {
//                            if (str_1.charAt(j) == str_2.charAt(h++)) {
//                                alpha_cnt++;
//                            }
//                        }
//                        if (alpha_cnt == str_2.length())
//                            return true;

                        // 강사님 풀이
                        for (int j = i; j < i + str_2.length(); j++) {
                            if (str_1.charAt(j) != str_2.charAt(h++)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
        }
    }
}
