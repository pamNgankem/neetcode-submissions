class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = defaultdict(list)

        for str in strs:
            sortedS = "".join(sorted(str))
            dic[sortedS].append(str)


        return list(dic.values())