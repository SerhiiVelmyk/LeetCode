package easy;

import java.util.*;
import java.util.stream.Collectors;

public class easyTasks1 {

    public static void main(String[] args) {
        int[] array1 = {5, 2, 3, 5, 5, 5, 6, 5, 8, 5, 10};
        String[] array2 = {"Alaska", "you", "Test"};
        int[] array3 = {4, 1, 2, 1, 2};
        int[] array4 = {1, 0, 0, 1, 1, 0, 1, 1, 1, 1};
        int[] array5 = {0, 1, 0, 1, 0, 1};
        int[] array6 = {3, 2, 3};
        int[] array7 = {1, 2, 3, 1};
        int[] array8 = {1, 2, 3, 4, 6, 7};
        int[] array9 = {-1, -2, -3};

        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("a", "cdebbab"));
        System.out.println(containsDuplicate(array7));
        System.out.println(isAnagram("test", "stet"));
        System.out.println(isAnagram("abb", "aba"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCM"));
        System.out.println(majorityElement(array6));
        System.out.println(titleToNumber("AAA"));
        System.out.println(titleToNumber("ABA"));
        System.out.println(Arrays.toString(intersection(array3, array4)));
        System.out.println(rotatedDigits(857));
        System.out.println(rotatedDigits(10000));
        System.out.println(findDisappearedNumbers(array1));
        System.out.println(detectCapitalUse("Test"));
        System.out.println(detectCapitalUse("AAA"));
        System.out.println(findTheDifference("a", "aa"));
        System.out.println(findTheDifference("aabbbaaa", "aabbbbaaa"));
        System.out.println(addDigits(789));
        System.out.println(addDigits(1));
        System.out.println(letterCasePermutation("abc"));
        System.out.println(letterCasePermutation("1a2b"));
        System.out.println(letterCasePermutation("1a2b5c"));
        System.out.println(findMaxConsecutiveOnes(array4));
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("AA BB CC"));
        System.out.println(singleNumber(array3));
        System.out.println(fizzBuzz(20));
        System.out.println(fizzBuzz(-20));
        System.out.println(reverseWords("Test Automation Engineer"));
        System.out.println(reverseWords("AA BB CC"));
        System.out.println(reverseString("Test Automation Engineer"));
        System.out.println(reverseString("AA BB CC"));
        System.out.println(Arrays.toString(findWords(array2)));
        System.out.println(selfDividingNumbers(4, 129));
        System.out.println(selfDividingNumbers(123, 190));
        System.out.println(judgeCircle("LR"));
        System.out.println(judgeCircle("DDR"));
        System.out.println(Arrays.toString(sortArrayByParity(array1)));
        System.out.println(isNumberPrime(10));
        System.out.println(isNumberPrime(11));
        System.out.println(revertNumber(123));
        System.out.println(revertNumber(226));
        System.out.println(sum(3));
        System.out.println(sum(33));
        System.out.println(max(1, 5, 2, 3, 6, 0, 2));
        System.out.println(middle(1, 5, 2, 3, 6, 0, 2));
        System.out.println(countLetter("abbreviation nato", "a"));
        System.out.println(countLetter("bbbb", "b"));
        System.out.println(factorial(4));
        moveZeroes(array5);
        System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
        System.out.println(canConstruct("aa", "abb"));
        System.out.println(Arrays.toString(constructRectangle(15)));
        System.out.println(Arrays.toString(constructRectangle(16)));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("acaadcad"));
        System.out.println(Arrays.toString(findRelativeRanks(array8)));
        System.out.println(missingNumber(array8));
        System.out.println(checkRecord("ALPPPA"));
        System.out.println(checkRecord("LALL"));
        System.out.println(maximumProduct(array9));
        int[] array10 = {7, 8, 13, 15};
        int[] array11 = {10, 8, 12, 20};

