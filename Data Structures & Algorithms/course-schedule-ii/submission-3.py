class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adjacency_list = {i: [] for i in range(numCourses)}

        for course, prereq in prerequisites:
            adjacency_list[course].append(prereq)

        acyclic = set()
        visit = set()
        res = []

        def dfs(course):
            if course in acyclic:
                return False

            if course in visit:
                return True

            acyclic.add(course)

            for prereq in adjacency_list[course]:
                if not dfs(prereq):
                    return False
            res.append(course)

            acyclic.remove(course)
            visit.add(course)
            return True

        for course in range(numCourses):
            if not dfs(course):
                return []

        
        return res