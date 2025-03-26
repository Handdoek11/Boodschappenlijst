package K0;

import androidx.datastore.preferences.protobuf.AbstractC0897v;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.o0;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0897v implements N {
    private static final f DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.i();

    public static final class a extends AbstractC0897v.a implements N {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            v();
            ((f) this.f9580s).J().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final F f3598a = F.d(o0.b.f9469B, "", o0.b.f9471D, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0897v.F(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map J() {
        return L();
    }

    private G L() {
        if (!this.preferences_.p()) {
            this.preferences_ = this.preferences_.s();
        }
        return this.preferences_;
    }

    private G M() {
        return this.preferences_;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f O(InputStream inputStream) {
        return (f) AbstractC0897v.D(DEFAULT_INSTANCE, inputStream);
    }

    public Map K() {
        return DesugarCollections.unmodifiableMap(M());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0897v
    protected final Object s(AbstractC0897v.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3597a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0897v.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f3598a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v7 = PARSER;
                if (v7 == null) {
                    synchronized (f.class) {
                        try {
                            v7 = PARSER;
                            if (v7 == null) {
                                v7 = new AbstractC0897v.b(DEFAULT_INSTANCE);
                                PARSER = v7;
                            }
                        } finally {
                        }
                    }
                }
                return v7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
