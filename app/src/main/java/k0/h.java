package K0;

import K0.g;
import androidx.datastore.preferences.protobuf.AbstractC0897v;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.V;

/* loaded from: classes.dex */
public final class h extends AbstractC0897v implements N {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile V PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0897v.a implements N {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(boolean z7) {
            v();
            ((h) this.f9580s).Z(z7);
            return this;
        }

        public a B(double d8) {
            v();
            ((h) this.f9580s).a0(d8);
            return this;
        }

        public a C(float f8) {
            v();
            ((h) this.f9580s).b0(f8);
            return this;
        }

        public a D(int i8) {
            v();
            ((h) this.f9580s).c0(i8);
            return this;
        }

        public a E(long j8) {
            v();
            ((h) this.f9580s).d0(j8);
            return this;
        }

        public a F(String str) {
            v();
            ((h) this.f9580s).e0(str);
            return this;
        }

        public a G(g.a aVar) {
            v();
            ((h) this.f9580s).f0(aVar);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: o, reason: collision with root package name */
        private final int f3608o;

        b(int i8) {
            this.f3608o = i8;
        }

        public static b a(int i8) {
            switch (i8) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0897v.F(h.class, hVar);
    }

    private h() {
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z7) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(double d8) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(float f8) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i8) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(long j8) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(g.a aVar) {
        this.value_ = aVar.r();
        this.valueCase_ = 6;
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String V() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g W() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.L();
    }

    public b X() {
        return b.a(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0897v
    protected final Object s(AbstractC0897v.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3597a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0897v.C(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v7 = PARSER;
                if (v7 == null) {
                    synchronized (h.class) {
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
