package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f37125a;

    r(Map map) {
        this.f37125a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l8 = (Long) entry2.getKey();
                int i8 = b.f37087c;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l8));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, b.f37086b);
            hashMap.put((v) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, b.f37086b);
    }

    final String a(long j8, v vVar) {
        Map map = (Map) this.f37125a.get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j8));
        }
        return null;
    }
}
