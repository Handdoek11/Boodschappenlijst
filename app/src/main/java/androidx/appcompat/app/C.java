package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class C {
    private static v0.i a(v0.i iVar, v0.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i8 = 0;
        while (i8 < iVar.g() + iVar2.g()) {
            Locale d8 = i8 < iVar.g() ? iVar.d(i8) : iVar2.d(i8 - iVar.g());
            if (d8 != null) {
                linkedHashSet.add(d8);
            }
            i8++;
        }
        return v0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static v0.i b(v0.i iVar, v0.i iVar2) {
        return (iVar == null || iVar.f()) ? v0.i.e() : a(iVar, iVar2);
    }
}
