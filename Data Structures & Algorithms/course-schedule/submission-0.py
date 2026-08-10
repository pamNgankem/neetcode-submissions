class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        preMap = {i: [] for i in range(numCourses)}

        for co, pre in prerequisites:
            preMap[co].append(pre)

        path = set()

        def dfs(source):
            if source in path:
                return False

            if preMap[source] == []:
                return True

            path.add(source)

            for pre in preMap[source]:
                if not dfs(pre):
                    return False
            
            path.remove(source)
            preMap[source] = []
            return True

        for c in range(numCourses):
            if not dfs(c):
                return False

        return True