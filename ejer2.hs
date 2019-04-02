perms:: [a] -> [[a]]
perms [] = [[]]
perms (x:xs) = concat(map  (interline x) (perms xs))

sublista :: [a] -> [[a]]
sublista [] = [[]]
--sublista (x:xs) = (sublista xs) ++ (map ([x]++) (sublista xs))
sublista (x:xs) = (sxs) ++ (map ([x]++) (sxs))
				 where sxs = sublista xs

interline :: a -> [a] -> [[a]]
interline x [] = [[x]]
interline x (y:ys) = (x:y:ys) : map (\t->y:t) (interline x ys)

borrar :: Eq a => [a]-> a -> [a]
borrar [] x = [] 
borrar (x:xs) n | x == n = xs
                | otherwise = x: borrar xs n

-- alto monono

slowSort :: (Ord a) => [a] -> [a]
slowSort [] = []
slowSort [x] = [x]
slowSort a = getSorted (perms a)

getSorted :: (Ord a) => [[a]] -> [a]
getSorted [[]] = []
getSorted (x:xs) | sorted x = x
			  	 | otherwise = getSorted xs

sorted :: (Ord a) => [a] -> Bool
sorted [] = True
sorted [x] = True
sorted (x:y:ys) = (x<y && sorted (y:ys))

