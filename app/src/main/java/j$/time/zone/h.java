package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class h implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f37238a;

    h(ArrayList arrayList) {
        this.f37238a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j jVar = (j) j.class.cast(Class.forName(property, true, j.class.getClassLoader()).newInstance());
                j.d(jVar);
                this.f37238a.add(jVar);
                return null;
            } catch (Exception e8) {
                throw new Error(e8);
            }
        }
        j.d(new i());
        return null;
    }
}
