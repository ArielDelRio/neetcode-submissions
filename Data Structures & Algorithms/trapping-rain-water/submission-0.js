class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
         if (height.length <= 2) return 0;

    let totalWater = 0;

    let previousBarIndex = 0;

    let currentWater = 0;

    // LEFT -> RIGHT

    for (let current = 1; current < height.length; current++) {

        if (height[current] >= height[previousBarIndex]) {

            totalWater += currentWater;

            currentWater = 0;

            previousBarIndex = current;

        } else {

            currentWater +=

                height[previousBarIndex] - height[current];

        }

    }

    // Save unresolved region

    const resolvedContainerIndex = previousBarIndex;

    // RIGHT -> LEFT

    previousBarIndex = height.length - 1;

    currentWater = 0;

    for (

        let current = height.length - 2;

        current >= resolvedContainerIndex;

        current--

    ) {

        if (height[current] >= height[previousBarIndex]) {

            totalWater += currentWater;

            currentWater = 0;

            previousBarIndex = current;

        } else {

            currentWater +=

                height[previousBarIndex] - height[current];

        }

    }

    return totalWater;
    }
}
