# FastMathFabric

OptiFine's Fast Math feature re-implemented as a Fabric mod.

## Description

This mod replaces vanilla Minecraft's trigonometric functions with faster,
optimized versions, similar to the "Fast Math" feature found in OptiFine. It
aims to improve performance by reducing the computational cost of math
operations.

## Compatibility

- **Minecraft Version:** 1.21.11
- **Fabric Loader:** Required

## Performance Statistics

### Methodology

The game was allowed to stabilize for 1 minute. FPS data was then collected
every 10 seconds for a total of 10 samples.

### Results

| Environment             | FPS (Without Mod) | FPS (With Mod) | Improvement |
| :---------------------- | :---------------- | :------------- | :---------- |
| **Multiplayer Server**  | 504               | **591**        | +17.2%      |
| **Singleplayer Server** | 665               | **670**        | +0.75%      |

## Installation

1. Install [Fabric Loader](https://fabricmc.net/).
2. Download the `FastMathFabric` jar file.
3. Place the jar file in your `.minecraft/mods` folder.
4. Launch the game using the Fabric profile.

## License

This project is licensed under the [Mozilla Public License Version 2.0](LICENSE).
