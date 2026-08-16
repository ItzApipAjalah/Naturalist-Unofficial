# Naturalist Fabric Fork Bug fix (1.21.11)

This project is a fork of the amazing [Naturalist](https://modrinth.com/mod/naturalist) mod, cloned from the [chaevsfe/Naturalist 1.21.11-fabric branch](https://github.com/chaevsfe/Naturalist/tree/1.21.11-fabric).

## About This Fork

The primary purpose of this fork is to fix several prominent bugs, log spam, and visual glitches present in the original repository for the 1.21.11 Fabric environment.

### Fixed Issues

- **Animation Desyncs & Sluggish Movement**: Fixed an issue where the animation speeds for all mobs (most notably the alligator) were calculated incorrectly, resulting in animations playing at a fraction of their intended speed. Animations are now properly synchronized with the entity's actual movement using standard smoothed walk animation speeds.
- **GeckoLib 4 Resource Path Errors**: Fixed widespread log spam (`Superfluous prefix or suffix found in model resource path`) caused by outdated `GeoModel` paths. The redundant `models/`, `geo/`, `animations/` prefixes and `.geo.json` / `.json` suffixes have been stripped from all entities across the workspace so they correctly comply with GeckoLib 4's strict path resolution.

## Credits

All original assets, concepts, and mod design belong to the Starfish Studios team.
- Original Modrinth Page: [Naturalist](https://modrinth.com/mod/naturalist)
- Original GitHub Repository: [chaevsfe/Naturalist](https://github.com/chaevsfe/Naturalist)
