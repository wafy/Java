class oneClick {

    // 제곱
    static double getSqaure(String str1) {
        String val1 = str1.substring(0, str1.length() - 2);
        return Math.pow(Double.parseDouble(val1), 2);
    }

    // 분수
    static double getFraction(String str1) {
        long INTEGER_CRITERIA = 10_000_000_000_000_000L;
        double DOUBLE_CRITERIA = 10_000_000_000_000_000D;

        String val1 = str1.substring(0, str1.length() - 3);
        double result = 1 / Double.parseDouble(val1);
        return (Math.round(result * INTEGER_CRITERIA) / DOUBLE_CRITERIA);  // 소수점 반올림
    }

    // 제곱근
    static double getSqrt(String str1) {
        String val1 = str1.substring(0, str1.length() - 3);
        return Math.sqrt(Double.parseDouble(val1));
    }

}