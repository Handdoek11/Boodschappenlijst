package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f37240a;

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f37241b;

    protected abstract f b(String str);

    protected abstract Set c();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f37240a = copyOnWriteArrayList;
        f37241b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(String str, boolean z7) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f37241b;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(j jVar) {
        Objects.requireNonNull(jVar, "provider");
        synchronized (j.class) {
            try {
                for (String str : jVar.c()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((j) f37241b.putIfAbsent(str, jVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + jVar);
                    }
                }
                Collections.unmodifiableSet(new HashSet(f37241b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f37240a.add(jVar);
    }
}
