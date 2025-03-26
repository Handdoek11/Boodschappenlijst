package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes3.dex */
final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    private final Set f37239c;

    i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f37239c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set c() {
        return this.f37239c;
    }

    @Override // j$.time.zone.j
    protected final f b(String str) {
        if (this.f37239c.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: " + str);
    }
}
