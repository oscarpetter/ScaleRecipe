Originally a coding test from Kattis.

You’ve got a recipe which specifies a number of ingredients, 
the amount of each ingredient you will need, and the number of portions it produces. 
But, the number of portions you need is not the same as the number of portions specified in the recipe! 
How can you scale it?

The first line of input contains three integers 'n' and 'x' and 'y' where 'n' is the number of ingredients in the recipe,
'x' is the number of portions that the recipe produces, and 'y' is the number of portions you need.
Each of the next 'n' lines contains a single integer 'a'. These are the amounts of each ingredient needed for the recipe.
The inputs will be chosen so that the amount of each ingredient needed for 'y' portions will be an integer.


Output 'n' lines. On each line output a single integer, which is the amount of that ingredient needed to produce 'y'
portions of the recipe. Output these values in the order of the input.
