package K0;

import androidx.datastore.preferences.protobuf.AbstractC0877a;
import androidx.datastore.preferences.protobuf.AbstractC0897v;
import androidx.datastore.preferences.protobuf.AbstractC0899x;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.V;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC0897v implements N {
    private static final g DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0899x.b strings_ = AbstractC0897v.t();

    public static final class a extends AbstractC0897v.a implements N {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(Iterable iterable) {
            v();
            ((g) this.f9580s).J(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0897v.F(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(Iterable iterable) {
        K();
        AbstractC0877a.a(iterable, this.strings_);
    }

    private void K() {
        if (this.strings_.x0()) {
            return;
        }
        this.strings_ = AbstractC0897v.A(this.strings_);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0897v
    protected final Object s(AbstractC0897v.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3597a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0897v.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v7 = PARSER;
                if (v7 == null) {
                    synchronized (g.class) {
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