        System.out.println(isRectangleOverlap(array10, array11));
        System.out.println(mostCommonWord("Bob hit a ball,", new String[]{"hit"}));
        System.out.println(mostCommonWord("test", new String[]{"a"}));
        System.out.println(addStrings("312", "123"));
        System.out.println(addStrings("99", "99"));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(8));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(2_147_483_647));
        int[] array12 = {1, 2, 3, 4};
        int[] array13 = {1, 3, 2, 2, 5, 2, 3, 7};
        int[] array14 = {1, 3, 5, 7};
        int[] array15 = {1, 2, 3, 3, 1, -14, 13, 4};
        int[] array16 = {1, 4, 1, 3, 1, -14, 1, -13};
        System.out.println(findLHS(array12));
        System.out.println(findLHS(array13));
        System.out.println(findLHS(array14));
        System.out.println(findLHS(array15));
        System.out.println(findLHS(array16));
        System.out.println(isUgly(7));
        System.out.println(isUgly(15));
        System.out.println(searchInsert(array12, 2));
        System.out.println(searchInsert(array14, 5));
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("aA"));
        int[] array17 = {1, 5, 3, 2, 2, 7, 6, 4, 8, 9};
        int[] array18 = {1, 3, 4, 5, 5, 6};
        int[] array19 = {3, 2, 3};
        System.out.println(Arrays.toString(findErrorNums(array17)));
        System.out.println(Arrays.toString(findErrorNums(array18)));
        System.out.println(Arrays.toString(twoSum(array10, 22)));
        System.out.println(Arrays.toString(twoSum(array6, 6)));
        System.out.println(Arrays.toString(twoSum(array19, 6)));

        int[] array20 = {3, 2, 3, 4, 1};
        int[] array21 = {-1, -1, -1, 0, 1, 1};
        System.out.println(pivotIndex(array20));
        System.out.println(pivotIndex(array21));
        System.out.println(isPalindrome(6));
        System.out.println(isPalindrome(120));

        int[] array22 = {1, 0, 0, 0};
        System.out.println(maxDistToClosest(array22));
        System.out.println(repeatedSubstringPattern("test"));
        System.out.println(repeatedSubstringPattern("ababab"));
    }

    private static boolean repeatedSubstringPattern(String s) {
        boolean returnValue = false;
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = s.toCharArray();
        int arrayLength = array.length;
        if (arrayLength == 1)
            return false;

        if (arrayLength % 2 == 0) {
            char[] array1 = Arrays.copyOfRange(array, 0, arrayLength / 2);
            char[] array2 = Arrays.copyOfRange(array, arrayLength / 2, arrayLength);
            if (Arrays.equals(array1, array2))
                return true;
        }

        if (arrayLength % 3 == 0) {
            char[] array1 = Arrays.copyOfRange(array, 0, arrayLength / 3);
            char[] array2 = Arrays.copyOfRange(array, arrayLength / 3, 2 * arrayLength / 3);
            char[] array3 = Arrays.copyOfRange(array, 2 * arrayLength / 3, arrayLength);
            if (Arrays.equals(array1, array2) && Arrays.equals(array1, array3))
                return true;
        }

        for (int i = 0; i < arrayLength / 4 + 1; i++) {
            if (s.split(String.valueOf(stringBuilder.append(array[i]))).length == 0) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }

    private static int maxDistToClosest(int[] seats) {
        int returnedValue = 0;
        int temp = 0;
        int tempStart = 0;
        int tempEnd = 0;

        for (int seat : seats) {
            if (seat == 0) {
                tempStart++;
            } else {
                if (tempStart > seats.length / 2) {
                    return tempStart;
                }
                break;
            }
        }

        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 0) {
                tempEnd++;
            } else {
                if (tempEnd > seats.length / 2) {
                    return tempEnd;
                }
                break;
            }
        }

        for (int seat : seats) {
            if (seat == 0) {
                temp++;
                if (temp > returnedValue) {
                    returnedValue = temp;
                }
            } else {
                temp = 0;
            }
        }


        if (returnedValue % 2 == 0) {
            returnedValue = returnedValue / 2;
        } else {
            returnedValue = returnedValue / 2 + 1;
        }

        return Math.max(Math.max(tempStart, tempEnd), returnedValue);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;
        int[] array = new int[10];
        int sizeOfArray = 0;

        for (int i = 0; i < 10 & x > 0; i++) {
            array[i] = x % 10;
            x = x / 10;
            sizeOfArray++;
        }

        for (int i = 0; i < sizeOfArray - 1; i++, sizeOfArray--) {
            if (array[i] != array[sizeOfArray - 1]) {
                return false;
            }
        }

        return true;
    }


    private static int pivotIndex(int[] nums) {
        int value = -1;
        if (nums.length < 3) return value;

        for (int i = 0; i < nums.length; i++) {

            int[] array1 = Arrays.copyOfRange(nums, 0, i);
            int[] array2 = Arrays.copyOfRange(nums, i + 1, nums.length);

            if (arraySum(array1) == arraySum(array2)) {
                value = i;
                break;
            }
        }

        return value;
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }


    private static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean foundTheSameValue = false;
        int j = -1;
        int temp = -1;

        if (nums.length == 2 && nums[0] == nums[1]) {
            return new int[]{0, 1};
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != j && !foundTheSameValue) {
                for (j = 0; j < nums.length; j++) {
                    if (j != i && nums[i] + nums[j] == target) {
                        if (nums[i] != nums[j] && i > j) {
                            output[0] = j;
                            output[1] = i;
                            return output;
                        } else if (nums[i] != nums[j] && i < j) {
                            output[0] = i;
                            output[1] = j;
                            return output;
                        } else {
                            output[0] = i;
                            foundTheSameValue = true;
                            temp = nums[j];
                            break;
                        }
                    }
                }
            }

            if (foundTheSameValue && nums[i] == temp) {
                output[1] = i;
            }
        }

        return output;
    }

    private static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] outArray = new int[2];
        outArray[1] = nums.length;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                outArray[0] = nums[i];
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            count++;
            if (nums[i] != count) {
                if (nums[0] == 2) {
                    outArray[1] = 1;
                    break;
                } else if (count > nums[i]) {
                    if (i < nums[nums.length - 1] && count == nums[i + 1]) {
                        count--;
                    } else {
                        outArray[1] = count;
                        break;
                    }
                } else {
                    outArray[1] = count;
                    break;
                }
            }
        }

        return outArray;
    }


    private static String reverseVowels(String s) {
        char[] array = s.toCharArray();
        List<Character> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (Character ch : array) {
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o'
                    || ch == 'A' || ch == 'E' || ch == 'U' || ch == 'I' || ch == 'O') {
                list.add(ch);
            }
        }

        int listSize = list.size() - 1;

        for (char anArray : array) {

            if (anArray == 'a' || anArray == 'e' || anArray == 'u' || anArray == 'i' || anArray == 'o'
                    || anArray == 'A' || anArray == 'E' || anArray == 'U' || anArray == 'I' || anArray == 'O') {
                stringBuilder.append(list.get(listSize--));
            } else {
                stringBuilder.append(anArray);
            }

        }

        return String.valueOf(stringBuilder);
    }

    private static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }

        return target;
    }

    private static boolean isUgly(int num) {
        if (num < 1) {
            return false;
        } else if (num < 7) {
            return true;
        }
        for (int i = num / 2; i > 3 / 2; i--) {
            if (num % i == 0) {
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue;
                return false;
            }
        }

        return num % 2 == 0 || num % 3 == 0 || num % 5 == 0;
    }

    private static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int prevCount = 1, res = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (i > 0 && nums[i] - nums[i - 1] == 1) {
                for (; i < nums.length - 1 && nums[i] == nums[i + 1]; i++) {
                    count++;
                }
                res = Math.max(res, count + prevCount);
                prevCount = count;
            } else {
                for (; i < nums.length - 1 && nums[i] == nums[i + 1]; i++) {
                    count++;
                }
                prevCount = count;
            }
        }
        return res;
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 2_147_483_647) return false;

        for (int i = 0; i < 32; i++) {
            if ((int) Math.pow(2, i) == n) {
                return true;
            }
        }

        return false;
    }

    private static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int value1 = 1, value2 = 2, value3 = 0;

        for (int i = 2; i < n; i++) {
            value3 = value1 + value2;
            value1 = value2;
            value2 = value3;
        }

        return value3;
    }


    private static String addStrings(String num1, String num2) {
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int value = 0;
        StringBuilder finalString = new StringBuilder();

        char[] arrayBigger = array1.length >= array2.length ? array1 : array2;
        char[] arraySmaller = array2.length <= array1.length ? array2 : array1;

        for (int i = arrayBigger.length - 1; i >= 0; i--) {
            value += Character.getNumericValue(arrayBigger[i]);

            if (arrayBigger.length <= arraySmaller.length + i) {
                value += Character.getNumericValue(arraySmaller[i - (arrayBigger.length - arraySmaller.length)]);
            }

            if (value < 10) {
                finalString.append(value);
                value = 0;
            } else {
                String st = String.valueOf(value);
                int in = Character.getNumericValue(st.toCharArray()[1]);
                finalString.append(in);
                value = 1;
                if (i == 0) {
                    finalString.append(1);
                }
            }
        }

        return String.valueOf(finalString.reverse());
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]", "")
                .split(" ")));
        list.removeIf(""::equals);
        Map<String, Integer> map = new HashMap<>();

        for (String st : banned) {
            list.removeIf(st::equals);
        }

        for (String aList : list) {
            aList = aList.trim();
            if (map.containsKey(aList)) {
                int count = map.get(aList) + 1;
                map.put(aList, count);
            } else {
                map.put(aList, 1);
            }
        }

        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    private static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||
                rec1[3] <= rec2[1] ||
                rec1[0] >= rec2[2] ||
                rec1[1] >= rec2[3]);
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int value1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int value2 = nums[nums.length - 1] * nums[0] * nums[1];

        return value1 > value2 ? value1 : value2;
    }

    private static boolean checkRecord(String s) {
        int aCount = 0;
        int lCount = 0;
        char[] array = s.toCharArray();

        for (Character ch : array) {
            if (ch == 'A') {
                aCount++;
                lCount = 0;
            } else if (ch == 'L') {
                lCount++;
            } else {
                lCount = 0;
            }

            if (aCount > 1 || lCount > 2) {
                return false;
            }
        }

        return true;
    }

    private static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;

        for (int i : nums)
            sum -= i;

        return sum;
    }

    private static String[] findRelativeRanks(int[] nums) {
        int arrayLength = nums.length;
        int arrayLength2 = nums.length;
        String[] returnedArray = new String[arrayLength];
        int[][] array = new int[2][arrayLength];
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        System.arraycopy(sorted, 0, array[0], 0, arrayLength);

        for (int i = 0; i < arrayLength; i++) {
            array[1][i] = arrayLength2--;
        }

        for (int i = 0; i < arrayLength; i++) {
            int position = array[1][Arrays.binarySearch(array[0], nums[i])];

            if (position == 1) {
                returnedArray[i] = "Gold Medal";
            } else if (position == 2) {
                returnedArray[i] = "Silver Medal";
            } else if (position == 3) {
                returnedArray[i] = "Bronze Medal";
            } else {
                returnedArray[i] = String.valueOf(position);
            }
        }

        return returnedArray;
    }

    private static int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        if (s.length() == 1) {
            return 0;
        } else if (s.length() > 1) {
            for (Character ch : array) {
                if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                    return s.lastIndexOf(ch);
                }
            }
        }
        return -1;
    }


    private static int[] constructRectangle(int area) {
        int[] returnedArray = new int[2];
        List<Integer> list = new ArrayList<>();

        if (area == 1) {
            return new int[]{1, 1};
        }

        for (int i = 1; i <= area; i++) {
            if (area % i == 0) {
                list.add(i);
                list.add(area / i);
            }
        }

        int halfListSize = list.size() / 2;
        int secondValue = halfListSize % 2 != 0 ? halfListSize - 1 : halfListSize + 1;

        returnedArray[0] = list.get(halfListSize);
        returnedArray[1] = list.get(secondValue);


        return returnedArray;
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        List<String> listMagazine = new LinkedList<>(Arrays.asList(magazine.split("")));
        char[] arrayRansomNote = ransomNote.toCharArray();

        for (Character ch : arrayRansomNote) {
            String letter = String.valueOf(ch);

            if (listMagazine.contains(letter)) {
                listMagazine.remove(letter);
            } else {
                return false;
            }

        }
        return true;
    }

    private static boolean rotateString(String A, String B) {
        if (A.length() == 0 && B.length() == 0) {
            return true;
        }
        if (A.length() != B.length()) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = A.toCharArray();

        for (int j = 1; j <= array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                stringBuilder.append(array[i]);
            }
            stringBuilder.append(array[0]);
            if (String.valueOf(stringBuilder).contains(B)) {
                return true;
            }
        }

        return false;
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;

