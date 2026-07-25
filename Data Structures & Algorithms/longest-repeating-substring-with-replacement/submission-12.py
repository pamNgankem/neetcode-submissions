class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        #start of the window
        l = 0
        
        # longest sbustring length
        best = 0

        # frequency map
        dictio = defaultdict(int)

        # most freq in a substring
        max_freq = 0

        # explore all our possible windows
        for r in range(len(s)):
            #expand the window
            dictio[s[r]] += 1

            # update the max frequency in the current window if needed
            max_freq= max(max_freq, dictio[s[r]])

            #get the number fo replacements needed in the current window
            replacements = (r-l+1) - max_freq

            # check if the window is valid/or should be considered
            if replacements > k:
                # shrink the windo and explore the next substring
                dictio[s[l]] -= 1
                l += 1
            
            # the window or substring meets the criteria so check its length against the longest one seen so far
            #update the longest lenggth seen so far if needed
            best = max(best, r - l + 1)

        return best



