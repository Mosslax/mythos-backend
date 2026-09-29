package net.s1lentm4ple.mythos.common.file.api;

import java.io.InputStream;
import java.util.*;
import java.util.concurrent.*;

import net.s1lentm4ple.mythos.common.file.entity.*;
import net.s1lentm4ple.mythos.common.file.enums.*;

public final class ContentResolverRegistry {
    // private static final Map<ReferType, List<ContentResolver>> registry = new ConcurrentHashMap<>();

    // public static void register(ContentResolver resolver) {
    //     for (ReferType type : resolver.supportedTypes()) {
    //         ContentResolverRegistry.registry.computeIfAbsent(type, k -> new CopyOnWriteArrayList<>())
    //             .add(resolver);
    //     }
    // }
    // public static void clear() {
    //     ContentResolverRegistry.registry.clear();
    // }

    // public static InputStream resolve(List<Refer> refers) {
    //     for (Refer refer : refers) {
    //         List<ContentResolver> resolvers = ContentResolverRegistry.registry.get(refer.getType());
    //         if (resolvers == null || resolvers.isEmpty()) continue;
    //         for (ContentResolver resolver : resolvers) {
    //             try {
    //                 InputStream is = resolver.resolve(refer);
    //                 if (is != null) return is;
    //             } catch (Exception ignored) {
    //             }
    //         }
    //     }
    //     throw new UnsupportedOperationException("No resolver available for refers: " + refers);
    // }

}