//        for (int num : nums) {
//            int count = 0;
//            for (int num1 : nums) {
//                if (num == num1) {
//                    count++;
//                }
//            }
//            if (count > 1) {
//                return true;
//            }
//        }
//
//        return false;
    }

    private static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if (sArray.length != tArray.length) {
            return false;
        }

        boolean isAnagram = true;

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }

    private static int romanToInt(String s) {
        int returnedValue = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        char[] array = s.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            String builder = String.valueOf(array[i]);
            if (i > 0) {
                builder = array[i - 1] + String.valueOf(array[i]);
            }
            if (map.keySet().contains(builder)) {
                returnedValue += map.get(builder);
                i--;
            } else {
                returnedValue += map.get(String.valueOf(array[i]));
            }
        }

        return returnedValue;
    }

    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int value = nums[0];
        int countBefore = 0;
        int countAfter = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] || i == nums.length - 1) {
                if (countBefore >= countAfter) {
                    value = nums[i - 1];
                    countAfter = countBefore;
                }
                countBefore = 0;
            } else {
                countBefore++;
            }
        }

        return value;
    }

    private static int titleToNumber(String s) {
        char[] array = s.toCharArray();
        int arrayLength = array.length;
        int outputValue = 0;
        int firstValue = (Character.getNumericValue(array[arrayLength - 1]) - 9);

        if (arrayLength > 1) {
            int j = 1;
            for (int i = arrayLength - 2; i >= 0; i--) {
                int numericValue = Character.getNumericValue(array[i]) - 9;
                int intermediateValue = (int) (numericValue * Math.pow(26, j++));
                outputValue += intermediateValue;
            }
            outputValue += firstValue;
        } else {
            outputValue = firstValue;
        }

        return outputValue;
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2 & !list.contains(n1)) {
                    list.add(n1);
                    break;
                }
            }
        }

        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    private static int rotatedDigits(int N) {
        boolean digitIsGood;
        int goodDigitCount = 0;
        int count018Digits;
        int arrayLength;
        char[] array;
        boolean contains2569;
        boolean contains018;

        for (int i = 1; i <= N; i++) {
            count018Digits = 0;
            arrayLength = 0;
            digitIsGood = true;
            array = String.valueOf(i).toCharArray();

            for (Character ch : array) {
                arrayLength = array.length;
                contains2569 = (ch == '2') || (ch == '5') || (ch == '6') || (ch == '9');
                contains018 = (ch == '0') || (ch == '1') || (ch == '8');
                if (contains018) {
                    count018Digits++;
                }

                if (!(contains2569 || contains018)) {
                    digitIsGood = false;
                    break;
                }
            }

            if (digitIsGood & arrayLength != count018Digits) {
                goodDigitCount++;
            }
        }

        return goodDigitCount;
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> range = IntStream.range(1, nums.length + 1).boxed().collect(Collectors.toList());
//        for (Integer i : nums) {
//            range.remove(i);
//        }
//        return range;

        boolean[] mask = new boolean[nums.length];
        for (int num : nums) {
            mask[num - 1] = true;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!mask[i]) {
                list.add(i + 1);
            }
        }

        return list;
    }

    private static boolean detectCapitalUse(String word) {
        boolean isLowerCase = word.equals(word.toLowerCase());
        boolean isUpperCase = word.equals(word.toUpperCase());
        char[] array = word.toCharArray();
        boolean isFirstCharacterCapital = Character.isUpperCase(array[0]);
        boolean isAllOtherLowerCase = true;

        for (int i = 1; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                isAllOtherLowerCase = false;
                break;
            }
        }

        return isLowerCase | isUpperCase | (isFirstCharacterCapital & isAllOtherLowerCase);
    }

    private static char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }

        return tArray[tArray.length - 1];
    }

    private static void moveZeroes(int[] nums) {
        int zeroCount = Arrays.toString(nums).split(", 0").length;
        for (int k = 0; k < zeroCount; k++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
        }
    }

    private static int addDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int returnedValue = 0;

        if (digits.length == 1) {
            return num;
        }

        while (digits.length > 1) {
            returnedValue = 0;
            for (Character ch : digits) {
                int value = Character.getNumericValue(ch);
                returnedValue = value + returnedValue;
            }
            digits = String.valueOf(returnedValue).toCharArray();
        }

        return returnedValue;
    }

    private static List<String> letterCasePermutation(String S) {
        S = S.toLowerCase();
        List<String> outputList = new ArrayList<>();
        int combinations = 1 << S.length();
        for (int i = 0; i < combinations; i++) {
            char[] result = S.toCharArray();
            for (int j = 0; j < S.length(); j++) {
                if (((i >> j) & 1) == 1) {
                    result[j] = Character.toUpperCase(S.charAt(j));
                }
            }
            String value = new String(result);
            if (!outputList.contains(value)) {
                outputList.add(value);
            }
        }

        return outputList;
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxNumber = 0, maxNumberTemp = 0;

        for (int num : nums) {
            if (num == 1) {
                maxNumberTemp++;
            } else {
                maxNumberTemp = 0;
            }
            if (maxNumberTemp > maxNumber) {
                maxNumber = maxNumberTemp;
            }
        }

        return maxNumber;
    }

    private static String toGoatLatin(String S) {
        StringBuilder returnedString = new StringBuilder();
        char ch;
        String[] words = S.split(" ");
        int aCount = 1;

        for (int i = 0; i < words.length; i++) {
            ch = words[i].toLowerCase().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') {
                returnedString.append(words[i]);
            } else {
                char[] arrayInput = words[i].toCharArray();
                for (int k = 1; k < arrayInput.length; k++) {
                    returnedString.append(arrayInput[k]);
                }
                returnedString.append(arrayInput[0]);
            }
            returnedString.append("ma");

            for (int j = 0; j < aCount; j++) {
                returnedString.append("a");
            }
            aCount++;

            if (i != words.length - 1) {
                returnedString.append(" ");
            }
        }

        return String.valueOf(returnedString);
    }

    private static int singleNumber(int[] nums) {
        List<Integer> integerList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());

        for (int i = 1; i < integerList.size(); i += 2) {
            if (!integerList.get(i).equals(integerList.get(i - 1))) {
                return integerList.get(i - 1);
            }
        }
        return integerList.get(integerList.size() - 1);
    }

    private static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        StringBuilder stringBuilder;

        for (int i = 1; i <= n; i++) {
            stringBuilder = new StringBuilder();

            if ((i % 3 == 0) | (i % 5 == 0)) {
                if (i % 3 == 0) {
                    stringBuilder.append("Fizz");
                }

                if (i % 5 == 0) {
                    stringBuilder.append("Buzz");
                }

                output.add(String.valueOf(stringBuilder));

            } else {
                output.add(String.valueOf(i));
            }
        }

        return output;
    }

    private static String[] findWords(String[] words) {
        List<String> upperLetters = Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p");
        List<String> middleLetters = Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l");
        List<String> lowerLetters = Arrays.asList("z", "x", "c", "v", "b", "n", "m");
        List<String> characters;
        List<String> output = new ArrayList<>();

        for (String word : words) {
            characters = Arrays.asList(word.toLowerCase().split(""));
            if (upperLetters.containsAll(characters) || middleLetters.containsAll(characters)
                    || lowerLetters.containsAll(characters)) {
                output.add(word);
            }
        }

        return output.toArray(new String[0]);
    }

    private static String reverseWords(String s) {
        String[] arrayWords = s.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < arrayWords.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(arrayWords[i]);
            output.append(stringBuilder.reverse());

            if (i != arrayWords.length - 1) {
                output.append(" ");
            }
        }

        return String.valueOf(output);
    }

    private static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);

        return String.valueOf(stringBuilder.reverse());
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            Integer newInt = i;
            boolean selfDivided = false;
            char[] array = newInt.toString().toCharArray();

            if (Arrays.toString(array).contains("0")) {
                continue;
            }

            for (Character character : array) {
                if (i % Integer.parseInt(character.toString()) == 0)
                    selfDivided = true;
                else {
                    selfDivided = false;
                    break;
                }
            }

            if (selfDivided) {
                output.add(i);
            }
        }

        return output;
    }

    private static boolean judgeCircle(String moves) {
        char[] array = moves.toCharArray();

        int i = 0, j = 0;

        for (Character action : array) {
            switch (action.toString()) {
                case "L":
                    i--;
                    break;
                case "R":
                    i++;
                    break;
                case "U":
                    j--;
                    break;
                case "D":
                    j++;
                    break;
            }

        }

        return i == 0 & j == 0;

    }

    private static int[] sortArrayByParity(int[] array) {
        int arrayLength = array.length;
        int[] newArray = new int[arrayLength];
        int j = 0;

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                newArray[j++] = anArray;
            } else {
                newArray[--arrayLength] = anArray;
            }
        }
        return newArray;
    }

    private static boolean isNumberPrime(int number) {
        boolean isPrime = true;

        if (number < 4) {
            return false;
        }

        for (int i = number / 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

    private static int revertNumber(Integer number) {
        String[] array = number.toString().split("");
        StringBuilder revertedNumber = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            revertedNumber.append(array[array.length - i - 1]);
        }

        return Integer.parseInt(revertedNumber.toString());
    }

    private static int sum(Integer number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i * i;
        }

        return sum;
    }

    private static int max(Integer... array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    private static int countLetter(String text, String letter) {
        int i = 0;
        String[] array = text.split("");

        for (String anArray : array) {
            if (letter.equals(anArray)) {
                i++;
            }
        }

        return i;
    }

    private static double middle(Integer... numbers) {
        double sum = 0;

        for (Integer number : numbers) {
            sum = sum + number;
        }

        return sum / numbers.length;
    }

    private static long factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
