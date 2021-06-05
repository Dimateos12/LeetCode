class Solution:
    def trimMean(self, arr: List[int]) -> float:
        sorted_arr = sorted(arr)

        percent = int(len(arr) * 0.05)

        length = len(arr)

        arr_answer = sorted_arr[percent:length - percent]

        return sum(arr_answer) / len(arr_answer)