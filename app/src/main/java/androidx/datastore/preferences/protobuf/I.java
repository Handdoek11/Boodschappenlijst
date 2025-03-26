package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.F;
import java.util.Map;

/* loaded from: classes.dex */
class I implements H {
    I() {
    }

    private static int i(int i8, Object obj, Object obj2) {
        G g8 = (G) obj;
        F f8 = (F) obj2;
        int i9 = 0;
        if (g8.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : g8.entrySet()) {
            i9 += f8.a(i8, entry.getKey(), entry.getValue());
        }
        return i9;
    }

    private static G j(Object obj, Object obj2) {
        G g8 = (G) obj;
        G g9 = (G) obj2;
        if (!g9.isEmpty()) {
            if (!g8.p()) {
                g8 = g8.s();
            }
            g8.r(g9);
        }
        return g8;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object b(Object obj) {
        ((G) obj).q();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public F.a c(Object obj) {
        return ((F) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Map d(Object obj) {
        return (G) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object e(Object obj) {
        return G.i().s();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public int f(int i8, Object obj, Object obj2) {
        return i(i8, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean g(Object obj) {
        return !((G) obj).p();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Map h(Object obj) {
        return (G) obj;
    }
}
