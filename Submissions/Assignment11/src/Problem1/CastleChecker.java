package Problem1;

public class CastleChecker {
    private static PeakChecker peakChecker = new PeakChecker();
    private static ValleyChecker valleyChecker = new ValleyChecker();

    public static int checkAvailability(int[] arr){
        int[] shortArr = ArrayUtil.removeDuplicates(arr);
        int castleNumbers = 0;
        for(int i = 0; i < shortArr.length - 1; i++){
            int[] testArr = ArrayUtil.createArray(shortArr, i);
            if(peakChecker.check(testArr) || valleyChecker.check(testArr)){
                castleNumbers ++;
            }
        }
        return castleNumbers;
    }
}