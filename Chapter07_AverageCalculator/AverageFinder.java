public class AverageFinder {
        double computeAverage(int[] intArray) {
            // 코드를 입력하세요.

            /*
            double result = 0;
            for(int i = 0; i < intArray.length; i++) {
                result += intArray[i];
            }

            return result / intArray.length;
            */

            int result = 0;
            for(int i: intArray) {
                result += i;
            }

            return (double) result / intArray.length;
        }
}