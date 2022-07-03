// package Seminar_6_Homework;

// public class Task_merge {
//     public static void main(String[] args) {
//         int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
//         int[] result = mergesort(array1);
//         System.out.println(Arrays.toString(result));
//     }

//     public static int[] mergesort(int[] array1) {
//         int[] part1 = Arrays.copyOf(array1, array1.length);
//         int[] part2 = new int[array1.length];
//         int[] result = mergesortInner(part1, part2, 0, array1.length);
//         return result;
//     }

//     public static int[] mergesortInner(int[] part1, int[] part2,
//             int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return part1;
//         }

//         int middle = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergesortInner(part1, part2, startIndex, middle);
//         int[] sorted2 = mergesortInner(part1, part2, middle, endIndex);

//         // Слияние
//         int index1 = startIndex;
//         int index2 = middle;
//         int destIndex = startIndex;
//         int[] result = sorted1 == part1 ? part2 : part1;
//         while (index1 < middle && index2 < endIndex) {
//             result[destIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++]
//                     : sorted2[index2++];
//         }
//         while (index1 < middle) {
//             result[destIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             result[destIndex++] = sorted2[index2++];
//         }
//         return result;
//     }
// }
