class Solution {
    /**
     * @param {number} numRows
     * @return {number[][]}
     */
    generate(numRows) {
        const pascalTriangle = new Array(numRows);
        pascalTriangle[0] = [1];

        for(let i = 1; i < pascalTriangle.length;i++) {
            let value = new Array(i + 1);
            value[0] = 1;
            value[value.length - 1] = 1;

            for(let j = 1; j < value.length - 1; j++) {
                value[j] = pascalTriangle[i - 1][j - 1] +  pascalTriangle[i-1][j]; 
            }
            pascalTriangle[i]= value;
        }

        return pascalTriangle;
    }
}
